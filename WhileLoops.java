import java.util.Random;
import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Escribe un bucle while que genere números aleatorios hasta que salga el número 7. Has de usar la función getRandomNumber
        int i = getRandomNumber(10);
        while (i != 7) {
            System.out.println(i);
            i = getRandomNumber(10);
        }
        System.out.println("Número correcto (7), primer bucle acabado"); //cada vez que hago run me hago un lio porque no tengo forma de saber cuando acaba el primer bucle y empieza el segundo en la consola, de esta forma puedo saberlo

        //Escribe un bucle while que genere números aleatorios hasta que salga un número mayor a 70. Has de usar la función getRandomNumber
        int j = getRandomNumber(100);
        while (j <= 70) {
            System.out.println(j);
            j = getRandomNumber(100);
        }
        System.out.println("Número superior a 70, segundo bucle acabado");


            //Escribe un bucle do while que genere un número aleatorio entre 1 y 100. El usuario debe adivinar el número aleatorio y el programa debe seguir solicitando intentos hasta que el usuario adivine correctamente. Después de cada intento, el programa debe indicar si el número ingresado es mayor o menor que el número generado. Has de usar la función getRandomNumber
        int randomNumber=getRandomNumber(100);
        int tryNumber;
        do {
            System.out.println("Adivina el número aleatorio entre 1 y 100: ");
                    tryNumber=scanner.nextInt();
            if (tryNumber<randomNumber) {
                System.out.println("El número es mayor.");
            } else if (tryNumber>randomNumber){
                System.out.println("El número es menor.");
            }
        } while (tryNumber!=randomNumber);
        System.out.println("¡Número correcto! Aunque te ha costado un poco...");
                scanner.close();
    }

        /**
         * Function name: getRandomNumber
         *
         * @param number (int)
         * @return (int)
         *
         * Inside the function:
         * 1. choose a random integer between 1 and the number given
         */
        public static int getRandomNumber ( int number){
            return (int) (Math.random() * number) + 1;
        }
}
