/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hillchipper;

import Hillchipper.deskripsi;
import Hillchipper.enkripsi;
import IO.Reader;
import IO.Writter;

/**
 *
 * @author Muhamad Yamin
 */
public class main {
    public static void main(String[] args) {
        // read file
        String readedFile = Reader.readFile("src/data/input.txt");
        System.out.println("" + readedFile); //membaca file input
        String encryptedText = enkripsi.encrypt(readedFile);
        System.out.println("" + encryptedText); //melakukan penulisan enkripsi
        Writter.writeFile("src/data/hasil enkripsi.txt", encryptedText);
        //membaca hasil enkripsi
        String encryptedFile = Reader.readFile("src/data/hasil enkripsi.txt");
        // menampilkan hasil enkripsi
        String decryptedFile = deskripsi.decrypt(encryptedFile);
        System.out.println("" + decryptedFile);
        // melakukan proses deksripsi
        Writter.writeFile("src/data/hasil deskripsi.txt", decryptedFile);
    }
}

