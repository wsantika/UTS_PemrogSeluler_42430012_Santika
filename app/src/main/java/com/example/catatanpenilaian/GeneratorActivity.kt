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
    lateinit var btnProses: Button
    lateinit var tvHasil: TextView
    lateinit var etTugas: EditText
    lateinit var etKeaktifan: EditText
    lateinit var etUTS: EditText
    lateinit var etUAS: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_generator)
        tvGreeting = findViewById(R.id.tvGreeting)
        etJumlah = findViewById(R.id.etJumlah)
        btnProses = findViewById(R.id.btnProses)
        tvHasil = findViewById(R.id.tvHasil)
        etTugas = findViewById(R.id.etTugas)
        etKeaktifan = findViewById(R.id.etKeaktifan)
        etUTS = findViewById(R.id.etUTS)
        etUAS = findViewById(R.id.etUAS)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val namaDosen = intent.getStringExtra("NAMA_DOSEN")
        tvGreeting.text = "Selamat bertugas, Dosen $namaDosen"
        btnProses.setOnClickListener {

            val jumlah = etJumlah.text.toString().toIntOrNull() ?: 0

            val tugas = etTugas.text.toString().toDoubleOrNull() ?: 0.0
            val keaktifan = etKeaktifan.text.toString().toDoubleOrNull() ?: 0.0
            val uts = etUTS.text.toString().toDoubleOrNull() ?: 0.0
            val uas = etUAS.text.toString().toDoubleOrNull() ?: 0.0

            val nilaiAkhir = (tugas + keaktifan + uts + uas) / 4

            var status = ""

            if (nilaiAkhir >= 80) {
                status = "Sangat Baik"
            } else if (nilaiAkhir >= 60) {
                status = "Cukup"
            } else {
                status = "Kurang"
            }

            var daftar = ""

            for (i in 1..jumlah) {
                daftar += "Mahasiswa $i : ______\n"
            }

            tvHasil.text =
                "Nilai rata-rata kelas: $nilaiAkhir\n" +
                        "Status kelas: $status\n\n" +
                        "Daftar Absen:\n$daftar"
        }
    }
}