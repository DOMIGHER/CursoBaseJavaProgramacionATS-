import javax.swing.*;

public class N21practica07 {

    public static void main(String[] args) {
        int num1, num2, num3;

        // Ingrese tres numeros y ordenelos de mayor a menor
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        num3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));

        if ((num1>num2) && (num2>num3)){
            System.out.println("Numero " + num1 + " " + num2 +" "+ num3);

        }else if ((num1>num3) &&(num3>num2)){
            System.out.println("Numero " + num1 + " " + num3 + " " + num2);

        }else if ((num2>num1) && (num1>num3)){
            System.out.println("Numero " + num2 + " " + num1 + " " + num3);

        } else if ((num2>num3) && (num3>num1)) {
            System.out.println("Numero " + num2 + " " + num3 + " " + num1);

        } else if ((num3>num1) && (num1>num2)) {
            System.out.println("Numero " + num3 + " " + num1 + " " + num2);

        }else {
            System.out.println("Numero " + num3 + " " + num2 + " " + num1);
        }
    }
}
