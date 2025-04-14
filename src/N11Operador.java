public class N11Operador {

    public static void main(String[] args) {
        // El metodo de sqrt permite obtener la raiz
        double raiz = Math.sqrt(65.5);

        System.out.println("La raiz es "+ raiz);


        double base = 3, exponenete = 2;
        // pow para sacar el cuadrado de un numero
        double resultado = Math.pow(base,exponenete);
        System.out.println("El cuadrado de "+ base + " Elevado por " + exponenete +" es " + resultado);

        // round redondea el numero
        double num1 = 22.4;
        double resultado2 = Math.round(num1);
        System.out.println("El numero redondeado es:" + resultado2);

        // Random da un numero random
        double numRand = Math.random();
        System.out.println("El numero random es: " + numRand);

    }
}
