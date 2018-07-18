package sg.edu.rp.c346.exercise2a;

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
 * Created by 17010578 on 18/7/2018.
 */

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<WorkItem> workList;

    public CustomAdapter(@NonNull Context context, int resource,
                         @NonNull ArrayList<WorkItem> objects){
        super(context,resource,objects);
        this.parent_context=context;
        this.layout_id=resource;
        this.workList=objects;
    }

    public View getView(int position, @Nullable View convertView, @NonNull()ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id ,parent,false);

        TextView tvName = rowView.findViewById(R.id.textViewName);
        TextView tvTitle = rowView.findViewById(R.id.textViewTitle);
        TextView tvSalary = rowView.findViewById(R.id.textViewSalary);

        WorkItem currentWork = workList.get(position);


        tvName.setText(currentWork.getName());
        tvTitle.setText(currentWork.getTitle());
        tvSalary.setText(currentWork.getSalary()+"");
        return rowView;
    }

}


