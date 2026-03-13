# UTS Pemrograman Seluler - Aplikasi Generator Lembar Penilaian

## Identitas Mahasiswa

* **Nama Lengkap:** Kadek Wahyu Santika Putra
* **NIM:** 42430012
* **Mata Kuliah: Pemrograman Seluler** 

---

## Deskripsi Aplikasi

Aplikasi ini dibuat untuk memenuhi tugas **Ujian Tengah Semester (UTS)** mata kuliah **Pemrograman Seluler**.

Aplikasi berfungsi sebagai **generator lembar evaluasi kelas** yang digunakan oleh dosen untuk menghitung status kelas berdasarkan nilai yang diberikan.

Fitur yang diimplementasikan pada aplikasi ini meliputi:

### 1. Desain UI/UX Responsif

Aplikasi menggunakan desain **modern card-based layout** dengan kombinasi warna **biru dan putih** agar nyaman dipandang.
Layout juga bersifat **responsif** dengan memanfaatkan folder:

```
layout
layout-land
```

sehingga tampilan dapat menyesuaikan saat perangkat dalam mode **Portrait** maupun **Landscape**.

### 2. Navigasi Multi-Layar

Aplikasi terdiri dari dua halaman utama:

* **Halaman Login**
* **Halaman Generator Penilaian**

Navigasi antar halaman dilakukan menggunakan **Intent** untuk mengirimkan data nama dosen ke halaman berikutnya.

### 3. Implementasi Control Flow

Aplikasi juga mengimplementasikan konsep **control flow** dalam Kotlin:

**Percabangan (If–Else)**
Digunakan untuk menentukan **status kelas** berdasarkan nilai rata-rata:

* Nilai ≥ 80 → **Sangat Baik**
* Nilai ≥ 60 → **Cukup**
* Nilai < 60 → **Kurang**

**Perulangan (For Loop)**
Digunakan untuk menghasilkan **daftar mahasiswa secara otomatis** berdasarkan jumlah mahasiswa yang diinput.

### 4. Perhitungan Nilai

Nilai rata-rata kelas dihitung dari beberapa komponen penilaian:

* Nilai Tugas
* Nilai Keaktifan
* Nilai UTS
* Nilai UAS

Rumus yang digunakan:

```
Nilai Akhir = (Tugas + Keaktifan + UTS + UAS) / 4
```

---

## Screenshot Aplikasi

### 1. Halaman Login

|                     Mode Portrait                     |                      Mode Landscape                     |
| :---------------------------------------------------: | :-----------------------------------------------------: |
| ![Login Portrait](link_screenshot_login_portrait.png) | ![Login Landscape](link_screenshot_login_landscape.png) |

---

### 2. Halaman Generator Penilaian

|        Input Data        |       Hasil Generate       |
| :----------------------: | :------------------------: |
| ![Input](link_input.png) | ![Output](link_output.png) |

---

## Teknologi yang Digunakan

* **Kotlin**
* **Android Studio**
* **ConstraintLayout**
* **CardView**
* **Intent (Data Passing)**
* **Git & GitHub**

---

## Repository

Repository ini dibuat sebagai bagian dari tugas **UTS Pemrograman Seluler** dan dikelola menggunakan **GitHub Version Control**.
