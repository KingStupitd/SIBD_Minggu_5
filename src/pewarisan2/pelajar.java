/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pewarisan2;

/**
 *
 * @author KingStupitd
 */
public class pelajar extends orang{
    private String nim;
    private String asaiSekolah;
    private double nilai; // range : 0-50

    public pelajar (String name, double tinggi, double berat, String nim,
                    String sekolah, double nilai){
        super(name, tinggi, berat);
        this.nim = nim;
        asaiSekolah = sekolah;
        this.nilai = nilai;
    }

    public String toString(){
        return (super.toString()+"\nNIM :"+nim+"\nSekolah :"+asaiSekolah+
                "\nNilai :"+nilai);
    }
}
