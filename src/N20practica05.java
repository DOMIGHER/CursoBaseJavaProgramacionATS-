import javax.swing.*;

public class N20practica05 {
    public static void main(String[] args) {
        int num1;
        float comparacion = 0;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero"));

        if (num1 <= 40){
            comparacion = num1 * 16;
        }if (num1 > 40) {
            comparacion = (40 * 16) + ((num1 - 40)*20);
        }

        System.out.println("El salario es " + comparacion);

    }
}
