
package pdm20214;

public class PDM20214 {

   
    public static void main(String[] args) {
        /*Perro perrito = new Perro();
        perrito.color = "Cafe";
        perrito.edad = 2;
        
        perrito.comer();
        
        System.out.println("El perrito tiene color: "+perrito.color);
        */
        
        Perro perrito2 = new Perro("Negro", 3, "Doberman");
        System.out.println("El perrito 2 tiene color: "
                +perrito2.color);
        
        Perro perrito3 = new Perro("Gris", 5, "Buldog", "Hembra");
        System.out.println("El perrito 3 es de raza: "
                +perrito3.raza);
        
        System.out.println("El perrito 3 tiene edad de: "
                +perrito3.devolverEdad());
        
        perrito3.cambiarEdad(6);
        
        System.out.println("El perrito 3 tiene edad de: "
                +perrito3.getEdad());
    }
    
}
