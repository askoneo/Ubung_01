package allgemein;

class Praktikumsstunde extends Vorlesungsstunde {
    private String aufgabe;

    public Praktikumsstunde(String thema, String datum, String uhrzeit, String raum, String aufgabe) {
        super(thema, datum, uhrzeit, raum);
        this.aufgabe = aufgabe;
    }

    public void anzeigen() {
        super.anzeigen();
    System.out.println("Aufgabe: " + aufgabe);
}
}
