package lista01_java_exerc_09.src;
//Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.




import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tec = new Scanner(System.in);
        System.out.println("digite a temperatura em graus Fahrenheit: ");
      int fah = tec.nextInt();
       
        tec.close();
        int cel =(( fah - 32) * 5/9); 
        
        System.out.println( cel +"° Celsius. " );

    }

}

