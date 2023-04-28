package ExRevisao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Ex4 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int  soma= 0;

        List<Integer> idade = new ArrayList<>(20);


        for (int i = 0; i < 20; i++) {

            System.out.println("Digite a idade: ");

            idade.add(s.nextInt());

        }

        System.out.println("----------- Pessoas e Idades ------------");
        for (int i = 0; i < idade.size(); i++) {
            System.out.println("pessoa " + i + " - " + idade.get(i));

        }

        for (int i = 0; i < idade.size(); i++) {

             soma += idade.get(i) ;

        }

        double media;
        media = soma /idade.size();
        System.out.println("A Media das idades é: "+ media);
        }

    }
