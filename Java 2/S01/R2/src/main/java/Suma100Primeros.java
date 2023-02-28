public class Suma100Primeros {
    public static void main (String [] args) {
        int total = 0;

        for (int i = 1; i <= 100; i++){
            total += i;
        }

        System.out.println("La suma  de los primero 100 numeros es: " + total );
    }
}