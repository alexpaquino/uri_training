import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;
 
public class Main {
 
   public static void main(String[] args) {
 
      Locale.setDefault(new Locale("en","US"));
      DecimalFormat df = new DecimalFormat("#####0.00");
      DecimalFormat df2 = new DecimalFormat("#######");
      Scanner sc = new Scanner(System.in);
      int qtde = sc.nextInt();
      double[] num = new double[qtde];
      Character[] ani = new Character[qtde];
      double contTot = 0.0; double contCoe = 0.0;   
      double contRat = 0.0; double contSap = 0.0;
       
      for (int i = 0; i < qtde; i++) {
          
         num[i] = sc.nextDouble();
         ani[i] = sc.next().charAt(0);
         contTot += num[i];
       
         switch(ani[i]){
         case 'C':
            contCoe += num[i];
            break;
         case 'R':
            contRat += num[i];
            break;
         case 'S':
            contSap += num[i];
            break;   
         }         
      }      
       
      System.out.println("Total: " + df2.format(contTot) + " cobaias");
      System.out.println("Total de coelhos: " + df2.format(contCoe));
      System.out.println("Total de ratos: " + df2.format(contRat));
      System.out.println("Total de sapos: " + df2.format(contSap));
      System.out.println("Percentual de coelhos: " + df.format(((contCoe * 100.0) / contTot)) + " %");
      System.out.println("Percentual de ratos: " + df.format(((contRat * 100.0) / contTot)) + " %");
      System.out.println("Percentual de sapos: " + df.format(((contSap * 100.0) / contTot)) + " %");   
      System.gc();
   }
}
