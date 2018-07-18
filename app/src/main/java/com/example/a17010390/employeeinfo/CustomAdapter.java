package com.example.a17010390.employeeinfo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 17010390 on 18/7/2018.
 */

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<Information> information;

    public CustomAdapter(@NonNull Context context, int resource, ArrayList<Information> information) {
        super(context, resource, information);
        this.parent_context = context;
        this.layout_id = resource;
        this.information = information;
    }

    public View getView(int position, @NonNull View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater)parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(layout_id, parent, false);
        TextView tvname = rowView.findViewById(R.id.tvName);
        TextView tvtitle = rowView.findViewById(R.id.tvTilte);
        TextView tvsalary = rowView.findViewById(R.id.tvSalary);

        Information currentInfo = Information.get(position);

        tvname.setText(currentInfo.getName());
        tvtitle.setText(currentInfo.getTitle());
        tvsalary.setText(currentInfo.getSalary());

        return rowView;
    }
}
