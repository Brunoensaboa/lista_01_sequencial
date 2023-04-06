package lista01_java_exerc_05.src;
//Faça um Programa que converta metros para centímetros.




import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tec = new Scanner(System.in);
        System.out.println("digite um número em metros para ser convertido ");
        double met = tec.nextDouble();
        tec.close();
        double cent = (met * 100); 
        System.out.println( cent +" centímetros" );

    }

}

