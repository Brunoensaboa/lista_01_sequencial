package lista01_java_exerc_03.src;
//Faça um Programa que peça dois números e imprima a soma.




import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tec = new Scanner(System.in);
        System.out.println("digite um número: ");
        int a = tec.nextInt();
        System.out.println("digite outro número: ");
        int b = tec.nextInt();
        tec.close();
        int soma =(a+b);
        System.out.println("a soma entre os números é "+ soma);

    }

}
