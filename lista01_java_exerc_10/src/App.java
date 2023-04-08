package lista01_java_exerc_10.src;
//Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre a temperatura em graus Fahrenheit.




import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tec = new Scanner(System.in);
        System.out.println("digite a temperatura em graus Celsius: ");
      int cel = tec.nextInt();
       
        tec.close();
        int fah =(( cel * 9/5) + 32 ); 
        
        System.out.println( fah +"° Fahrenheit. " );

    }

}

