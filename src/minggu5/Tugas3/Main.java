/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu5.Tugas3;

/**
 *
 * @author KingStupitd
 */
public class Main {
    public static void main(String[] args) {
        animal animal = new animal();
        animal.makeNoise(); // Output: Walk

        Dog dog = new Dog();
        dog.makeNoise(); // Output: Bark

        animal animadog = new Dog();
        animadog.makeNoise(); // Output: Bark (karena overriding)

        // Penggunaan instanceof
        if (animal instanceof animal) {
            System.out.println("Animal is Animal!");
        }

        if (dog instanceof animal) {
            System.out.println("Dog is Animal!");
        }

        if (animadog instanceof animal) {
            System.out.println("animadog is Animal!");
        }

        if (animadog instanceof Dog) {
            System.out.println("Animal is Dog!");
        }
    }
}
