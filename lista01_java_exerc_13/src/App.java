package lista01_java_exerc_13.src;
//Tendo como dados de entrada a altura de uma pessoa, construa um
// algoritmo que calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura) - 58




import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tec = new Scanner(System.in);
        System.out.println("digite um numero inteiro ");
       double altura = tec.nextDouble();
        tec.close();
      double pesoidh =(72.7*altura) - 58;
      System.out.println(pesoidh+"é o peso ideal para um homem ");
      double pesoidm =(62.1*altura) - 44.7;
      System.out.println(pesoidm+"é o peso ideal para uma mulher ");
     

        

    }

}

