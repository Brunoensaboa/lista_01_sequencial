package lista01_java_exerc_07.src;
//Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.




import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tec = new Scanner(System.in);
        System.out.println("digite o valor do lado do quadrado");
        double lado = tec.nextDouble();
        tec.close();
        double area =( Math.pow(lado,2) ); 
        double dobro = area *2;
        //System.out.println( area +" de área" ); inicialmente  pensei em mostras os dois valores ao usuario
        System.out.println( dobro +" é o dobro da área" );

    }

}

