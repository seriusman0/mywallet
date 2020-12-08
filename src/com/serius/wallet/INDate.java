/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.serius.wallet;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 *
 * @author serius
 */
public class INDate {
    public static void showDate() {
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");  
        Date date = new Date();  
        System.out.print(dateFormat.format(date)); 
    }
    
    public static void main(String Args[]){
        showDate();
    }
}
