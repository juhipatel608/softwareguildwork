/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sg.summativesums;

/**
 *
 * @author apprentice
 */
public class summativesums {

    public static void main(String[] args) {
        
        int [] array1 = { 1, 90, -33, -55, 67, -16, 28, -55, 15 };
        int [] array2 = { 999, -60, -77, 14, 160, 301 };
        int [] array3 = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 
        140, 150, 160, 170, 180, 190, 200, -99 };               
    
    
   int array1results = Adder(array1);
   int array2results = Adder(array2);
   int array3results = Adder(array3);
 
    System.out.println(" #1 Array Sum: " + array1results);
    System.out.println(" #2 Array Sum: " + array2results);
    System.out.println(" #3 Array Sum: " + array3results);
    
    }

    //Method for calculating the sum of all the numbers in the array 
    
        private static int Adder(int array[]) {

        int addedResult = 0;

        for (int i = 0; i < array.length; i++) {
            addedResult += array[i];
        } return addedResult;
    }
}
