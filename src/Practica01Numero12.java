import java.util.Scanner;

public class Practica01Numero12 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Obten el promedio de 3 calificaciones

        int calfi1;
        int califi2;
        int calfica3;
        int resultado;

        System.out.println("Ingrese la primer calificacion");
        calfi1 = entrada.nextInt();
        System.out.println("Ingrese la segunda calificacion");
        califi2 = entrada.nextInt();
        System.out.println("Ingrese la tercera calificacion");
        calfica3 = entrada.nextInt();

        resultado = (calfi1 + califi2 + calfica3)/3;
        System.out.println("EL resultado es " + resultado);



    }
}
