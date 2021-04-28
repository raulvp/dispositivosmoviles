
package pdm20215;

public class PDM20215 {

  
    public static void main(String[] args) {
        /*Animal animalito = new Animal(4, "Negro", "herviboro");
        animalito.comer();*/
        
        Perro perrito = new Perro(4, "Negro", "Doberman", "Carnivoro", "Firulais", "Antidrogas");
        System.out.println("Perro que habilidad tienes: "
                +perrito.getHabilidad());
        System.out.println("Perro cuantas patas tienes: "
                +perrito.getCantPatas());
        
        /******Oveja****/
        Oveja ovejita = new Oveja(10, "Blanca", 4, "Blanco", "Herviboro", "Doolie");
        System.out.println("Oveja que tipo eres: "+ovejita.getTipo());
    
        Gato gatito = new Gato(2, 4, "Negro", "Carnivoro", "Angora");
        
        Humano humano = new Humano("Pedro");
        
    }
    
}
