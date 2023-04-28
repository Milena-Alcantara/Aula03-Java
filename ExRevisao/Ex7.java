package ExRevisao;

import java.util.Scanner;
public class Ex7 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String nome;

        int numI;

        System.out.println("Informe o seu nome: ");
        nome = s.next();

        System.out.println("Informe um número: ");
        numI = s.nextInt();

        for (int i = 0; i <numI; i++) {

            System.out.println(nome);

        }




    }
}
