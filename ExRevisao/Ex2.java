package ExRevisao;

import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {

//Faça um algoritmo que leia uma variável e some 5 caso seja par ou
//some 8 caso seja ímpar, imprimir o resultado desta operação.

        Scanner s = new Scanner(System.in);

        int n, r;

        System.out.println("Digite um número ");
        n = s.nextInt();

        if(n % 2 == 0){

            r = n+5;
            System.out.println("O Resultado é: "+r);

        }else{

            r = n+8;

            System.out.println("O Resultado é: "+r);

        }





    }
}
