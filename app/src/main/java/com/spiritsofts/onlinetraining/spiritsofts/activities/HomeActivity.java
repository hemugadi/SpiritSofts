package com.spiritsofts.onlinetraining.spiritsofts.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.spiritsofts.onlinetraining.spiritsofts.R;
import com.spiritsofts.onlinetraining.spiritsofts.adapter.CategoryAdapter;
import com.spiritsofts.onlinetraining.spiritsofts.adapter.SubjectAdapter;
import com.spiritsofts.onlinetraining.spiritsofts.model.Category;
import com.spiritsofts.onlinetraining.spiritsofts.model.Subject;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {
    private List<Subject> subjectList = new ArrayList<>();
    private List<Category> categoryList = new ArrayList<>();
    private RecyclerView recyclerView;
    private CategoryAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        recyclerView = (RecyclerView) findViewById(R.id.category_recycler_view);

        mAdapter = new CategoryAdapter(categoryList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        prepareCategoryData();
    }

    private void prepareCategoryData() {
        List<Subject> subjectList = new ArrayList<>();

        Subject subject = new Subject("Mad Max", "Action", getResources().getDrawable(R.drawable.rpa));
        subjectList.add(subject);

        subject = new Subject("Inside Out", "Animation",getResources().getDrawable(R.drawable.rpa));
        subjectList.add(subject);

        subject = new Subject("Star Wars", "Action", getResources().getDrawable(R.drawable.rpa));
        subjectList.add(subject);

        subject = new Subject("Shaun the Sheep", "Animation", getResources().getDrawable(R.drawable.rpa));
        subjectList.add(subject);

        Category category = new Category("ORACLE HYPERION",subjectList );
        categoryList.add(category);
        //subjectList.clear();

        subject = new Subject("The Martian", "Science Fiction", getResources().getDrawable(R.drawable.rpa));
        subjectList.add(subject);

        subject = new Subject("Mission: Impossible", "Action", getResources().getDrawable(R.drawable.rpa));
        subjectList.add(subject);

        subject = new Subject("Up", "Animation", getResources().getDrawable(R.drawable.rpa));
        subjectList.add(subject);

        subject = new Subject("Star Trek", "Science Fiction",getResources().getDrawable(R.drawable.rpa));
        subjectList.add(subject);

        category = new Category("SAP MODULES",subjectList );
        categoryList.add(category);
       // subjectList.clear();

        subject = new Subject("The LEGO Subject", "Animation", getResources().getDrawable(R.drawable.rpa));
        subjectList.add(subject);

        subject = new Subject("Iron Man", "Action & Adventure", getResources().getDrawable(R.drawable.rpa));
        subjectList.add(subject);

        subject = new Subject("Aliens", "Science Fiction", getResources().getDrawable(R.drawable.rpa));
        subjectList.add(subject);

        subject = new Subject("Chicken Run", "Animation", getResources().getDrawable(R.drawable.rpa));
        subjectList.add(subject);

        category = new Category("ORACLE APPS",subjectList );
        categoryList.add(category);
       // subjectList.clear();

        subject = new Subject("Back to the Future", "Science Fiction", getResources().getDrawable(R.drawable.rpa));
        subjectList.add(subject);

        subject = new Subject("Raiders of the Lost Ark", "Action", getResources().getDrawable(R.drawable.rpa));
        subjectList.add(subject);

        subject = new Subject("Goldfinger", "Action", getResources().getDrawable(R.drawable.rpa));
        subjectList.add(subject);

        subject = new Subject("Guardians of the Galaxy", "Science Fiction", getResources().getDrawable(R.drawable.rpa));
        subjectList.add(subject);

        category = new Category("IBM",subjectList );
        categoryList.add(category);
        //subjectList.clear();

        mAdapter.notifyDataSetChanged();
    }
}
