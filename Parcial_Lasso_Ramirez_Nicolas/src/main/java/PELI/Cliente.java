package PELI;

import javax.swing.JOptionPane;

public class Cliente {
    private int DNI;
    private int cant;

    public Cliente() {
        this.DNI = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el DNI del cliente:"));
        this.cant = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de entradas:"));
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }
}
