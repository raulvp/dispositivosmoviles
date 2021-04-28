
package pdm20215;

public class Animal {
    protected int cantPatas;
    protected String color;
    protected String tipo;
    protected String raza;

    public Animal(int cantPatas, String color, String tipo,String raza) {
        this.cantPatas = cantPatas;
        this.color = color;
        this.tipo = tipo;
        this.raza = raza;
    }

    public int getCantPatas() {
        return cantPatas;
    }

    public String getColor() {
        return color;
    }

    public String getTipo() {
        return tipo;
    }
    
    public void comer(){
        System.out.println("El animal esta comiendo");
    }
    
    
    
    
}
