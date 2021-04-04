package com.example.quanlyminhchung;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Dangkytaikhoan extends AppCompatActivity {
    Button btnXacNhan, btnHuy;
    EditText edtMatKhau1, edtMatKhau2, edtTenDangNhap;
    private DatabaseReference mDatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dangkytaikhoan);
        addControls();
        addEvents();
    }

    private void addEvents() {
        mDatabase = FirebaseDatabase.getInstance().getReference();
        btnXacNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tendangnhap = edtTenDangNhap.getText().toString().trim();
                String matkhau1 = edtMatKhau1.getText().toString().trim();
                String matkhau2 =  edtMatKhau2.getText().toString().trim();
                if(tendangnhap.equals("") || matkhau1.equals("") || matkhau2.equals("")){
                    Toast.makeText(Dangkytaikhoan.this,"Vui lòng nhập đầy đủ thông tin",Toast.LENGTH_SHORT).show();
                    return;
                }
                if(!matkhau1.equals(matkhau2)){
                    Toast.makeText(Dangkytaikhoan.this,"Mật khẩu xác nhận không khớp",Toast.LENGTH_SHORT).show();
                    return;
                }

                mDatabase.orderByChild("message").addChildEventListener(new ChildEventListener() {
                    @Override
                    public void onChildAdded(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {
                        Toast.makeText(Dangkytaikhoan.this,snapshot.getValue().toString(),Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onChildChanged(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {

                    }

                    @Override
                    public void onChildRemoved(@NonNull DataSnapshot snapshot) {

                    }

                    @Override
                    public void onChildMoved(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
                startActivity(new Intent(Dangkytaikhoan.this,TrangChu.class));
            }
        });
        btnHuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Dangkytaikhoan.this,MainActivity.class));
            }
        });
    }

    private void addControls() {
        btnXacNhan = (Button)findViewById(R.id.btnXacNhan);
        btnHuy = (Button)findViewById(R.id.btnHuy2);
        edtMatKhau1 = (EditText)findViewById(R.id.edtMatKhau1);
        edtMatKhau2 = (EditText)findViewById(R.id.edtMatKhau2);
        edtTenDangNhap = (EditText)findViewById(R.id.edtMaSinhVien);
    }
}