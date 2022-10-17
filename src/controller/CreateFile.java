/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author 182110075
 */
public class CreateFile {

    public static void createAndWriteTarget(String target) {
        try {
            FileWriter myWriter = new FileWriter("target.txt");
            myWriter.write(target);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public static void createAndWriteDestiny(String destiny) {
        try {
            FileWriter myWriter = new FileWriter("destiny.txt");
            myWriter.write(destiny);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public static void createAndWriteExtension(String extension){
        try {
            FileWriter myWriter = new FileWriter("extension.txt");
            myWriter.write(extension);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
