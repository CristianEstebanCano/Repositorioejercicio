import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner teclado =new Scanner(System.in);
        double numero1,numero2,suma,resta,multi,raiz;

        System.out.println("Escribe el primer valor: ");
        numero1 = teclado.nextDouble();
        System.out.println("Escribe el segundo valor: ");
        numero2 = teclado.nextDouble();

        suma=numero1+numero2;
        resta=numero1-numero2;
        multi=numero1-numero2;
        raiz= Math.sqrt(suma);

        System.out.println("La suma es " + suma);
        System.out.println("La resta es " + resta);
        System.out.println("La multiplicacion es " +multi);
        System.out.println("La raiz es " + raiz);


    }
}