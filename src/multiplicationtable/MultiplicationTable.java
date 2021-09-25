/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplicationtable;

import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author Angelina
 */

public class MultiplicationTable {

    /**
     * @param args the command line arguments
     */
    public static final String TEXT_GREEN= "\u001B[32m";
    public static final String TEXT_RED = "\u001B[31m";
    public static final String TEXT_RESET = "\u001B[0m";
        
    public static void main(String[] args) {
         
        
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        int attempts = 5;
        int correct = 0;
        
        System.out.printf("Let's multiply! %n");
        
        while (attempts>0){
            int num1 = random.nextInt(10-0+1)+0;
            int num2 = random.nextInt(10-0+1)+0;
            
            System.out.printf("%d * %d = ",num1,num2);
            int userAnswer = scanner.nextInt();
            
            if (userAnswer == (num1*num2)) {
                System.out.println(TEXT_GREEN + "Correct!" + TEXT_RESET);
                correct++;
            }else{
                System.out.println(TEXT_RED + "Wrong!" + TEXT_RESET);
            }
            attempts--;
        }
        if (correct == 5) {
            System.out.println("Great job!");
        } else if (correct == 3 || correct == 4){
            System.out.println("Fine, but you must study a bit more!");
        } else if (correct <= 2) {
            System.out.println("Start learning multiplicatin table NOW!");
        }
        
    }
}