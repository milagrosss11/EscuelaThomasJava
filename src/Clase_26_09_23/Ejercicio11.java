package Clase_26_09_23;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        sc.useLocale(Locale.US);

        final double IVA = 0.21;
        System.out.println("Escribe un nro real");
        double precioSinIVA = sc.nextDouble();
        double precioConIVA = precioSinIVA * (1+IVA);
    }
}
