package app.beautyapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.Calendar;

public class Add_Product extends AppCompatActivity {

    String productType;
    EditText et_product, et_brand;
    Button btn_add, btn_date_picker;
    LinearLayout ll_brands_added;
    DatePickerDialog datePickerDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_product);

        et_product = findViewById(R.id.et_product);
        et_brand = findViewById(R.id.et_brand);
        btn_add = findViewById(R.id.btn_add);
        btn_date_picker = findViewById(R.id.btn_date_picker);
        ll_brands_added = findViewById(R.id.ll_brands_added);

        // Gets the extra parameters passed
        Intent intent = getIntent();

        try {
            // pass the StringExtra to the variables
            String product_makeUp = intent.getStringExtra(MakeUp.MAKE_UP_PRODUCT_TYPE_TEXT);
            String product_skinCare = intent.getStringExtra(SkinCare.SKIN_CARE_PRODUCT_TYPE_TEXT);

            if (product_skinCare != null) {
                productType = product_skinCare;
            }

            if (product_makeUp != null) {
                productType = product_makeUp;
            }
        } catch (Exception e) {
            Toast.makeText(this, "Something went wrong", Toast.LENGTH_SHORT).show();
        }

        // TODO THIS SECTION WILL BE MOVED TO A "VIEW" CLASS

        LoadBrands();
        InitiateDatePicker();
        btn_date_picker.setText(GetTodaysDate());

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {

                try {
                    Toast.makeText(Add_Product.this, "Done", Toast.LENGTH_SHORT).show();
                    BrandButtons();
                } catch (Exception e) {
                    Toast.makeText(Add_Product.this, "Something went wrong!", Toast.LENGTH_SHORT).show();
                }

                ProductModel productModel = new ProductModel(-1, et_product.getText().toString(), et_brand.getText().toString(), productType, btn_date_picker.getText().toString());
                AddProduct(productModel);
//                dataBaseHelper.AddOne(productModel);
            }
        });

    }

    private String GetTodaysDate() {
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        month += 1;
        int day = cal.get(Calendar.DAY_OF_MONTH);
        return MakeDateString(day, month, year);
    }

    void AddProduct(ProductModel productModel) {
        DataBaseHelper dataBaseHelper = new DataBaseHelper(Add_Product.this);
        dataBaseHelper.AddOne(productModel);
    }

    void InitiateDatePicker() {
        DatePickerDialog.OnDateSetListener dateSetListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                month = month + 1;
                String date = MakeDateString(day, month, year);
                btn_date_picker.setText(date);
            }
        };
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DAY_OF_MONTH);

        int style = AlertDialog.THEME_HOLO_LIGHT;

        datePickerDialog = new DatePickerDialog(Add_Product.this, style, dateSetListener, year, month, day);


    }

    private String MakeDateString(int day, int month, int year) {
        return year + "/" + GetMonthFormat(month) + "/" + day;
    }

    String GetMonthFormat(int month) {
        if (month == 1) {
            return "JAN";
        }
        if (month == 2) {
            return "FEB";
        }
        if (month == 3) {
            return "MAR";
        }
        if (month == 4) {
            return "APR";
        }
        if (month == 5) {
            return "MAY";
        }
        if (month == 6) {
            return "JUN";
        }
        if (month == 7) {
            return "JUL";
        }
        if (month == 8) {
            return "AUG";
        }
        if (month == 9) {
            return "SEP";
        }
        if (month == 10) {
            return "OCT";
        }
        if (month == 11) {
            return "NOV";
        }
        if (month == 12) {
            return "DEC";
        }
        // DEFAULT SHOULD NEVER HAPPEN
        return "JAN";
    }

    public void OpenDatePicker(View view) {
        datePickerDialog.show();
    }

    void BrandButtons() {

        // Create buttons and names them after the brands the user entered
        // TODO Make the buttons populate from the database. This way the et_brand variable will be checked against the database to see if that
        // TODO brand was already entered before creating a button for it
        final Button btn = new Button(this);

        btn.setText(et_brand.getText().toString());

        if (btn.getText().equals("")) {
            return;
        }
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et_brand.setText(btn.getText().toString().toUpperCase());
            }
        });

        // TODO Making it so the program will iterate through each child of the liner layout in order to prevent duplicate brands from appearing when adding products

//        for (int x = 0; x < ll_brands_added.getChildCount(); x++) {
//            boolean newBrand = true;
//            Button btnNameCheck = (Button) ll_brands_added.getChildAt(x);
//            if (btnNameCheck.getText().equals(et_brand.getText())) {
//                newBrand = false;
//                x = ll_brands_added.getChildCount();
//                return;
//            }
//            else{
//                newBrand = true;
//            }
////            Toast.makeText(Add_Product.this, "" + newBrand, Toast.LENGTH_SHORT).show();
//            Toast.makeText(Add_Product.this, "Currently checking " + x + " " + btnNameCheck.getText() + " " + et_brand.getText(), Toast.LENGTH_SHORT).show();
//        }
        ll_brands_added.addView(btn);
    }

    void LoadBrands() {
        DataBaseHelper db = new DataBaseHelper(this);

        for (int x = 0; x < db.GetAllBrands().size(); x++) {
            final Button btn = new Button(this);
            String currentBrand = db.GetAllBrands().get(x);

            if (currentBrand.equals("")) {
                currentBrand = db.GetAllBrands().get(x + 1);
                btn.setText(currentBrand);
                x++;
            }
            btn.setText(currentBrand);

            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    et_brand.setText(btn.getText().toString().toUpperCase());
                }
            });
            ll_brands_added.addView(btn);
        }
    }
}