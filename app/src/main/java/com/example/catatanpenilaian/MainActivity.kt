package com.example.catatanpenilaian

import android.content.Intent
import android.widget.Button
import android.widget.EditText
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var etNamaDosen: EditText
    lateinit var btnMasuk: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        etNamaDosen = findViewById(R.id.etNamaDosen)
        btnMasuk = findViewById(R.id.btnMasuk)
        btnMasuk.setOnClickListener {
            val nama = etNamaDosen.text.toString()
            val intent = Intent(this, GeneratorActivity::class.java)
            intent.putExtra("NAMA_DOSEN", nama)
            startActivity(intent)
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}