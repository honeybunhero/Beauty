package app.beautyapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomBaseAdapter extends BaseAdapter {
    Context context;
    ArrayList<String> name, brand, expDate;
    ArrayList<Integer> ID;
    LayoutInflater layoutInflater;

    public CustomBaseAdapter(Context context, ArrayList<String> name, ArrayList<String> brand, ArrayList<Integer> ID, ArrayList<String> expDate){
        this.context = context;
        this.name = name;
        this.brand = brand;
        this.ID = ID;
        this.expDate = expDate;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return name.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = layoutInflater.inflate(R.layout.custom_list_view,null);
        TextView tv_name = view.findViewById(R.id.tv_product);
        TextView tv_brand = view.findViewById(R.id.tv_brand);
        TextView tv_expdate = view.findViewById(R.id.tv_expdate);

        tv_name.setText(name.get(i));
        tv_brand.setText(brand.get(i));
        tv_expdate.setText(expDate.get(i));
        return view;
    }
}
