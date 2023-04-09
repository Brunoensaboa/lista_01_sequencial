package lista01_java_exerc_17.src;
//Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada. 
//Considere que a cobertura da tinta é de 1 litro para cada 6 metros quadrados e que a tinta é vendida em latas de 18 litros, 
//que custam R$ 80,00. Informe ao usuário a quantidades de latas de tinta a serem compradas e o preço total.
//Informe ao usuário as quantidades de tinta a serem compradas e os respectivos preços em 3 situações:
//comprar apenas latas de 18 litros;
//comprar apenas galões de 3,6 litros;
//misturar latas e galões, de forma que o desperdício de tinta seja menor. Acrescente 10% de folga e 
//sempre arredonde os valores para cima, isto é, considere latas cheias.





import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
       Scanner tec = new Scanner(System.in);
       System.out.print("Digite a área em metros quadrados a ser pintada ");
       int area = tec.nextInt();
       tec.close();

       
       double litros = area/6;
       double latas = Math.ceil(litros/18.0); // para aredondar para cima
       double preco = latas* 80;
       System.out.print("serão necessarias "+ latas+"latas de tinta com o total de R$"+preco);
       double galao = Math.ceil(litros/3.6);
       double valorg =galao * 25;

       double mixlatas = Math.ceil(litros/18);
       double mixgaloes= Math.ceil(litros-mixlatas*18)/ 3.6;
       if(litros- (mixlatas*18)%3.6!=0); {
        mixgaloes += 1;
       }
       double valormix = Math.ceil(mixlatas*80)+(mixgaloes*25);
       System.out.print("se for comprar latas de 18 litros ira precisar de "+latas+" lata(s) irão custar"+preco);
       System.out.print("se for comprar galões de 3.6 litros ira precisar de "+galao+" galão(ões) irão custar "+valorg);
       System.out.print("se deseja mesclar entre  latas e galões sera necessario " +mixlatas+ " lata(s) e "+ mixgaloes +" galão(ões) e ira custar R$ "+ valormix);


       




       
   }
     

        

    }



