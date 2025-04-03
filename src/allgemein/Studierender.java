package allgemein;
public class Studierender {
    String name;
    String matrikelnummer;
    String studiengang;

    public Studierender(String name, String matrikelnummer, String studiengang){
    this.name = name;
    this.matrikelnummer = matrikelnummer;
    this.studiengang = studiengang;

    }
    public void sprechstundenAnfrage(Dozierender dozent, String datum, String uhrzeit, String grund) {
        System.out.println(name + " hat eine Sprechstundenanfrage an " + dozent.getName() + " gesendet.");
        System.out.println("Gewünschter Termin: " + datum + " um " + uhrzeit);
        System.out.println("Grund: " + grund);
        dozent.sprechstundenBestätigung(this, datum, uhrzeit);
    }

    public String getName(){
        return name;
    }
    public void frageStellen(Dozierender dozent, String frage) {
        System.out.println(name + " fragt " + dozent.getName() + ": " + frage);
        dozent.frageBeantworten(this, "Bitte prüfen Sie die Vorlesungsunterlagen.");
    }
    public void feedbackGeben(Dozierender dozent, String nachricht) {
    dozent.feedbackErhalten(this, nachricht);
}
}
