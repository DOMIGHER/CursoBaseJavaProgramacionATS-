import java.util.Scanner;

public class N13practica03Numero {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Ejercicio 3: Guillermo tiene N dólares. Luis
        //tiene la mitad de lo que posee Guillermo
        //Juan tiene la mitad de lo que poseen Luis y
        //Guillermo juntos

        int dineroguillermo;
        int dineroLuis;
        int dineroJuan;
        int resultado;

        System.out.println("Ingrese el dinero de Guillermo");
        dineroguillermo = entrada.nextInt();

        dineroLuis = dineroguillermo/2;
        dineroJuan = (dineroLuis + dineroguillermo)/2;

        resultado = dineroguillermo + dineroLuis + dineroJuan;

        System.out.println("Guillermo: " + dineroguillermo);
        System.out.println("Luis: " + dineroLuis);
        System.out.println("Juan: " + dineroJuan);
        System.out.println("El total es: " + resultado);


    }
}
