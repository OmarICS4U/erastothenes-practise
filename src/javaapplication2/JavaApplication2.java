/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication2;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author omsay9559
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       List<Integer> collect = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            if (primeCheck(i)) {
                collect.add(i);
                
            }
            
        }System.out.println(collect);

        System.out.println("\nTotal: " + collect.size());

    }

    public static boolean primeCheck(int number) {

        if (number == 1 ) return false;    
        if (number == 0 ) return false; 

        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    }
    

