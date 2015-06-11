/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superficies;

import java.util.Scanner;

/**
 *
 * @author dcuerdogarcia
 */
public class Vista {

    private static Scanner sc;

    /**
     * Pide datos para mostrar y hacer las operaciones correspondientes.
     *
     * @param mod Objeto Modelo
     */
    public static void askType(Modelo mod) {
        String shapeType;

        System.out.println("What shape would you like to find the area of? (square, circle, triangle, rectangle):");
        sc = new Scanner(System.in);
        shapeType = sc.nextLine();

        mod.setShapeType(shapeType);

        System.out.println("You said: " + shapeType);
    }

    /**
     *
     * @param mod Método para mostrar el área.
     */
    public static void showArea(Modelo mod) {
        System.out.println("The area for your " + mod.getShapeType() + ": " + mod.getArea());
    }

    /**
     *
     * @param mod Método que nos pide la longitud.
     */
    public static void sideLenght(Modelo mod) {
        System.out.println("what is the side length?");
        mod.setLength(sc.nextFloat());
    }

    /**
     *
     * @param mod Método que nos pide el radio del círculo.
     */
    public static void askRadius(Modelo mod) {
        System.out.println("What is the radius of the circle?");
        mod.setRadius(sc.nextFloat());
    }

    /**
     *
     * @param mod Método que nos pide la base del triángulo.
     */
    public static void askBase(Modelo mod) {
        System.out.println("What is the base length of the triangle?");
        mod.setLength(sc.nextFloat());
    }

    /**
     *
     * @param mod Método que nos pide la altura del triángulo.
     */
    public static void askHeight(Modelo mod) {
        System.out.println("What is the height of the triangle?");
        mod.setHeight(sc.nextFloat());
    }

    /**
     *
     * @param mod Método que nos pide la longitud del rectángulo.
     */
    public static void askWidth(Modelo mod) {
        System.out.println("what is the rectangles width?");
        mod.setLength(sc.nextFloat());
    }

    /**
     *
     *
     * @param mod Método para pedir el alto del triángulo.
     */
    public static void askRHeight(Modelo mod) {
        System.out.println("What is the rectangles height?");
        mod.setHeight(sc.nextFloat());
    }
}
