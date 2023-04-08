package lista01_java_exerc_12.src;
//Tendo como dados de entrada a altura de uma pessoa, construa um
// algoritmo que calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura) - 58




import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tec = new Scanner(System.in);
        System.out.println("digite um numero inteiro ");
       double altura = tec.nextDouble();
        tec.close();
      double pesoid =(72.7*altura) - 58;
      System.out.println(pesoid+"é o peso ideal");
     

        

    }

}

