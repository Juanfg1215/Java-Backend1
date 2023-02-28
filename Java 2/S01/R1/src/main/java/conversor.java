public class conversor {
    public static void main (String [] args){
        int number = 10;

        String binary = Integer.toBinaryString(number);

        System.out.println ("El numero entero " + number + " en binario es: " + binary);
    }
}