package com.example.catatanpenilaian

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.TextView
import android.widget.EditText
import android.widget.Button

class GeneratorActivity : AppCompatActivity() {
    lateinit var tvGreeting: TextView
    lateinit var etJumlah: EditText
    lateinit var etNilai: EditText
    lateinit var btnProses: Button
    lateinit var tvHasil: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_generator)
        tvGreeting = findViewById(R.id.tvGreeting)
        etJumlah = findViewById(R.id.etJumlah)
        etNilai = findViewById(R.id.etNilai)
        btnProses = findViewById(R.id.btnProses)
        tvHasil = findViewById(R.id.tvHasil)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val namaDosen = intent.getStringExtra("NAMA_DOSEN")
        tvGreeting.text = "Selamat bertugas, Dosen $namaDosen"
        btnProses.setOnClickListener {

            val jumlah = etJumlah.text.toString().toInt()
            val nilai = etNilai.text.toString().toDouble()

            var status = ""

            if (nilai >= 80) {
                status = "Sangat Baik"
            } else if (nilai >= 60) {
                status = "Cukup"
            } else {
                status = "Kurang"
            }

            var daftar = ""

            for (i in 1..jumlah) {
                daftar += "Mahasiswa $i : ______\n"
            }

            tvHasil.text = "Status kelas: $status\n\nDaftar Absen:\n$daftar"
        }
    }
}