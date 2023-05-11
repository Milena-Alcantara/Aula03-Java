package ExRevisao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Ex6 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        List<Integer> numb = new ArrayList<>();

        int n,  soma = 0;

            System.out.println("Digite a quantidade de números que você quer inserir: ");
            n = s.nextInt();

        for(int i = 0; i < n; i++){
            System.out.println("Informe um número: ");
            numb.add(s.nextInt());

             if(numb.get(i) > 0){
                soma+= numb.get(i);

             }else{
                 System.out.println("Você digitou um número negativo.");
                 break;

             }

        }
        System.out.println("O resultado da soma dos números digitados é:  " + soma);

    }
}
