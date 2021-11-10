package app.beautyapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class View_Products extends AppCompatActivity {
    String productType;
    LinearLayout ll_edit_product, ll_organize;
    EditText et_product_name, et_product_brand, et_product_exp_date;
    Button btn_save, btn_remove, btn_cancel, btn_organize, btn_alphabetical, btn_exp_date;
    DataBaseHelper dbEdit;
    ListView lv_products_added;
    ArrayList<String> products_name, products_brand, products_exp_date;
    ArrayList<Integer> products_index;
    Add_Product addProduct;


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

        SetProductViews("Initialize");


        btn_organize.setOnClickListener(view -> {
            int showHideLayout = ll_organize.getVisibility();
            if (showHideLayout == 0) {
                ll_organize.setVisibility(View.GONE);
            } else {
                ll_organize.setVisibility(View.VISIBLE);
            }
        });
        btn_alphabetical.setOnClickListener(view -> {
            SetProductViews("Alphabetize");
            ll_organize.setVisibility(View.GONE);
        });

        btn_exp_date.setOnClickListener(view -> {
            SetProductViews("EXPDATE");
            ll_organize.setVisibility(View.GONE);
        });
    }

    void SetUp() {
        ll_edit_product = findViewById(R.id.ll_edit_product);
        ll_organize = findViewById(R.id.ll_organize);
        et_product_brand = findViewById(R.id.et_product_brand);
        et_product_name = findViewById(R.id.et_product_name);
        et_product_exp_date = findViewById(R.id.et_product_exp_date);

        lv_products_added = findViewById(R.id.lv_products_added);

        btn_cancel = findViewById(R.id.btn_cancel);
        btn_save = findViewById(R.id.btn_save);
        btn_remove = findViewById(R.id.btn_remove);

        btn_organize = findViewById(R.id.btn_organize);
        btn_alphabetical = findViewById(R.id.btn_alphabetical);
        btn_exp_date = findViewById(R.id.btn_exp_date);

        ll_organize.setVisibility(View.GONE);
        dbEdit = new DataBaseHelper(this);

        products_name = new ArrayList<>();
        products_brand = new ArrayList<>();
        products_index = new ArrayList<>();
        products_exp_date = new ArrayList<>();

        addProduct = new Add_Product();
    }

    void ReturnToDefaultView() {
        btn_organize.setVisibility(View.VISIBLE);
        ll_organize.setVisibility(View.GONE);
        lv_products_added.setVisibility(View.VISIBLE);
        ll_edit_product.setVisibility(View.GONE);
    }

    void EditProduct(int index) {
        btn_organize.setVisibility(View.GONE);
        ll_organize.setVisibility(View.GONE);
        lv_products_added.setVisibility(View.GONE);
        ll_edit_product.setVisibility(View.VISIBLE);

        et_product_name.setText(products_name.get(index));
        et_product_brand.setText(products_brand.get(index));
        et_product_exp_date.setText(products_exp_date.get(index));

        EditProductButtons(index);
    }

    void EditProductButtons(int index) {
        btn_save.setOnClickListener(view -> {
            ProductModel productModel = new ProductModel(
                    products_index.get(index),
                    et_product_name.getText().toString(),
                    et_product_brand.getText().toString(),
                    productType,
                    et_product_exp_date.getText().toString());

            dbEdit.EditProduct(productModel);
            SetProductViews("Initialize");
            ReturnToDefaultView();
        });

        btn_cancel.setOnClickListener(view -> ReturnToDefaultView());

        btn_remove.setOnClickListener(view -> {

            DeleteProduct(index);
            ReturnToDefaultView();
        });
    }

    void SetProductViews(String listType) {

        DataBaseHelper dataBaseHelper = new DataBaseHelper(View_Products.this);
        List<ProductModel> allProductsFromType = null;

        products_name.clear();
        products_brand.clear();
        products_index.clear();
        products_exp_date.clear();


        if (listType.equals("Alphabetize")) {
            allProductsFromType = dataBaseHelper.GetAllProductsFromTypeAlphabetical(productType);
        } else if (listType.equals("Initialize")) {
            allProductsFromType = dataBaseHelper.GetAllProductsFromType(productType);
        } else if (listType.equals("EXPDATE")) {
            allProductsFromType = dataBaseHelper.GetAllProductsFromTypeExpDate(productType);
        }

        for (int x = 0; x < Objects.requireNonNull(allProductsFromType).size(); x++) {
            products_name.add(allProductsFromType.get(x).GetName());
            products_brand.add(allProductsFromType.get(x).GetBrand());
            products_index.add(allProductsFromType.get(x).GetID());
            products_exp_date.add(allProductsFromType.get(x).GetExpDate());
        }
        CustomBaseAdapter customBaseAdapter = new CustomBaseAdapter(getApplicationContext(), products_name, products_brand, products_index, products_exp_date);
        lv_products_added.setAdapter(customBaseAdapter);
        customBaseAdapter.notifyDataSetChanged();

//        lv_products_added.setOnItemClickListener((adapterView, view, i, l) -> Toast.makeText(View_Products.this, "The item's index ID is : " + products_index.get(i), Toast.LENGTH_SHORT).show());

        lv_products_added.setOnItemLongClickListener((adapterView, view, i, l) -> {
            EditProduct(i);
            customBaseAdapter.notifyDataSetChanged();
            return true;
        });
    }

    void DeleteProduct(int index) {
        DataBaseHelper dataBaseHelper = new DataBaseHelper(View_Products.this);
        dataBaseHelper.DeleteOne(products_index.get(index));

        products_name.remove(index);
        products_brand.remove(index);
        products_index.remove(index);
        products_exp_date.remove(index);
    }
}