package com.example.quanlyminhchung;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class TrangChu extends AppCompatActivity {
    ImageView ivThemMinhChung, ivThongKeMinhChung;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trang_chu);
        addControls();
        addEvents();
    }
    private void addEvents() {
        ivThemMinhChung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TrangChu.this,ThuMucMinhChung.class));
            }
        });
        ivThongKeMinhChung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TrangChu.this,ThongKeMinhChung.class));
            }
        });
    }

    private void addControls() {
        ivThemMinhChung = (ImageView)findViewById(R.id.ivThemMinhChung);
        ivThongKeMinhChung = (ImageView)findViewById(R.id.ivThongKeMinhChung);
    }
}