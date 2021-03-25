/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luonglv.mathutil;

/**
 *
 * @author ASUS
 */
public class MathUtility {
    //day la class mo phong lai class Math, chua cac ham sai chung 
    //khong luu lai dieu gi
    
    public static final double PI = 3.14;
    
    //ham tinh n!
    //n! tang rat nhanh
    //21! tran kieu long
    //bai nay tinh tu 0-20
    public static long getFactorial(int n){
        if(n < 0 || n > 20) throw new IllegalArgumentException("n must be between 0 - 20");
        
        //song sot den day n se la tu 0 - 20
        if(n == 0 || n==1) return 1; //0!, 1! = 1;
        
        return n * getFactorial(n-1);
        //n! = n * (n-1)!
        //đệ quy: vòng lại chính mình với quy mô khác --> RECURSION
//        long result = 1;
//        for (int i = 2; i <= n; i++) {
//            result *= i;
//        }
//        return result;
    }
}
