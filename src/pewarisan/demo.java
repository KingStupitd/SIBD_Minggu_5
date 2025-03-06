/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pewarisan;

/**
 *
 * @author KingStupitd
 */
public class demo {
    public static void main(String[] args) {
    a superOb = new a();
    b subOb = new b();

    System.out.println("SuperClass");
    superOb.x = 10;
    superOb.y = 20;
    superOb.TampilkanNilaiXY();

    System.out.println("SubClass");
    subOb.x = 5;
    subOb.y = 4;
    subOb.TampilkanNilaiXY();

    //member tambahan yang hanya ada pada subclass
    subOb.z = 50;
    subOb.tampilkanjumlah();
}
}
