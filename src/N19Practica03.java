import javax.swing.*;

public class N19Practica03 {
    public static void main(String[] args) {
        char letra;

        letra = JOptionPane.showInputDialog("Ingrese un caracter").charAt(0);

        //  Character.isUpperCase compara si el numero es mayuscula
        if (Character.isUpperCase(letra)){
            JOptionPane.showMessageDialog(null, "Es mayuscula");
        }else {
            JOptionPane.showMessageDialog(null, "Es minuscula");
        }
    }
}
