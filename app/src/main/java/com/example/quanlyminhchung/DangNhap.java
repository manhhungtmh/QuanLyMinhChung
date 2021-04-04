package com.example.quanlyminhchung;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DangNhap extends AppCompatActivity {
    Button btnDangNhap, btnHuy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_nhap);
        addControls();
        addEvents();
    }

    private void addEvents() {
        btnDangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DangNhap.this,TrangChu.class));
            }
        });
        btnHuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DangNhap.this,MainActivity.class));
            }
        });
    }

    private void addControls() {
        btnDangNhap = (Button)findViewById(R.id.btnDangNhap);
        btnHuy = (Button)findViewById(R.id.btnHuy);
    }
}