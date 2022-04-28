package com.alphaville.coffeeapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.alphaville.coffeeapplication.model.CoffeeProduct;

import java.util.List;

public class SearchResultAdapter extends ArrayAdapter<CoffeeProduct>
{
    private final List<CoffeeProduct> products;
    private final Context context;
    private final int resource;

    public SearchResultAdapter(Context context, int resource, List<CoffeeProduct> products)
    {
        super(context, resource, products);
        this.products = products;
        this.context = context;
        this.resource = resource;
    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        LayoutInflater inflater = LayoutInflater.from(getContext());
        convertView = inflater.inflate(resource, parent, false);

        // gets all appropriate views for the list item
        TextView title = (TextView) convertView.findViewById(R.id.sr_title);
        TextView height = (TextView) convertView.findViewById(R.id.sr_height);
        TextView country = (TextView) convertView.findViewById(R.id.sr_country);
        TextView process = (TextView) convertView.findViewById(R.id.sr_process);
        TextView match = (TextView) convertView.findViewById(R.id.sr_match);

        CoffeeProduct product = getItem(position);

        // sets values for each view of the product in the current position
        title.setText(product.getName());
        height.setText(context.getString(R.string.sr_height, product.getElevation()));
        country.setText(context.getString(R.string.sr_country, product.getCountry()));
        process.setText(context.getString(R.string.sr_process, product.getProcess()));
        match.setText(context.getString(R.string.sr_match, 123)); // todo get match percentage from algorithm

        // TODO set search result image as well

        return convertView;
    }
}
