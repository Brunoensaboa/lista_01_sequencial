package lista01_java_exerc_11.src;
//Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
 //o produto do dobro do primeiro com metade do segundo .
 //a soma do triplo do primeiro com o terceiro.
 //o terceiro elevado ao cubo.




import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tec = new Scanner(System.in);
        System.out.println("digite um numero inteiro ");
        int num1 = tec.nextInt();
        System.out.println("digite outro numero inteiro ");
        int num2 = tec.nextInt();
        System.out.println("digite um numero real ");
       double num3 = tec.nextDouble();
        tec.close();
      double r1 = (2 * num1) * (num2 / 2.0);
      System.out.println("o produto do dobro do primeiro com metade do segundo é " + r1);
      double r2 = (3 * num1) + num3;
      System.out.println("a soma do triplo do primeiro com o terceiro é "+r2 );
      double r3 =  Math.pow(num3, 3);
      System.out.println("o terceiro elevado ao cubo é "+r3);

        

    }

}

