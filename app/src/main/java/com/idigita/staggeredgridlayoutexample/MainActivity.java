package com.idigita.staggeredgridlayoutexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import com.idigita.staggeredgridlayoutexample.adapter.MyRecyclerViewAdapter;
import com.idigita.staggeredgridlayoutexample.model.ItemObjects;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private StaggeredGridLayoutManager gaggeredGridLayoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        gaggeredGridLayoutManager = new StaggeredGridLayoutManager(3, 1);
        recyclerView.setLayoutManager(gaggeredGridLayoutManager);

        List<ItemObjects> gaggeredList = getListItemData();

        MyRecyclerViewAdapter rcAdapter = new MyRecyclerViewAdapter(MainActivity.this, gaggeredList);
        recyclerView.setAdapter(rcAdapter);
    }

    private List<ItemObjects> getListItemData(){
        List<ItemObjects> listViewItems = new ArrayList<>();
        listViewItems.add(new ItemObjects("Manoj", R.drawable.one));
        listViewItems.add(new ItemObjects("Behera", R.drawable.two));
        listViewItems.add(new ItemObjects("Kumar", R.drawable.three));
        listViewItems.add(new ItemObjects("Jasmin", R.drawable.four));
        listViewItems.add(new ItemObjects("Behera", R.drawable.one));
        listViewItems.add(new ItemObjects("Kumar", R.drawable.two));
        listViewItems.add(new ItemObjects("Kumari", R.drawable.three));
        listViewItems.add(new ItemObjects("Manasi", R.drawable.four));
        listViewItems.add(new ItemObjects("Manoj", R.drawable.one));
        listViewItems.add(new ItemObjects("Manoj", R.drawable.two));
        listViewItems.add(new ItemObjects("Behera", R.drawable.three));
        listViewItems.add(new ItemObjects("Kumar", R.drawable.four));

        return listViewItems;
    }
}
