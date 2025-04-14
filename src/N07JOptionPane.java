import javax.swing.JOptionPane;

public class N07JOptionPane {

    public static void main(String[] args) {

        String cadena;
        int entero;
        char caracter;
        double decimal;

        // showInputDialog = Permite ingresar texto
        cadena = JOptionPane.showInputDialog("Ingrese una cadena: ");

        // Integer.parseInt = Trasforma el numero entero en texto
        entero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entero: "));

        // .charAt(0); = Solo permite ingresar un caracter
        caracter = JOptionPane.showInputDialog("Ingrese un solo caracter: ").charAt(0);

        // Double.parseDouble = Trasforma el numero decimal en texto -> uso de .
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un numero decimal"));


        // showMessageDialog = Para mostrar mensajes
        // Se coloca un null, cadena con la variable concatenado
        JOptionPane.showMessageDialog(null,"La cadena es: " + cadena);
        JOptionPane.showMessageDialog(null,"El numero es: " + entero);
        JOptionPane.showMessageDialog(null,"El caracter es: " + caracter);
        JOptionPane.showMessageDialog(null,"El numero decimal es: " + decimal);

    }
}
