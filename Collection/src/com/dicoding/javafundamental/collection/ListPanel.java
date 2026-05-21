package com.dicoding.javafundamental.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListPanel {

    public static void main(String[] args) {
//    deklarasi Array
        String[] heroes = new String[2];
        heroes[0] = "Duke";
        heroes[1] = "Rock";
//      horoes[2] = "Zeus"; // error ArrayIndexOutOfBoundsException karena ukuran Array tetap

//      menggunakan ArrayList
        List<String> planets = new ArrayList<>();
        planets.add("Mercury"); // method add() untuk menambahkan objek ke List
        planets.add("Venus");
        planets.add("Earth");
        planets.add("Mars"); //objek lainnya masih bisa terus ditambahkan ke List

        System.out.println("List planets awal:");
        for (int i = 0; i<planets.size(); i++) {
            // method size() untuk mendapatkan ukuran List
            // method get() untuk melihar isi List pada index i
            System.out.println("\t index-"+ i +" = " + planets.get(i));
        }

        planets.remove("Venus"); // method remove() untuk mengeluarkan objek dari list

        System.out.println("List planets akhir:");
        for (int i = 0; i<planets.size(); i++) {
            System.out.println("\t index -"+ i +" = " + planets.get(i));
        }
    }
}
