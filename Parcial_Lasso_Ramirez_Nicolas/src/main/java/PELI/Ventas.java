package PELI;

import javax.swing.JOptionPane;

public class Ventas {
    private String Fecha;
    private String Hora;

    public Ventas() {
        this.Fecha = JOptionPane.showInputDialog(null, "Ingrese la fecha de la venta (YYYY-MM-DD):");
        this.Hora = JOptionPane.showInputDialog(null, "Ingrese la hora de la venta (HR:MN):");
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String Hora) {
        this.Hora = Hora;
    }
}
