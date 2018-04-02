/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training2;

import java.util.ArrayList;

/**
 *
 * @author Rafli Putra
 */
public class Training2 {

//    public void prima(int input) {
//        boolean bilPrima = false;
//        for (int i = 0; i < input; i++) {
//            if (i == 2) {
//                bilPrima = true;
//            } else {
//                ttt:
//                for (int j = 2; j < i; j++) {
//                    if (i % j == 0) {
//                        bilPrima = false;
//                        break ttt;
//                    } else {
//                        bilPrima = true;
//                    }
//                }
//            }
//
//            if (bilPrima) {
//                System.out.println("" + i);
//            }
//        }
//    }
    public ArrayList prima2(int input) {
        ArrayList number = new ArrayList();
        for (int i = 2; i < input; i++) {
            boolean isPrima = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrima = false;
                    break;
                }
            }
            if (isPrima == true) {
                number.add(i);
            }
        }
        return number;
    }

    public ArrayList fibonacci(int input) {
        ArrayList fibbo = new ArrayList();
        int i;
        int fib[] = new int[input];

        fib[0] = 0;
        fib[1] = 1;

        for (i = 2;
                i < input;
                i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        for (i = 0;
                i < input;
                i++) {
            if (fib[i] < input && fib [i] >= 0) {
                System.out.print(fib[i] + " ");
            }
            //System.out.print(fib[i] + " ");
        }
        return fibbo;

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Training2 cetak = new Training2();
        System.out.println("Deret Bilangan Prima: ");
        //cetak.prima(100);
        System.out.println(cetak.prima2(100));
        System.out.println("\nDeret Bilangan Fibonacci: ");
        cetak.fibonacci(1000);
    }
}
