package com.aritmatika;
//untuk memasukkan perintah input dari java
import java.util.Scanner; 

public class Main {
    
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        
        //menghitung luas segitiga (0.5 x alas x tinggi)
        
        System.out.println
        ("===== Menghitung Luas Segitiga =====");
        
        System.out.println("alas = ");
        int alas = userInput.nextInt();
        //user memasukkan nilai alas
        
        System.out.println("tinggi = ");
        int tinggi = userInput.nextInt();
        //user memasukkan nilai tinggi
        
        double luasS = 0.5 * alas * tinggi;
        System.out.println("luas segitiga = " + luasS );
        
        


        //menghitung luas persegi panjang (panjang x lebar)
        
        System.out.println
        ("===== Menghitung Luas Persegi Panjang =====");
        
        System.out.println("panjang = ");
        int panjang = userInput.nextInt();
        //user memasukkan nilai panjang
        
        System.out.println("lebar = ");
        int lebar = userInput.nextInt();
        //user memasukkan nilai lebar
        
        int luasP = panjang * lebar;
        System.out.println("luas persegi panjang = " + luasP );
        
        
        
        
        //menghitung luas lingkaran
        
        System.out.println
        ("===== Menghitung Luas Lingkaran =====");
        
        System.out.println("radius = ");
        int radius = userInput.nextInt();
        //user memasukkan nilai radius
        
        double phi = 3.14;
        double luasL = phi * radius * radius;
        System.out.println("luas lingkaran = " + luasL );
             
    }
}
