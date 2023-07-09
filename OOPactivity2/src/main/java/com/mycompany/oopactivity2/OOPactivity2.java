/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.oopactivity2;

/**
 *
 * @author philip
 */



public class OOPactivity2 {

    public static void main(String[] args) {
        Sphere sphere = new Sphere("Sphere", 0, 3.5);
        Cube cube = new Cube("Cube", 0, 2.5);
        double sphereVolume = sphere.getVolume();
        double cubeVolume = cube.getVolume();
        System.out.println("Volume of the " + sphere.name + ": " + sphereVolume);
        System.out.println("Volume of the " + cube.name + ": " + cubeVolume);
    }
}
