package MetodosAtributos;

public class Rueda {
    public Rueda(String fabricante, int aro, double ancho ) {
        this.fabricante = fabricante;
        this.ancho = ancho;
        this.aro = aro;
    }

    public String getFabricante() {
        return fabricante;
    }

    public double getAncho() {
        return ancho;
    }

    public int getAro() {
        return aro;
    }

    private String fabricante;
    private double ancho;
    private int aro;
}
