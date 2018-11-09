/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sg.healthyhearts;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class healthyhearts {
    
    public static void main(String[] args) {
        Scanner capture = new Scanner(System.in);
        
        String ageString;
        double age;
        double maximum;
        double target;
        
        System.out.println("What is your age"); 
        ageString = capture.nextLine();
        
        age = Double.parseDouble(ageString);
        maximum = 220-age;
        target = (maximum*.85)-50;
        
        System.out.println("Your maximum heart rate is " + maximum);
        System.out.println("Your taget heart rate zone is " + target);
    }
}
    
    
    

