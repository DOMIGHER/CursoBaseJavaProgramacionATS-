import java.util.Scanner;

public class EntradaSalida06 {

    public static void main(String[] args) {
        //Usar Scanner y instanciarlo
        // descargar la libreria
        //.in -> inpun para entrada de datos

        Scanner entrada1 = new Scanner(System.in);
        int numero1;
        System.out.println("Ingrese un numero");
        //.next depende del tipo de dato
        numero1 = entrada1.nextInt();
        System.out.println("Resultado: " + numero1);




        Scanner entrada2 = new Scanner(System.in);
        float num2;
        System.out.println("Ingrese float");
        // Los datos se ingresan con punto
        num2 = entrada2.nextFloat();
        System.out.println("Float " + num2);





        Scanner entrada3 = new Scanner(System.in);
        String cadena;
        System.out.println("Ingrese cadena");
        //Next guarda solo hasta un espacio en la cadena
        cadena = entrada3.next();
        System.out.println("Cadena: " + cadena);




        Scanner entrada4 = new Scanner(System.in);
        String cadena2;
        System.out.println("Ingrese cadena entera");
        cadena2 = entrada4.nextLine();
        System.out.println("Cadena entera: " + cadena2);



        Scanner entrada5 = new Scanner(System.in);
        char caracter3;
        System.out.println("Ingrese un caracter");
        // CharAt permite leer el primer numero
        caracter3 = entrada3.next().charAt(0);
        System.out.println("Char: " + caracter3);


    }
}
