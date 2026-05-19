package com.dicoding.javafundamental.basic;

import com.dicoding.javafundamental.kendaraan.*;
import com.dicoding.javafundamental.musik.Gitar;
import org.apache.commons.lang3.time.DateUtils;

import java.util.Date;

public class Main {
public static void main(String[] args){
    String dicoding = "dicoding";
    char result = dicoding.charAt(7);
    System.out.println(result);

    System.out.println("Hello World");

    Gitar.bunyi();

    Mobil.tampilkanJumlahBan();
    Motor.tampilkanJumlahBan();
    Kereta.tampilkanJumlahBan();

    Date today = new Date();
    System.out.println("Hari ini = " + today);
    Date tomorrow = DateUtils.addDays(today, 1);
    System.out.println("Besok = " + tomorrow);

}



}


