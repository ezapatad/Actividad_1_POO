/*
Dado el radio de un círculo. Haga un algoritmo que obtenga el área del círculo y la longitud
de la circunferencia.
 */
import java.util.Scanner;
public class quinto_punto {
    public static void main(String[] args) {
        //Inicio del scanner para la lectura de datos
        try(Scanner scan = new Scanner(System.in)){
            double perimeter,area,ratio;

            //leemos el radio
            System.out.println("Ingrese el valor del radio");
            ratio = scan.nextDouble();

            //Verificamos que el numero sea positivo
            while (ratio<0){
                System.out.println("Ingrese un valor valido");
                ratio=scan.nextDouble();
            }


            //Hacemos los cálculos correspondientes
            area=Math.PI*Math.pow(ratio,2);
            perimeter=2*Math.PI*ratio;

            //Imprimimos en pantalla
            System.out.println("El perimetro es: "+perimeter+" y el Area es de: "+area);
        }
    }
}
