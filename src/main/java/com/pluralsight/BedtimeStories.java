package com.pluralsight;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class BedtimeStories {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter the name of a story (e.g., goldilocks.txt): ");
        String fileName = input.nextLine();


        File file = new File("src/main/resources/" + fileName);

        try {
            Scanner fileReader = new Scanner(file);
            int lineNumber = 1;


            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                System.out.println(lineNumber + ". " + line);
                lineNumber++;
            }

            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found. Please check the name and try again.");
        }
            }
        }


