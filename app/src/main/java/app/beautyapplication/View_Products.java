package app.beautyapplication;

import static android.view.View.GONE;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.RenderProcessGoneDetail;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Toast;

import java.nio.charset.StandardCharsets;
import java.util.List;

// TODO DOESN'T DISPLAY ANYTHING YET

public class View_Products extends AppCompatActivity {
    String productType;
    LinearLayout ll_products_added, ll_edit_product;
    ScrollView sv_products_added;
    EditText et_product_name, et_product_brand;
    Button btn_save, btn_cancel;
    DataBaseHelper dbEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_products);

        SetUp();

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
            Toast.makeText(this, "Something went wrong!", Toast.LENGTH_SHORT).show();
        }

        ProductsButtons();

    }

    void ProductsButtons() {
        DataBaseHelper db = new DataBaseHelper(this);

        try {
//            Toast.makeText(View_Products.this, "The size is " + db.GetAllProductsFromType(productType).size(), Toast.LENGTH_SHORT).show();
        } catch (Exception e) {
            Toast.makeText(View_Products.this, "Something went wrong!", Toast.LENGTH_SHORT).show();
        }

//        List<ProductModel> products = db.GetAllProductsFromType(productType);

        for (int x = 0; x < db.GetAllProductsFromType(productType).size(); x++) {
            final Button btn = new Button(this);
            String currentProduct = db.GetAllProductsFromType(productType).get(x).GetName();

            if (currentProduct.equals("")) {
                currentProduct = db.GetAllProductsFromType(productType).get(x + 1).GetName();
                btn.setText(currentProduct);
//                Toast.makeText(View_Products.this, "Adding " + db.GetAllBrands().get(x), Toast.LENGTH_SHORT).show();
                x++;
            }
            btn.setText(currentProduct);

            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    btn.setText(btn.getText().toString().toUpperCase());
                }
            });

            btn.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View view) {
                    try {
                        //TODO MAKE THIS OPEN A PAGE TO EDIT THE PRODUCT INFORMATION
                        EditProduct(db, btn);
                    } catch (Exception e) {
                        Toast.makeText(View_Products.this, "Something went wrong", Toast.LENGTH_SHORT).show();
                    }

                    return false;
                }
            });
            ll_products_added.addView(btn);
        }

    }

    void SetUp() {
        ll_products_added = findViewById(R.id.ll_products_added);
        ll_edit_product = findViewById(R.id.ll_edit_product);
        sv_products_added = findViewById(R.id.sv_products_added);
        et_product_brand = findViewById(R.id.et_product_brand);
        et_product_name = findViewById(R.id.et_product_name);

        btn_cancel = findViewById(R.id.btn_cancel);
        btn_save = findViewById(R.id.btn_save);

        sv_products_added.setVisibility(View.VISIBLE);
        ll_products_added.setVisibility(View.VISIBLE);
        dbEdit = new DataBaseHelper(this);
    }

    void ReturnToDefaultView() {
        sv_products_added.setVisibility(View.VISIBLE);
    }

    void EditProduct(DataBaseHelper db, Button btn) {
        sv_products_added.setVisibility(GONE);
        ll_edit_product.setVisibility(View.VISIBLE);
        et_product_name.setText(db.GetProductFromDatabase(btn.getText().toString()).get(0).GetName());
        et_product_brand.setText(db.GetProductFromDatabase(btn.getText().toString()).get(0).GetBrand());

        EditProductButtons(et_product_name.toString(),et_product_brand.toString());
    }

    void EditProductButtons(String current_Product_Name, String current_Brand_Name) {
        btn_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO SAVE THE NEW INFORMATION TO THE DATABASE
                dbEdit.EditProduct(current_Product_Name,et_product_name.getText().toString());
                ll_products_added.removeAllViews();
                ProductsButtons();
                ReturnToDefaultView();
            }
        });

        btn_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ReturnToDefaultView();
            }
        });
    }



}