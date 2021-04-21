
package pdm12021;

public class PDM12021 {
        
    
    public static void main(String[] args) {
        /*int x = 12;
        int y = 12;
        
        if(x>y){
            System.out.println("x="+x+" es mayor a y");
        }else if(x==y){
            System.out.println("x es igual a y");
        }else{
            System.out.println("y="+y+" es mayor a x");
        }*/
        //ejercicio de dados
        /*int dado1=4;
        int dado2=4;
        int dado3=2;
        
        if((dado1==6)&&(dado2==6)&&(dado3==6)){
            System.out.println("Excelente");
        }else if(((dado1==6)&&(dado2==6))||((dado1==6)&&(dado3==6))||((dado2==6)&&(dado3==6))){
            System.out.println("Muy Bien");
        }else if((dado1==6)||(dado2==6)||(dado3==6)){
            System.out.println("Regular");
        }
        else{
            System.out.println("Pesimo");
        }*/
        
        /****Estructura de control FOR******/
        
        /*for(int i=0;i<=20;i++){
            System.out.println("i: "+i);
        }*/
        
        int fila=5;
        int columna=4;
        
        for(int i=1;i<=fila;i++){
            for(int j=1;j<=columna;j++){
                System.out.print(i*j+" -");
            }
            System.out.println(" ");
        }
        
    }
    
}
