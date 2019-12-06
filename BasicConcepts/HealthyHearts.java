/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cld.basicconcepts;
import java.util.Scanner;

/**
 *
 * @author calebdavis
 */
public class HealthyHearts {
    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        
        int age, maxHeart;
        double minTarget, maxTarget;
        
        
        System.out.println("What is you age?");
        age = Integer.parseInt(reader.nextLine());
        
        maxHeart = 220 - age;
        minTarget = Math.round(maxHeart * .5);
        maxTarget = Math.round(maxHeart * .85);
        
        System.out.println("Your maximum heart rate should be " + maxHeart + " beats per minute");
        System.out.println("Your target HR Zone should is " + (int)minTarget + " - " + (int)maxTarget + " beats per minute");
        
    }
}
