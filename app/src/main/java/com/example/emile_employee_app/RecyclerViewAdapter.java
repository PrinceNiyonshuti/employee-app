package com.example.emile_employee_app;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    Context mContext;
    List<Employee> mData;

    public RecyclerViewAdapter(Context mContext, List<Employee> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    //@NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.item_employee,parent,false);
        MyViewHolder vHolder = new MyViewHolder(v);

        // try
        vHolder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                Intent viewDetails = new Intent(view.getContext(),EmpDetails.class);

                viewDetails.putExtra("EmpName",mData.get(vHolder.getAdapterPosition()).getName());
                viewDetails.putExtra("EmpDept",mData.get(vHolder.getAdapterPosition()).getDept());
                viewDetails.putExtra("EmpMail",mData.get(vHolder.getAdapterPosition()).getMail());
                viewDetails.putExtra("EmpDistr",mData.get(vHolder.getAdapterPosition()).getDistrict());
                viewDetails.putExtra("EmpPass",mData.get(vHolder.getAdapterPosition()).getPassword());

                view.getContext().startActivity(viewDetails);

                return false;
            }
        });

        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.emp_name.setText(mData.get(position).getName());
        holder.emp_dept.setText(mData.get(position).getDept());
        holder.emp_mail.setText(mData.get(position).getMail());
        holder.emp_distr.setText(mData.get(position).getDistrict());
        holder.emp_pass.setText(mData.get(position).getPassword());
        holder.img.setImageResource(mData.get(position).getPhoto());

        String tittle = mData.get(position).getName();
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        public TextView emp_name;
        private TextView emp_dept;
        private TextView emp_mail;
        private TextView emp_distr;
        private TextView emp_pass;
        private ImageView img;

        public MyViewHolder(View itemView){
            super(itemView);

            emp_name =  (TextView) itemView.findViewById(R.id.name_employee);
            emp_dept =  (TextView) itemView.findViewById(R.id.dept_employee);
            emp_mail =  (TextView) itemView.findViewById(R.id.mail_employee);
            emp_distr =  (TextView) itemView.findViewById(R.id.district_employee);
            emp_pass =  (TextView) itemView.findViewById(R.id.pass_employee);
            img =  (ImageView) itemView.findViewById(R.id.img_employee);

        }
    }
}
