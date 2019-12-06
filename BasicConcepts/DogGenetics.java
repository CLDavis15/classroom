/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cld.basicconcepts;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author calebdavis
 */
public class DogGenetics {
    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        Random gen = new Random();
        
        int per1 = 0, per2 = 0, per3 = 0, per4 = 0, per5 = 0;
        String dogName = "";
        
        do {
            per1 = gen.nextInt(100) + 1;
            per2 = gen.nextInt(100 - per1) + 1;
            per3 = gen.nextInt(100 - per1 - per2) + 1;
            per4 = gen.nextInt(100 - per1 - per2 - per3) + 1;
            per5 = gen.nextInt(100 - per1 - per2 - per3 - per4);
            
        } while (per1 == 0 && per2 == 0 && per3 == 0 && per4 == 0 && per5 == 0);
        
        System.out.println("What's your dogs name?");
        dogName = reader.nextLine();
        
        System.out.println("Well then, I have this highly reliable report on "
           + dogName + "'s prestigious background right here.");
        System.out.println("");
        
        System.out.println(dogName + " is:");
        System.out.println("");
        
        System.out.println(per1 + "% St. Bernard");
        System.out.println(per2 + "% Chihuahua");
        System.out.println(per3 + "% Dramatic RedNosed Asian Pug");
        System.out.println(per4 + "% Common Cur");
        System.out.println(per5 + "% King Doberman");
        System.out.println("");
        
        System.out.println("WOW, that's QUITE the dog!");
        
        
    }
}
