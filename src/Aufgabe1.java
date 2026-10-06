public class Aufgabe1 {

    private static int rontunjit(int nota) {
        if (nota < 38) {
            return nota;
        }

        int diferenta = 5 - (nota % 5);
        if (diferenta < 3) {
            return nota + diferenta;
        } else {
            return nota;
        }
    }

    public static int[] noteInsuficiente(int[] note) {
        int count = 0;
        for (int i = 0; i < note.length; i++) {
            if (note[i] < 40) {
                count++;
            }
        }

        int[] noteInsuficiente = new int[count];
        int ind = 0;
        for (int i = 0; i < note.length; i++) {
            if (note[i] < 40) {
                noteInsuficiente[ind++] = note[i];
            }
        }

        return noteInsuficiente;
    }

    public static double media(int[] note) {

        if (note.length == 0) {
            return 0.0;
        }

        int count = 0;
        int suma = 0;
        for (int i = 0; i < note.length; i++) {
            count++;
            suma += note[i];
        }
        double medie = suma / count;
        return medie;
    }

    public static int[] rotunjireNote(int[] note) {
        int[] noteRotunjite = new int[note.length];
        for (int i = 0; i < note.length; i++) {
            noteRotunjite[i] = rontunjit(note[i]);
        }
        return noteRotunjite;
    }

    public static int notaMaxima(int[] note) {
        int max = 0;
        for (int i = 0; i < note.length; i++) {
            if (rontunjit(note[i]) > max) {
                max = rontunjit(note[i]);
            }
        }
        return max;
    }
}
