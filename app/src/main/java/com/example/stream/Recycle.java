package com.example.stream;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Recycle extends AppCompatActivity {

    private ArrayList<String> name = new ArrayList<>();
    private ArrayList<String> image = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle);
        init();
    }

    private void init() {
        image.add("data:image/png;base64,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");
        name.add("Apple");
        image.add("https://upload.wikimedia.org/wikipedia/commons/thumb/2/24/Samsung_Logo.svg/1280px-Samsung_Logo.svg.png");
        name.add("Samsung");
        image.add("http://www.freelogovectors.net/wp-content/uploads/2016/12/huawei-logo.png");
        name.add("Huawei");
        image.add("https://www.google.com/url?sa=i&source=images&cd=&ved=2ahUKEwiVrrShuMDiAhVJuY8KHeBRBU4QjRx6BAgBEAU&url=https%3A%2F%2Fcommons.wikimedia.org%2Fwiki%2FFile%3AXiaomi_logo.svg&psig=AOvVaw1aQI5A7Da3EUAdGxS_kJ5J&ust=1559208987543428");
        name.add("Xiaomi");
        initRecycleView();
    }

    private void initRecycleView(){
        RecyclerView recyclerView = findViewById(R.id.recycleView);
        RecyclerViewAdpater viewAdpater = new RecyclerViewAdpater(name,image,this);
        recyclerView.setAdapter(viewAdpater);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
