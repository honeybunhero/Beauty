import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

import app.beautyapplication.ProductModel;

public class ProductAdapter extends ArrayAdapter<ProductModel> {
    ArrayList<ProductModel> productList;

    public ProductAdapter(@NonNull Context context, int resource, ArrayList<ProductModel> productList) {
        super(context, resource);
        this.productList = productList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return super.getView(position, convertView, parent);
    }
}
