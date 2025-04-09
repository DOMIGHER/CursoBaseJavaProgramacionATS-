public class OperadorDecrementoIncremento10 {

    public static void main(String[] args) {
        byte num1 = 5;
        byte num2 = 5;
        byte num3 = 5;

        // Si se coloca al inicio se añade, pero si se coloca despues solo se asigna el numero: El resultado es 5
        num3 = num3++;

        // ++ añade la suma de 1
        num1 = ++num1;

        // -- añade la resta de 1
        num2 = --num2;


        System.out.println("Aumento: " + num1);
        System.out.println("Decremento: "+ num2);
        System.out.println("Asugnacion: "+ num3);





    }
}
