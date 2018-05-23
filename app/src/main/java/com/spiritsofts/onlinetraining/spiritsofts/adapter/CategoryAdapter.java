package com.spiritsofts.onlinetraining.spiritsofts.adapter;

import android.content.res.Resources;
import android.support.annotation.NonNull;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.spiritsofts.onlinetraining.spiritsofts.R;
import com.spiritsofts.onlinetraining.spiritsofts.model.Category;

import java.util.List;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.MyViewHolder> {
    private List<Category> categoryList;

    public CategoryAdapter(List<Category> categoryList) {
        this.categoryList = categoryList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.category_item_row, parent, false);

        return new CategoryAdapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Category category = categoryList.get(position);
        holder.title.setText(category.getCategoryTitle());
        holder.mAdapter = new SubjectAdapter(category.getSubjects());
        holder.recyclerView.setAdapter(holder.mAdapter);
    }

    @Override
    public int getItemCount() {
        return categoryList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title;
        public RecyclerView recyclerView;
        SubjectAdapter mAdapter;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.category);
            recyclerView = (RecyclerView) view.findViewById(R.id.subject_recycler_view);
            RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(view.getContext(), LinearLayoutManager.HORIZONTAL, false);
            recyclerView.setLayoutManager(mLayoutManager);
            recyclerView.setItemAnimator(new DefaultItemAnimator());
            recyclerView.addItemDecoration(new DividerItemDecoration(view.getContext(), LinearLayoutManager.HORIZONTAL));
        }
    }
}
