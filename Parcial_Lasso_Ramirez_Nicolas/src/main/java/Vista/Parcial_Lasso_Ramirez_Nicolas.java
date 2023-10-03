package Vista;

import PELI.Cine;
import PELI.Cliente;
import PELI.Funcionario;
import PELI.Ventas;
import javax.swing.JOptionPane;

public class Parcial_Lasso_Ramirez_Nicolas {

    public static void main(String[] args) {
        int CS, CN;
        Cine[] Cart = new Cine[4];
        Cart[0] = new Cine(1, "Openheimer", "21:00");
        Cart[1] = new Cine(2, "Barbie", "15:45");
        Cart[2] = new Cine(3, "Super Mario Bros", "17:30");
        Cart[3] = new Cine(4, "Bwah Bwah!", "13:40");

        String Menu, Menu1;
        Menu = "Bienvenido a CineScotia, selecciona 1 para continuar o 0 para terminar";
        CS = Integer.parseInt(JOptionPane.showInputDialog(null, Menu));

        if (CS == 1) {
            Menu1 = "Bienvenido a CineScotia, Para ver los distintos horarios selecciona: \n";
            for (int i = 0; i < Cart.length; i++) {
                Menu1 += (i + 1) + " Para " + Cart[i].getPelicula() + "\n";
            }
            Menu1 += "0 Para finalizar";
            CN = Integer.parseInt(JOptionPane.showInputDialog(null, Menu1));

            if (CN == 0) {
                JOptionPane.showMessageDialog(null, "Gracias por utilizar CineScotia");
            } else if (CN >= 1 && CN <= Cart.length) {
                Cine peliculaSeleccionada = Cart[CN - 1];

                Cliente cliente = new Cliente();

                Ventas venta = new Ventas();

                Funcionario funcionario = new Funcionario();

                funcionario.registrarVenta(cliente, peliculaSeleccionada, venta);
            } else {
                JOptionPane.showMessageDialog(null, "Selección no válida");
            }
        } else if (CS == 0) {
            JOptionPane.showMessageDialog(null, "Gracias por utilizar CineScotia");
        } else {
            JOptionPane.showMessageDialog(null, "Selección no válida");
        }
    }
}

