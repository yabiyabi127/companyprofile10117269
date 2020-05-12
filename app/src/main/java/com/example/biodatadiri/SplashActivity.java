//tgl pengerjaan : 12 Mei 2020
//NIM : 10117269
//Nama : Hari Kurniawan
//Kelas : IF-8

package com.example.biodatadiri;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            // langsung pindah ke MainActivity atau activity lain
            // begitu memasuki splash screen ini
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            finish();
        }
    }

