public class Aufgabe2 {

    public static int maxim(int[] numere) {
        int max = numere[0];
        for (int i = 1; i < numere.length; i++) {
            if (numere[i] > max) {
                max = numere[i];
            }
        }
        return max;
    }

    public static int minim(int[] numere) {
        int min = numere[0];
        for (int i = 1; i < numere.length; i++) {
            if (numere[i] < min) {
                min = numere[i];
            }
        }
        return min;
    }

    public static int sumaMaxima(int[] numere) {
        int sumaTotala = 0;
        int min = numere[0];

        for (int i = 0; i < numere.length; i++) {
            sumaTotala += numere[i];

            if (numere[i] < min) {
                min = numere[i];
            }
        }

        return sumaTotala - min;
    }

    public static int sumaMinima(int[] numere) {
        int sumaTotala = 0;
        int max = numere[0];

        for (int i = 0; i < numere.length; i++) {
            sumaTotala += numere[i];

            if (numere[i] > max) {
                max = numere[i];
            }
        }

        return sumaTotala - max;
    }
}