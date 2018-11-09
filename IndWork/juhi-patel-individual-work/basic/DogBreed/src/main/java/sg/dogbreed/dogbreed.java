/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sg.dogbreed;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class dogbreed {
    
    public static void main(String[] args) {
        Scanner capture = new Scanner (System.in);
        Random random = new Random ();
        int totalPercent = 100;
        int workingPercent = 0;
        String dogName;
        String[] breeds = { "Husky", "Yorkie", "Labrador", "Great Dane", "Dalmation", "Wookie"};
        
        System.out.println("What is your four legged friends name???");
        dogName = capture.nextLine();
        System.out.println("Well then, I have this highly reliable report on "+ dogName +"'s prestigious background right here.");
        
       for (int i = 0; i < breeds.length; i++) {
           if ( i < breeds.length -1 ) {
               workingPercent = random.nextInt(totalPercent);     
               totalPercent -= workingPercent;
           }
       else {
               workingPercent = totalPercent;
               }
           System.out.println(workingPercent + "% " + breeds[i]);  
}
         System.out.println("Thats quite a dog");
    }
}

