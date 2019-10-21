package com.example.responsippb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    productAdapter adapter;

    List<product> productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        productList = new ArrayList<>();

        recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        productList.add(
                new product(
                        1,
                        "Pecel Lele",
                        "15000",
                        R.drawable.index,"Lele goreng dikasih sambal"));
        productList.add(
                new product(
                        1,
                        "Nasi Goreng Mercon",
                        "14500",
                        R.drawable.index,"Nasi yang digoreng dan dicampur dengan banyak sambal"));
        productList.add(
                new product(
                        1,
                        "Ayam Geprek Keju",
                        "20000",
                        R.drawable.index,"Ayam yang digeprek dan ditambahi keju"));
        productList.add(
                new product(
                        1,
                        "Kari Ayam",
                        "17500",
                        R.drawable.index,"Ayam diberi kari"));
        productList.add(
                new product(
                        1,
                        "Tahu Bulat",
                        "500",
                        R.drawable.index,"Digoreng dadakan"));
        productList.add(
                new product(
                        1,
                        "Salad Buah",
                        "12000",
                        R.drawable.index,"Potongan buah diberi mayonaise"));

        adapter = new productAdapter(this,productList);
        recyclerView.setAdapter(adapter);
    }

    public void pindah(View view) {
        Intent intent = new Intent(MainActivity.this,Main2Activity.class);
        startActivity(intent);
    }
}
