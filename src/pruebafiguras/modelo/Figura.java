package pruebafiguras.modelo;

public interface Figura {
    public String getNombre();
    public double calcularArea();
    public double calcularPerimetro();
    //Dibujar la figura en la pantalla, en modo texto*
    public void dibujarTxt();
}
