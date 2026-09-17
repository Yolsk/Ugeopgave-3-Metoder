public class debug {
    /* Hvis du kører programmet får du en række fejl.
     * Fix programmet så det kan køre
     * outputtet bliver:
     * "7 is the smallest!"
     *
     *  OBS! Skriv hvad du har gjort som kommentar ud for hver linje du fixer
     */


    void main() {

        int smaller = 0; // deklareret og initialiseret smaller variabel
        int a = 7, b = 42;

        smaller = minimum(a, b);            // gemt minimum i smaller

        if (smaller == a) { // erstattet curlys med paranteser

            System.out.println( a + " is the smallest!"); // tilføjet a variabel i stedet a i String.

        }

    }

      int minimum(int a, int b) {   // rettet datatype fra void til int
        int smaller;                // deklareret smaller variabel

        if (a < b) {
            smaller = a;            // fjernet datatype int, fordi den er deklareret i starten af metoden.
        } else {                    // fjernet bentingelse (a >= b)
            smaller = b;            // fjernet data int, fordi den er deklareret i starten af metoden
        }

        return smaller;
    }
}
