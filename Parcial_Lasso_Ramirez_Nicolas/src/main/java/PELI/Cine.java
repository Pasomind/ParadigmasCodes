package PELI;

public class Cine {
    private int Sala;
    private String Horario;
    private String Pelicula;

    public Cine(int Sala, String Pelicula, String Horario) {
        this.Sala = Sala;
        this.Horario = Horario;
        this.Pelicula = Pelicula;
    }

    public int getSala() {
        return Sala;
    }

    public void setSala(int Sala) {
        this.Sala = Sala;
    }

    public String getHorario() {
        return Horario;
    }

    public void setHorario(String Horario) {
        this.Horario = Horario;
    }

    public String getPelicula() {
        return Pelicula;
    }

    public void setPelicula(String Pelicula) {
        this.Pelicula = Pelicula;
    }
    
    public String getNombre() {
        return Pelicula;
    }

    public void setNombre(String Pelicula) {
        this.Pelicula = Pelicula;
    }

    public String getHora() {
        return Horario;
    }

    public void setHora(String Horario) {
        this.Horario = Horario;
    }
}
