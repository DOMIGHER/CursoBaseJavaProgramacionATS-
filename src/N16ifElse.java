import javax.swing.*;

public class N16ifElse {

    public static void main(String[] args) {
        int num1, numComparacion = 5;
        // = Asignacion de variables

        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        //El if solo se ejecuta una vez if o else
        // if -> Condicional simple
        // if y else -> Condicional doble

        /* Operador de condiciones
        * == igual
        * != diferente
        * > mayor
        * >= mayor igual
        * < menor
        * <= menor o igual
        *
        * */
        if (num1 == numComparacion){
            JOptionPane.showMessageDialog(null,"Es igual " + numComparacion);
        }else {
            JOptionPane.showMessageDialog(null,"Es diferente " + numComparacion);
        }

    }
}
