
package pdm20215;


public class Perro extends Animal{
    String nombre;
    String habilidad;
    
    public Perro(int cantPatas, String color, String tipo,String raza,String nombre,String habilidad){
        super(cantPatas, color, tipo, raza);
        this.nombre = nombre;
        this.habilidad = habilidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getHabilidad() {
        return habilidad;
    }
    
}
