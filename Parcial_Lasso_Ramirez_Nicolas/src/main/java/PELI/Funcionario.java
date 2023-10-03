package PELI;

import javax.swing.JOptionPane;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Funcionario {
    private String nombre;

    public Funcionario() {
        this.nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del funcionario:");
    }

    public void registrarVenta(Cliente cliente, Cine pelicula, Ventas venta) {
        System.out.println("Venta registrada por el funcionario: " + nombre);
        System.out.println("Cliente: DNI " + cliente.getDNI() + ", Cantidad de entradas: " + cliente.getCant());
        System.out.println("Pelicula: " + pelicula.getPelicula() + ", Sala: " + pelicula.getSala() + ", Horario: " + pelicula.getHorario());
        System.out.println("Fecha de la venta: " + venta.getFecha() + ", Hora de la venta: " + venta.getHora());

        escribirVentaEnArchivo(cliente, pelicula, venta);
    }

    public String getNombre() {
        return nombre;
    }

    private void escribirVentaEnArchivo(Cliente cliente, Cine pelicula, Ventas venta) {
        try (FileWriter writer = new FileWriter("ventas.txt", true);
             BufferedWriter bufferedWriter = new BufferedWriter(writer)) {

            String ventaInfo = "Funcionario: " + nombre + 
                    ", DNI Cliente: " + cliente.getDNI() + 
                    ", Cantidad de entradas: " + cliente.getCant() +
                    ", Pelicula: " + pelicula.getPelicula() + 
                    ", Sala: " + pelicula.getSala() +
                    ", Horario: " + pelicula.getHorario() + 
                    ", Fecha de la venta: " + venta.getFecha() +
                    ", Hora de la venta: " + venta.getHora();

            bufferedWriter.write(ventaInfo);
            bufferedWriter.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
