public class Main {
    public static void main(String[] args) {

        byte a = 5;
        int b = 55;
        long l = 5L;
        float f = 55.5f;
        double d = 55.5;
        char c = 'a';
        boolean g = true;

        int ivo = 13;
        int maja = 17;
        int perica = 22;

        double prosjek = (double) (ivo + maja + perica) / 3;
        System.out.println("prosjek = " + prosjek);
        System.out.println("Matematička konstanta PI " + Math.PI);

//        Kvadriraj 2 broja

        double broj1 = 5;
        double broj2 = 12.0;

        double kvadrat1 = Math.pow(broj1, 2);
        double kvadrat2 = Math.pow(broj2, 2);

        System.out.println("Kvadrat broja " + broj1 + " je: " + kvadrat1);
        System.out.println("Kvadrat broja " + broj2 + " je: " + kvadrat2);

//        Izračunaj korijen broja XY
        double xy = 81.0;
        double korijen = Math.sqrt(xy);

        System.out.println("Drugi korijen broja " + xy + " je: " + korijen);

//        Izračunaj vrijednost varijable b na 3. potenciju

        double be = 4.0;
        double bNaTrecu = Math.pow(be, 3);

        System.out.println("Vrijednost varijable b (" + be + ") na 3. potenciju je: " + bNaTrecu);

        System.out.println("****************** Primjeri uvjetovanjanja *************");
        System.out.println();
//        if (b > 25) {
//            System.out.println("Broj " + b + " je veći od 25"); //izvršava se kada je izraz istinit
//        } else {
//            System.out.println("Broj " + b + " je manji od 25"); //izvršava se kada izraz nije istinit
//        }

        if (b > 25) {
            System.out.println("Broj " + b + " je veći od 25"); //izvršava se kada je izraz istinit
        } else if (b == 25) {
            System.out.println("Broj " + b + " je jednak 25");  //izvršava se kada je izraz istinit
        } else {
            System.out.println("Broj " + b + " je manji od 25"); //izvršava se kada izraz nije istinit
        }

        //Zadatak ovisno o unesenoj ocijeni od 1 - 5 ispiši tekstualnu vrijednost ocjene (nedovoljan, dovoljan, dobar, vrlo dobar, odličan)

        int ocjena = 3;


    }
}