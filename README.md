# Latihan Inheritance - Pemrograman Berorientasi Objek

Repository ini berisi tugas pada mata kuliah Pemrograman Berorientasi Objek mengenai implementasi konsep OOP pada program `BangunDatar`.

## Penjelasan Konsep pada Kode
- **Encapsulation:** Diterapkan melalui penggunaan access modifier `private` pada atribut (`private double side;`, `private double length;`, `private double width;`) serta pengelolaan datanya menggunakan method *getter* (`getSide()`, `getLength()`, `getWidth()`) dan *setter* (`setSide()`, `setLength()`, `setWidth()`) secara aman.
- **Inheritance:** Konsep pewarisan di mana class dapat diturunkan untuk membagikan atribut dan method ke class anak. Dalam perancangan program geometri ini, class `BangunDatar` disiapkan sebagai *parent class* yang mewariskan properti perhitungan luas dan keliling ke class-class turunan (seperti Persegi dan Persegi Panjang).
- **Polymorphism:** Kemampuan method untuk memiliki banyak bentuk, yang pada program ini direalisasikan melalui *constructor overloading* (memiliki beberapa constructor dengan parameter berbeda dalam satu class) serta potensi *method overriding* pada pengembangan class turunan.

## Daftar File
- `BangunDatar.java`
- `BangunDatarDemo.java`
- Screenshot Hasil Program

## Cara Menjalankan Program
1. Kompilasi file Java:
   ```bash
   javac *.java
