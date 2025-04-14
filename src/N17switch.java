import javax.swing.*;

public class N17switch {
    public static void main(String[] args) {
        int dato;

        dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entre 1-5"));

        // se ingresa la variable(dato) con los datos de compara en los case
        switch (dato){
            case 1: JOptionPane.showMessageDialog(null,"Es 1");
            break; // En caso de cumplirse se termina -> siempre poner

            case 2: JOptionPane.showMessageDialog(null,"Es 2");
                break;

            case 3: JOptionPane.showMessageDialog(null,"Es 3");
                break;

            case 4: JOptionPane.showMessageDialog(null,"Es 4");
                break;

            case 5: JOptionPane.showMessageDialog(null,"Es 5");
                break;

            default: JOptionPane.showMessageDialog(null,"No esta en el rango entre 1-5");
            // En caso de no cumplir se pone en defecto

        }
    }
}
