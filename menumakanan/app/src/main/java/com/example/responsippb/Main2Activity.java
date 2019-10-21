package com.example.responsippb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    ImageView imageView;
    TextView name,price,des;
    String title,price2,des2;
    int image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        des = findViewById(R.id.keterangan);
        imageView=findViewById(R.id.image);
        name=findViewById(R.id.title);
        price=findViewById(R.id.harga);
        title = getIntent().getStringExtra("name");
        price2= getIntent().getStringExtra("price");
        des2 = getIntent().getStringExtra("deskripsi");
        image = getIntent().getIntExtra("image", 0);
        name.setText(title);
        price.setText(price2);
        imageView.setImageResource(image);
        des.setText(des2);
    }
}
