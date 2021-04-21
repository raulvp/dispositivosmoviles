
package pdm20214;


public class Perro {
    //atributos
    String color;
    int edad;
    String raza;
    String sexo;

    public Perro(String color, int edad, String raza) {
        this.color = color;
        this.edad = edad;
        this.raza = raza;
    }

    public Perro(String color, int edad, String raza, String sexo) {
        this.color = color;
        this.edad = edad;
        this.raza = raza;
        this.sexo = sexo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    
    
    
    //metodos
    public void comer(){
        System.out.println("El perro come");
    }
    public void duerme(){
        System.out.println("El perro esta durmiendo");
    }
    
    public int devolverEdad(){
        return edad;
    }
    
    public void cambiarEdad(int edadNueva){
        edad = edadNueva;
    }
}
