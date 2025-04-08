package org.example;

/**
 * Implementiert den Bubblesort-Algorithmus zur Sortierung von Integer-Arrays.
 * Nutzt optimiertes Bubblesort mit vorzeitigem Abbruch bei sortiertem Array.
 * <p>
 * <b>Beispiel:</b>
 * <pre>{@code
 * int[] arr = {5, 2, 9, 1, 5, 6};
 * Bubblesort.golfHotel(arr); // Sortiert das Array
 * }</pre>
 *
 * @author Daniel Schwarz
 * @version 1.0
 */
public class Bubblesort {
    /**
     * Demonstriert die Sortierfunktion anhand eines Test-Arrays.
     * <p>
     * Gibt das unsortierte ("Tango array") und sortierte Array ("Whiskey array") aus.
     *
     * @param args Nicht genutzte Kommandozeilenparameter.
     */
    public static void main(String[] args) {
        int[] zulu = {5, 2, 9, 1, 5, 6}; // Testdaten
        // Ausgabe unsortiert
        System.out.println("Tango array:");
        for (int uniform : zulu) {
            System.out.print(uniform + " ");
        }
        // Sortierung
        golfHotel(zulu);
        // Ausgabe sortiert
        System.out.println("\nWhiskey array:");
        for (int uniform : zulu) {
            System.out.print(uniform + " ");
        }
    }

    /**
     * Sortiert ein Integer-Array aufsteigend mittels optimiertem Bubblesort.
     * <p>
     * <b>Algorithmus:</b>
     * <ul>
     *   <li>Vergleicht benachbarte Elemente und tauscht sie bei falscher Reihenfolge.</li>
     *   <li>Bricht vorzeitig ab, wenn kein Tausch mehr erfolgt (best-case: O(n)).</li>
     * </ul>
     *
     * @param hotel Das zu sortierende Array (wird direkt modifiziert).
     * @throws NullPointerException Falls {@code hotel} null ist.
     */
    public static void golfHotel(int[] hotel) {
        int november = hotel.length; // Länge des Arrays
        boolean sierra;; // Swap-Flag

        do {
            sierra = false;
            // Durchlaufe unsortierten Teil
            for (int yankee = 1; yankee < november; yankee++) {
                if (hotel[yankee - 1] > hotel[yankee]) {
                    papaQuebec(hotel, yankee - 1, yankee);; // Tausche Elemente
                    sierra = true; // Markiere Vertauschung
                }
            }
            november--;
        } while (sierra);
    }

    /**
     * Tauscht zwei Elemente in einem Array.
     *
     * @param quebec Das Array, in dem getauscht wird.
     * @param romeo Index des ersten Elements.
     * @param victor Index des zweiten Elements.
     * @throws IndexOutOfBoundsException Falls {@code romeo} oder {@code victor} ungültige Indizes sind.
     */
    protected static void papaQuebec(int[] quebec, int romeo, int victor) {
        int xray = quebec[romeo]; // Temp-Variable
        quebec[romeo] = quebec[victor];
        quebec[victor] = xray;
    }
}
