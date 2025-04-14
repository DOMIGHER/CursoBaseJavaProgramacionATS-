import java.util.Scanner;

public class N08Operadores {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float num1, num2, suma, resta, multiplicacion, divi, resto;

        System.out.println("Ingrese un numero decimal");
        num1 = entrada.nextInt();
        System.out.println("Ingrese otro numero decimal");
        num2 = entrada.nextInt();

        // + para suma
        suma = num1 + num2;

        // - para resta
        resta = num1 - num2;

        // * para multiplicar
        multiplicacion = num1 * num2;

        // / para division
        divi = num1/num2;

        // % para el residuo -> También se le conoce como residuo -> valor que queda después de una división.
        resto = num1%num2;

        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicacion es: " + multiplicacion);
        System.out.println("La division es:" + divi);
        System.out.println("El resto es: " + resto);


    }
}
