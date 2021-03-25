/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luonglv.mathutil.main;

import com.luonglv.mathutil.MathUtility;

/**
 *
 * @author ASUS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        System.out.println("1st upload from local to Github");
//        System.out.println("welcome to Github");
        long expected = 120;
        long actual;
        int input = 5;
        
        actual= MathUtility.getFactorial(input);
        System.out.println("5!: Expectedt: "+ expected + "\tActual: "+actual);
        
        //case 2 0! thi sao? expect: 1
        actual = MathUtility.getFactorial(-1);
        System.out.println("0!: Expectedt: "+ expected + "\tActual: "+actual);
        
        //TEST AUTOMATION - DUNG THU VIEN
        
        
    }
    
}
