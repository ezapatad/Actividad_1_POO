/*
A la mamá de Juan le preguntan su edad, y contesta: tengo 3 hijos, pregúntele a Juan su
edad. Alberto tiene 2/3 de la edad de Juan, Ana tiene 4/3 de la edad de Juan y mi edad es
la suma de las tres. Hacer un algoritmo que muestre la edad de los cuatro.
 */
import java.util.Scanner;
class punto1 {
    public static void main(String[] args){
        try(Scanner scanner = new Scanner(System.in)){
        int edjuan,edalber, edana, edmama;
        edjuan=scanner.nextInt();
        edalber=2*edjuan/3;
        edana=4*edjuan/3;
        edmama=edalber+edana+edjuan;
        System.out.println("Las edades son: Alberto: "+edalber+ ", Juan: "+edjuan+", Ana: "+edana+", Máma de Juan: "+edmama);
        }
    }
}