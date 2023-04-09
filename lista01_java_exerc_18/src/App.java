package lista01_java_exerc_18.src;
//Faça um Programa que peça dois números e imprima a soma.




import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tec = new Scanner(System.in);
        System.out.println("digite o tamanho do arquivo em MB: ");
        int arquivo = tec.nextInt();
        System.out.println("digite a velocidade da internet em Mbps: ");
        int velocidade = tec.nextInt();
        tec.close();
        int tempo =(arquivo*8)/(velocidade*60);
        System.out.println("aproximadamente "+ tempo+" minutos para baixar o arquivo");

    }

}
