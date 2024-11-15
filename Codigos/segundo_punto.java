/*
Hacer un seguimiento (prueba de escritorio) del siguiente grupo de instrucciones.
INICIO
SUMA = 0
X = 20
SUMA = SUMA + X
Y = 40
X = X + Y ** 2
SUMA = SUMA + X / Y
ESCRIBA: “EL VALOR DE LA SUMA ES:”, SUMA
FIN_INICIO
Prueba de escritorio

SUMA X Y
0 20 40
20 1620

60.5
*/

public class segundo_punto {
    public static void main(String[] args) {
        float x,y,sum;
        x=20;
        sum=0;
        sum+=x;
        y=40;
        x+=Math.pow(y,2);
        sum+=x/y;
        System.out.println("EL VALOR DE LA SUMA ES: "+sum);
    }   
}
