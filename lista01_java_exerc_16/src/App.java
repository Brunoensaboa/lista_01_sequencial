package lista01_java_exerc_16.src;
//Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada. 
//Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a tinta é vendida em latas de 18 litros, 
//que custam R$ 80,00. Informe ao usuário a quantidades de latas de tinta a serem compradas e o preço total.





import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
       Scanner tec = new Scanner(System.in);
       System.out.print("Digite a área em metros quadrados a ser pintada ");
       double area = tec.nextDouble();
       tec.close();

       
       double litros = area/3;
       int latas = (int)Math.ceil(litros/18.0); // para aredondar para cima
       double preco = latas* 80;
       System.out.print("serão necessarias "+ latas+"latas de tinta com o total de R$"+preco);


       
   }
     

        

    }



