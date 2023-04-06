//Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].




import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tec = new Scanner(System.in);
        System.out.println("digite um numero: ");
        int num = tec.nextInt();
        tec.close();
        System.out.println("o numero digitado foi: "+num);

    }
}
