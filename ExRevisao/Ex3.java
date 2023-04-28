package ExRevisao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) {



        Scanner s = new Scanner(System.in);
        List<Integer> N= new ArrayList<>();

        int numId, n, soma = 0;
        float mdEx, mdAp;

        System.out.println("Informe o número de identificação do aluno: ");
        numId = s.nextInt();


        for (int i = 0; i < 3; i++) { //pra coletar as tres notas
            System.out.println("Informe a nota do aluno: ");
            N.add(n = s.nextInt());

            soma +=N.get(i);
        }

        mdEx = soma/3;
        System.out.println(mdEx);

        mdAp = N.get(0) + N.get(1) *2 + N.get(2)*3 +mdEx/7;

        System.out.println("Aluno: " + numId);
        System.out.println("Notas");

        for (int i = 0; i < N.size(); i++) {
            System.out.println("Nota: " + N.get(i));
        }
        System.out.println("Media Exercicios: " + mdEx);

        System.out.print("Media de Aproveitamento: ");

        if (mdAp >= 90) {
            System.out.print(" Aluno APROVADO!");
        } else if (mdAp >= 75 && mdAp < 90) {
            System.out.print(" Aluno APROVADO!");

        } else if (mdAp >= 60 && mdAp < 75) {
            System.out.print(" Aluno APROVADO!");

        }else if (mdAp >= 40 && mdAp < 60) {
            System.out.print(" Aluno REPROVADO!");

        }else if (mdAp < 40) {
            System.out.print(" Aluno REPROVADO!");

        }else {
            System.out.print("Não encontrado.");
        }
    }
}
