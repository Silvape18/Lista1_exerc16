import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

      Scanner entrada = new Scanner(System.in);

       int mquadrados;
       int litrostintas;
       int latastintas;
       double total;


       System.out.print("Me diga o tamanho em metros quadrados da area que vai ser pintada: ");
       mquadrados = entrada.nextInt();

       litrostintas = (mquadrados / 3);
       latastintas =  litrostintas/18;
       total = latastintas * 80;

       System.out.println("A quantidade que precisa ser comprada é: " + latastintas);
       System.out.println("O preço total é: " +total );



 }
}
