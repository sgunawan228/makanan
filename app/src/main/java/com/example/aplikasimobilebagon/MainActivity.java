package com.example.aplikasimobilebagon;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private makananAdapter adapter;
    private ArrayList<makanan> makananArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();
        recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        adapter = new makananAdapter(MainActivity.this, makananArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);
    }

    void addData(){
        makananArrayList = new ArrayList<>();
        makananArrayList.add(new makanan("Sate Ayam","Potongan ayam yang ditusuk dan dibakar hingga sempurna", "12000", "gambar4"));
        makananArrayList.add(new makanan("Ayam Geprek","Ayam goreng tepung yang dicampur dengan sambal yang nikmat", "12000", "gambar1"));
        makananArrayList.add(new makanan("Nasi Goreng","Nasi goreng spesial yang tak ada duanya", "12000", "gambar3"));
        makananArrayList.add(new makanan("Ayam Bakar","Ayam yang dibabkar dengan bumbu khas", "12000", "gambar2"));
    }
}
