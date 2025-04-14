import java.util.Scanner;

public class N14Practica05Numero {



    public static void main(String[] args) {
        /*Ejercicio 5: La calificación final de un estudiante de
        Informática se calcula con base a las calificaciones de
        cuatro aspectos de su rendimiento académico:
        participación, primer examen parcial, segundo examen
        parcial y examen final. Sabiendo que las calificaciones
        anteriores entran a la calificación final con ponderaciones
        del 10%, 25%, 25% y 40%, Hacer un programa que calcule
        e imprima la calificación final obtenida por un estudiante.*/


        Scanner entrada = new Scanner(System.in);

        int calif10porciento;
        int calif120porciento;
        int calif225porciento;
        int calif40porciento;
        double calificaionFinal;

        System.out.println("Ingrese la califiacion de participacion");
        calif10porciento = entrada.nextInt();
        System.out.println("Ingrese calificaion de primer examen");
        calif120porciento = entrada.nextInt();
        System.out.println("Ingrese calificiaon de segundo examen");
        calif225porciento = entrada.nextInt();
        System.out.println("Ingrese calificaion del examen final");
        calif40porciento = entrada.nextInt();

       calificaionFinal = ( calif10porciento * 0.10) + (calif120porciento * 0.25) + (calif225porciento * 0.25 + (calif40porciento * 0.40));
        System.out.println("La calificaion final es " + calificaionFinal);


    }
}
