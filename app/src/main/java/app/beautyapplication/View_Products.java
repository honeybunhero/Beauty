package app.beautyapplication;

import static android.view.View.GONE;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.webkit.RenderProcessGoneDetail;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Toast;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.IllegalFormatCodePointException;
import java.util.List;

// TODO DOESN'T DISPLAY ANYTHING YET

public class View_Products extends AppCompatActivity {
    String productType;
    LinearLayout ll_products_added, ll_edit_product, ll_organize;
    ScrollView sv_products_added;
    EditText et_product_name, et_product_brand;
    Button btn_save, btn_remove, btn_cancel, btn_organize, btn_alphabetical, btn_exp_date;
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

        AddProductsButtons();

        btn_organize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                ll_organize.setVisibility(View.VISIBLE);
                int showHideLayout = ll_organize.getVisibility();
                if (showHideLayout == 0) {
                    ll_organize.setVisibility(View.GONE);
                } else {
                    ll_organize.setVisibility(View.VISIBLE);
                }
            }
        });
        btn_alphabetical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                View[] viewsArray = new View[ll_products_added.getChildCount()];
//                ll_organize.setVisibility(View.GONE);
//                for (int x = 0; x < ll_products_added.getChildCount(); x++) {
//                    viewsArray[x] = ll_products_added.getChildAt(x);
//                }
//                ll_products_added.removeAllViews();
//
//                for(int y = 0; y < viewsArray.length; y++){
//                    final Button btn = new Button(View_Products.this);
//                    String currentProduct = viewsArray[y].toString();
//
//                    if (currentProduct.equals("")) {
//                        currentProduct = viewsArray[y + 1].toString();
//                        btn.setText(currentProduct);
////                Toast.makeText(View_Products.this, "Adding " + db.GetAllBrands().get(x), Toast.LENGTH_SHORT).show();
//                        y++;
//                    }
//                    btn.setText(currentProduct);
//                    ll_products_added.addView(btn);
//                }
                ll_products_added.removeAllViews();
                Alphabetize();
                ll_organize.setVisibility(View.GONE);
            }
        });
        btn_exp_date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ll_organize.setVisibility(View.GONE);
            }
        });
    }

    void AddProductsButtons() {
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
            btn.setBackgroundColor(Color.parseColor("#630F2F"));

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
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT);
            layoutParams.setMargins(10, 5, 10, 5);
            ll_products_added.addView(btn, layoutParams);
        }
    }

    void Alphabetize() {
        DataBaseHelper db = new DataBaseHelper(this);

        try {
//            Toast.makeText(View_Products.this, "The size is " + db.GetAllProductsFromType(productType).size(), Toast.LENGTH_SHORT).show();
        } catch (Exception e) {
            Toast.makeText(View_Products.this, "Something went wrong!", Toast.LENGTH_SHORT).show();
        }

//        List<ProductModel> products = db.GetAllProductsFromType(productType);

        for (int x = 0; x < db.GetAllProductsFromType(productType).size(); x++) {
            final Button btn = new Button(this);
            String currentProduct = db.GetAllProductsFromTypeAlphabetical(productType).get(x).GetName();

            if (currentProduct.equals("")) {
                currentProduct = db.GetAllProductsFromTypeAlphabetical(productType).get(x + 1).GetName();
                btn.setText(currentProduct);
//                Toast.makeText(View_Products.this, "Adding " + db.GetAllBrands().get(x), Toast.LENGTH_SHORT).show();
                x++;
            }
            btn.setText(currentProduct);
            btn.setBackgroundColor(Color.parseColor("#630F2F"));

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
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT);
            layoutParams.setMargins(10, 5, 10, 5);
            ll_products_added.addView(btn, layoutParams);
        }
    }

    void SetUp() {
        ll_products_added = findViewById(R.id.ll_products_added);
        ll_edit_product = findViewById(R.id.ll_edit_product);
        ll_organize = findViewById(R.id.ll_organize);
        sv_products_added = findViewById(R.id.sv_products_added);
        et_product_brand = findViewById(R.id.et_product_brand);
        et_product_name = findViewById(R.id.et_product_name);

        btn_cancel = findViewById(R.id.btn_cancel);
        btn_save = findViewById(R.id.btn_save);
        btn_remove = findViewById(R.id.btn_remove);

        btn_organize = findViewById(R.id.btn_organize);
        btn_alphabetical = findViewById(R.id.btn_alphabetical);
        btn_exp_date = findViewById(R.id.btn_exp_date);

//        btn_organize.setBackgroundColor(Color.parseColor("#630F2F"));
//        btn_alphabetical.setBackgroundColor(Color.parseColor("#630F2F"));
//        btn_exp_date.setBackgroundColor(Color.parseColor("#630F2F"));

        sv_products_added.setVisibility(View.VISIBLE);
        ll_products_added.setVisibility(View.VISIBLE);
        ll_organize.setVisibility(View.GONE);
        dbEdit = new DataBaseHelper(this);
    }

    void ReturnToDefaultView() {
        sv_products_added.setVisibility(View.VISIBLE);
        btn_organize.setVisibility(View.VISIBLE);
    }

    void EditProduct(DataBaseHelper db, Button btn) {
        sv_products_added.setVisibility(View.GONE);
        btn_organize.setVisibility(View.GONE);
        ll_organize.setVisibility(View.GONE);
        ll_edit_product.setVisibility(View.VISIBLE);
        et_product_name.setText(db.GetProductFromDatabase(btn.getText().toString()).get(0).GetName());
        et_product_brand.setText(db.GetProductFromDatabase(btn.getText().toString()).get(0).GetBrand());

        EditProductButtons(productType, et_product_name.toString(), et_product_brand.toString());
    }

    void EditProductButtons(String product_type, String current_Product_Name, String current_Brand_Name) {
        btn_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO SAVE THE NEW INFORMATION TO THE DATABASE
                dbEdit.EditProduct(product_type, current_Product_Name, et_product_name.getText().toString());

                ll_products_added.removeAllViews();
                AddProductsButtons();
                ReturnToDefaultView();
            }
        });

        btn_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ReturnToDefaultView();
            }
        });

        btn_remove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbEdit.RemoveProduct(current_Product_Name);
                ll_products_added.removeAllViews();
                AddProductsButtons();
                ReturnToDefaultView();
            }
        });

    }


}