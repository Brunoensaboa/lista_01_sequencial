package lista01_java_exerc_04.src;
//Faça um Programa que peça as 4 notas bimestrais e mostre a média.




import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tec = new Scanner(System.in);
        System.out.println("digite a primeira nota: ");
        double n1 = tec.nextDouble();
        System.out.println("digite a segunda: ");
        double n2= tec.nextDouble();
        System.out.println("digite a terceira: ");
       double n3 = tec.nextDouble();
        System.out.println("digite a ultima nota: ");
        double n4= tec.nextDouble();
        tec.close();
        double media =(n1 + n2 + n3 + n4) / 4 ;
        System.out.println("sua média é "+ media);

    }

}

