
package pdm20215;


public class Gato extends Animal {
    
    int cantVacunas;

    public Gato(int cantVacunas, int cantPatas, String color, String tipo, String raza) {
        super(cantPatas, color, tipo, raza);
        this.cantVacunas = cantVacunas;
    }

    public int getCantVacunas() {
        return cantVacunas;
    }
    
    
    
    
    
}
