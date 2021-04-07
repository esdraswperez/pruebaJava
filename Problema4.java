/*
 * Problema 4
 */
public class Problema4 {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {

            if (i % 3 != 0 && i % 5 != 0 && i % 15 != 5) {
                System.out.println(i);
            } else if (i % 15 == 0) {
                System.out.println(i + " Progrmación 1");
            } else if (i % 3 == 0) {
                System.out.println(i + " Progra");
            } // Eliminar condicional
        }
    }
}
