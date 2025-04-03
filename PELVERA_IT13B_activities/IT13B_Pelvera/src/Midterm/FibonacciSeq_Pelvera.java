/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Midterm;

/**
 *
 * @author User
 */
public class FibonacciSeq_Pelvera {
    
    public static void main(String[] args) {

        int n = 10;
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i)+ " ");
            
        }
    }

    public static int fibonacci(int n) {
        return (n<= 1) ? n : fibonacci(n - 1) + fibonacci(n - 2);
    }
}

