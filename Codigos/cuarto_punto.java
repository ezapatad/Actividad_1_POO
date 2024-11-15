
import java.util.Scanner;

/*
 Elabore un algoritmo que lea un número y obtenga su cuadrado y su cubo.
 */
public class cuarto_punto {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
        double x,cuadrado,cubo;
        System.out.println("Ingrese un número: ");
        x=scanner.nextDouble();
        cuadrado=Math.pow(x,2);
        cubo=Math.pow(x,3);
        System.out.println("Cuadrado del numero: "+cuadrado+", Cubo del numero: "+cubo);
        }
    }
}
