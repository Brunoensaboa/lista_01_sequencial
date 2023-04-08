package lista01_java_exerc_08.src;
//Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. 
//Calcule e mostre o total do seu salário no referido mês.




import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tec = new Scanner(System.in);
        System.out.println("digite quanto ganha por  hora: ");
        double gph = tec.nextDouble();
        System.out.println("digite a quantidade de horas trabalhadas no mês: ");
        double hrs = tec.nextDouble();
        tec.close();
        double salario =(gph*hrs); 
        
        System.out.println( salario +"  é o seu salário no referido mês" );

    }

}

