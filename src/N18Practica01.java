import javax.swing.*;

public class N18Practica01 {

    public static void main(String[] args) {
        int num1;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));

        //  Determinar si un número es múltiplo de 10
        if (num1%10 == 0){
            JOptionPane.showMessageDialog(null,"Es multiplo de 10");
        } else {
            JOptionPane.showMessageDialog(null,"No es multiplo de 10");
        }
    }
}
