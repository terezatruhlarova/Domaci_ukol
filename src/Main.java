public class Main {
    public static void main(String[] args) {
        Zvire zvire1 = new Zvire("Micka", 3, TypZvirete.KOCKA);
        Zvire zvire2 = new Zvire("Rex", 5, TypZvirete.PES);
        Zvire zvire3 = new Zvire("Kanár", 1, TypZvirete.PTAK);


        System.out.println("Zvíře 1:");
        System.out.println("Jméno: " + zvire1.getJmeno());
        System.out.println("Věk: " + zvire1.getVek() + " let");
        System.out.println("Typ: " + zvire1.getTyp());

        System.out.println("Zvíře 2:");
        System.out.println("Jméno: " + zvire2.getJmeno());
        System.out.println("Věk: " + zvire2.getVek() + " let");
        System.out.println("Typ: " + zvire2.getTyp());

        System.out.println("Zvíře 3:");
        System.out.println("Jméno: " + zvire3.getJmeno());
        System.out.println("Věk: " + zvire3.getVek() + " let");
        System.out.println("Typ: " + zvire3.getTyp());
    }
}