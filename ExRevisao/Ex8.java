package ExRevisao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Ex8 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int salario;

        List<Double> sal = new ArrayList<>();

        System.out.println("Informe a quantidade de salários: ");
        salario = s.nextInt();

        for (int i = 0; i <salario ; i++) {

            System.out.println("Informe o valor de salário: ");
            sal.add(s.nextDouble());

        }
        double reajus;
        double prct;

        System.out.println("Informe o valor a ser reajustado: ");
        reajus = s.nextDouble();



        List<Double> salII = new ArrayList<>();
        for (int i = 0; i <sal.size() ; i++) {

            prct =(sal.get(i)*reajus)/100 + sal.get(i);

            salII.add(prct);
            System.out.println(salII.get(i));

        }


    }
}
