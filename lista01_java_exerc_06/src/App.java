package lista01_java_exerc_06.src;
//Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.




import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tec = new Scanner(System.in);
        System.out.println("digite a área do circulo");
        double rai = tec.nextDouble();
        tec.close();
        double area =( Math.pow(rai,2)* 3.14 ); 
        System.out.println( area +" de área" );

    }

}

