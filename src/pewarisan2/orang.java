/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pewarisan2;

/**
 *
 * @author KingStupitd
 */
public class orang {
    private String name;
    private double tinggi;
    private double berat;

    public orang (String name, double tinggi, double berat){
        this.name = name;
        this.tinggi = tinggi;
        this.berat = berat;
    }

    public String toString(){
        return ("Name : "+name+"\nTinggi :"+ tinggi + "\nBerat : "+berat);
    }

}
