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

    String product_makeUp, product_skinCare, productType;
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
            product_makeUp = intent.getStringExtra(MakeUp.MAKE_UP_PRODUCT_TYPE_TEXT);
            product_skinCare = intent.getStringExtra(SkinCare.SKIN_CARE_PRODUCT_TYPE_TEXT);

            if (product_skinCare != null) {
                productType = product_skinCare;
            }

            if (product_makeUp != null) {
                productType = product_makeUp;
            }
        } catch (Exception e) {
            Toast.makeText(this, "Something went wrong", Toast.LENGTH_SHORT).show();
        }

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {

                DataBaseHelper dataBaseHelper;
                try {
                    Toast.makeText(Add_Product.this, "This was a success!", Toast.LENGTH_SHORT).show();
                    BrandButtons();
                } catch (Exception e) {
                    Toast.makeText(Add_Product.this, "Something went wrong!", Toast.LENGTH_SHORT).show();
                }
                dataBaseHelper = new DataBaseHelper(Add_Product.this);

                boolean success = dataBaseHelper.AddOne(et_product.getText().toString(), et_brand.getText().toString(), productType);
                Toast.makeText(Add_Product.this, "Success = " + success, Toast.LENGTH_SHORT).show();
            }
        });

    }

    void BrandButtons() {

        // Create buttons and names them after the brands the user entered
        final Button btn = new Button(this);
        btn.setText(et_brand.getText().toString());
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et_brand.setText(btn.getText().toString());
            }
        });
        ll_brands_added.addView(btn);
    }
}