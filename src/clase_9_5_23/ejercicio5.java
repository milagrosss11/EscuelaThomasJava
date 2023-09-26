package clase_9_5_23;

public class ejercicio5 {
    /*
    mostrar los numeros pares que hay entre el 1 y el 10

     */
    public static void main(String[] args) {
        //Whiley y for -> son bucles (estructuras repetitivas)
        //Whily
        System.out.println("while");
        System.out.println("_____");

        int i = 1;                   //declaracion
        while (i <= 10) {             //condicion
            if (i % 2 == 0) {
                System.out.println(i);
                i++;         //paso: no olvidar incrementar ->  i = i+1
            }
        }
    }
}


