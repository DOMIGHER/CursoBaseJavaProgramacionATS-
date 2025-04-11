import java.util.Scanner;

public class Practica06Numeor15 {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double exponente = 2;
        double primerTermino;
        double SegundoTermino;

        double cuadradoPrimer;
        double doblepirmerporsegundo;
        double cuadradoSegundo;

        System.out.println("Ingrese primer termino");
        primerTermino = entrada.nextInt();
        System.out.println("Ingrese segundo termino");
        SegundoTermino= entrada.nextInt();

        doblepirmerporsegundo = 2*(primerTermino * SegundoTermino);
        cuadradoPrimer = Math.pow(primerTermino,exponente);
        cuadradoSegundo = Math.pow(SegundoTermino,exponente);

        System.out.println("El resultado de la ecuacion es: " + cuadradoPrimer + " + " + doblepirmerporsegundo + " + " + cuadradoSegundo);


    }

}
