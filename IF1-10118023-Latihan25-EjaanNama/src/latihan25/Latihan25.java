/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latihan25;

import java.util.Scanner;

/**
 * @author Zaenal PC
 * NAMA              : Zaenal Anzarry
 * KELAS             : IF-01
 * NIM               : 10118023
 * Deskripsi Program : Ejaan Nama
 */

public class Latihan25 {

    public static void main(String[] args) {
        String nama;
  
        System.out.print("Masukkan nama depan anda untuk di eja : ");
        Scanner input = new Scanner(System.in);
        nama = input.nextLine();
        
        char eja [] = nama.toCharArray();
        System.out.println("");
        System.out.println("Ejaan untuk " + nama + " adalah :");
        
        for(int i = 0; i < eja.length ; i++){
            System.out.println("Huruf Ke - " + (i+1) + " : " + eja[i]);
        }
          
    }
    
}
