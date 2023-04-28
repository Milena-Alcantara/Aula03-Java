package ExRevisao;

import java.util.Scanner;
public class Ex1 {


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int a, b, c;

        System.out.println("Digite um número ");
        a = s.nextInt();

        System.out.println("Digite um número ");
        b = s.nextInt();

        if(a == b){

            c = a + b;

            System.out.println("O Resultado dos dois valores digitados é:  "+c);

        }else{

            c = a*b;

            System.out.println("O Resultado dos dois valores digitados é:  "+c);

        }







    }
}