package com.dicoding.javafundamental.accessmodifier.package4;

//class tidak bisa dijadikan induk kelas
final class Lingkaran {
//    nilai tidak bisa diganti oleh nilai lain karena menggunakan variabel final
    static final double PI = 3.141;

    int jari = 7;

    final double getLuas() {
        return PI * (jari * jari);
    }
}
