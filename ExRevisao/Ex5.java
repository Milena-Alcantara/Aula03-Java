package ExRevisao;

import java.util.Scanner;
public class Ex5 {

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