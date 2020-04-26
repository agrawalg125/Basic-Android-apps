package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    ArrayList<ExampleItem> exampleItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        generateFakeData();

        recyclerConfig();


    }

    public void generateFakeData(){

        exampleItems=new ArrayList<>();
        exampleItems.add(new ExampleItem(R.drawable.node,"Clicked at India"));
        exampleItems.add(new ExampleItem(R.drawable.oner,"Clicked at Australia"));
        exampleItems.add(new ExampleItem(R.drawable.twor,"Clicked at Rome"));
        exampleItems.add(new ExampleItem(R.drawable.threer,"Clicked at USA"));
        exampleItems.add(new ExampleItem(R.drawable.fourr,"Clicked at LA"));
        exampleItems.add(new ExampleItem(R.drawable.fiver,"Clicked at England"));
    }

    public void recyclerConfig(){
        //Config for recycler view
        recyclerView=findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        layoutManager=new LinearLayoutManager(this);
        adapter=new ExampleAdapter(exampleItems);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }


}
