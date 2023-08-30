/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.exercise_1;

/**
 *
 * @author Alex Joseph Penagos Valencia
 */
public class exercise_1 {

    public static void main(String[] args) {
        exercise_1 ex = new exercise_1();

        //System.out.println(ex.factorial(5));
        System.out.println(ex.factorial(5));
    }

    public int factorial_r(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return factorial_r(n - 1) * n;
        }

    }

    public int factorial(int numero){
        int resultado = 1;
       
        for (int i = 1; i <= numero;  i++) {
            resultado = resultado * i;
        }
        return resultado;
    }
}