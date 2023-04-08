package lista01_java_exerc_15.src;
//Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um programa que nos dê:
//salário bruto.
//quanto pagou ao INSS.
//quanto pagou ao sindicato.
//o salário líquido.





import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
       Scanner tec = new Scanner(System.in);
       System.out.print("Digite o valor da sua hora de trabalho: ");
       double valorHora = tec.nextDouble();
       
       System.out.print("Digite o número de horas trabalhadas no mês: ");
       double horasTrabalhadas = tec.nextDouble();
       tec.close();
       double salarioBruto = valorHora * horasTrabalhadas;
       double inss = salarioBruto * 0.08;
       double sindicato = salarioBruto * 0.05;
       double impostoder = salarioBruto * 0.11;
       double salarioLiquido = salarioBruto - inss - sindicato - impostoder;
       
       System.out.println("Salário Bruto: R$"+ salarioBruto);
       System.out.println("Desconto INSS: R$ "+ inss);
       System.out.println("Desconto Sindicato: R$ "+ sindicato);
       System.out.println("Desconto IR: R$ "+impostoder);
       System.out.println("Salário Líquido: R$ "+salarioLiquido);
   }
     

        

    }



