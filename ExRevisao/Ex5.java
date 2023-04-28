package ExRevisao;

import java.util.Scanner;
public class Ex5 {

    //Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão entre 0 e 100.

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int Num[] = new int[20];

        for (int i = 0; i < Num.length; i++) {

            System.out.println("Digite um número: ");
            Num[i] = s.nextInt();
        }

        System.out.println("Os números entre zero e 100 são: ");
        for (int i = 0; i < Num.length; i++){

            if (Num[i] >= 0 && Num[i] <= 100){

                System.out.println(Num[i]);
            }



        }
    }
}