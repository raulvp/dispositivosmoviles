
package pdm20215;


public class Oveja extends Animal{
    int cantLana;
    String colorLana;

    public Oveja(int cantLana, String colorLana, int cantPatas, String color, String tipo, String raza) {
        super(cantPatas, color, tipo, raza);
        this.cantLana = cantLana;
        this.colorLana = colorLana;
    }

    public int getCantLana() {
        return cantLana;
    }

    public String getColorLana() {
        return colorLana;
    }
    
    
    
    
    
    
}
