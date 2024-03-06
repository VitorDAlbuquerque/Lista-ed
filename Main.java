package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        ex14();
    }

    private static void ex11() {
        int p = 1, s = 1, g = 1;

        while (g < 1000) {


            p = g;
            g = g + s;
            s = p;

            System.out.println(" " + s);

        }
    }

    private static void ex12() {

        Scanner s = new Scanner(System.in);
        int i = 0;

        System.out.println("Digite a qtd de linhas que você quer");
        int a = s.nextInt();
        while (i <= a) {
            System.out.println("");
            for (int c = 0; c < i; c++) {
                System.out.print("*");
            }
            i++;

        }
    }

    private static void ex13() {

        for (int i = 1; i < 10; i += 2) {
            System.out.println("");

            for (int a = 12; a > i; a -= 2) {

                System.out.print(" ");
            }

                for (int c = 0; c < i; c++) {
                    System.out.print("*");
                }

            }

            for (int d = 7; d > 0; d -= 2) {

                System.out.println("");
                for (int a = 12; a > d; a -= 2) {

                    System.out.print(" ");
                }
                for (int c = 0; c < d; c++) {
                    System.out.print("*");
                }


            }

        }


        private static void ex14(){

        Scanner s = new Scanner(System.in);
        double notas[] = {5,7,9,10,2};
        double media =0;
        double total=0;
        for (double count:notas){

            total += count;
            media = total/notas.length;

        }
            System.out.println("A media é:" +media);
        for (int c = 0; c<notas.length; c++ ){
            if (notas[c] > media){

                System.out.println("As notas são:" +notas[c]);
            }
        }

    } 




    }
