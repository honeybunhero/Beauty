package app.beautyapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class Add_Product extends AppCompatActivity {

    String productType;
    EditText et_product, et_brand;
    Button btn_add;
    LinearLayout ll_brands_added;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_product);

        et_product = findViewById(R.id.et_product);
        et_brand = findViewById(R.id.et_brand);
        btn_add = findViewById(R.id.btn_add);
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

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {

                DataBaseHelper dataBaseHelper;
                try {
                    Toast.makeText(Add_Product.this, "Done", Toast.LENGTH_SHORT).show();
                    BrandButtons();
                } catch (Exception e) {
                    Toast.makeText(Add_Product.this, "Something went wrong!", Toast.LENGTH_SHORT).show();
                }
                dataBaseHelper = new DataBaseHelper(Add_Product.this);

                ProductModel productModel = new ProductModel(et_product.getText().toString(), et_brand.getText().toString(), productType);

                dataBaseHelper.AddOne(productModel);
            }
        });

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