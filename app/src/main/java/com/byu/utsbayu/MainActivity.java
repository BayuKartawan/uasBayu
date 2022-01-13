package com.byu.utsbayu;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ImageButton btnJangkrik,btnBelalang,btnKupukupu;
    public static final String JENIS_GALERI_KEY = "JENIS_GALERI";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inisialisasiView();

    }

    private void inisialisasiView() {
        btnJangkrik = findViewById(R.id.btn_buka_ras_jangkrik);
        btnBelalang = findViewById(R.id.btn_buka_ras_belalang);
        btnKupukupu = findViewById(R.id.btn_buka_ras_kupukupu);
        btnJangkrik.setOnClickListener(view -> bukaGaleri("Jangkrik"));
        btnBelalang.setOnClickListener(view -> bukaGaleri("Belalang"));
        btnKupukupu.setOnClickListener(view -> bukaGaleri("Kupukupu"));
    }

    private void bukaGaleri(String jenisHewan) {
        Log.d("MAIN","Buka activity kucing");
        Intent intent = new Intent(this, DaftarHewanActivity.class);
        intent.putExtra(JENIS_GALERI_KEY, jenisHewan);
        startActivity(intent);
    }

    public void Pindah(View view) {
        Intent intent = new Intent(MainActivity.this, BiodataActivity.class);
        startActivity(intent);
    }
}