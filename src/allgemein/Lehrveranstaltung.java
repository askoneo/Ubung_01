package allgemein;

public class Lehrveranstaltung {
    private String titel;
    private Dozierender dozent;
    private Studierender[] teilnehmer;
    private int teilnehmerAnzahl;
    private Vorlesungsstunde vorlesung;
    private Praktikumsstunde praktikum;

    public Lehrveranstaltung(String titel, Dozierender dozent, int maxTeilnehmer) {
        this.titel = titel;
        this.dozent = dozent;
        this.teilnehmer = new Studierender[maxTeilnehmer];  // Fixe Größe des Arrays
        this.teilnehmerAnzahl = 0;
    }

    public void addStudierender(Studierender student) {
        if (teilnehmerAnzahl < teilnehmer.length) {
            teilnehmer[teilnehmerAnzahl] = student;
            teilnehmerAnzahl++;
            System.out.println(student.getName() + " wurde zur Lehrveranstaltung hinzugefügt.");
        } else {
            System.out.println("Die Lehrveranstaltung ist voll!");
        }
    }

    public void setVorlesung(Vorlesungsstunde vorlesung) {
        this.vorlesung = vorlesung;
    }

    public void setPraktikum(Praktikumsstunde praktikum) {
        this.praktikum = praktikum;
    }

    public void anzeigen() {
        System.out.println("Lehrveranstaltung: " + titel);
        System.out.println("Dozent: " + dozent.getName());
        System.out.println("Teilnehmer (" + teilnehmerAnzahl + "):");
        for (int i = 0; i < teilnehmerAnzahl; i++) {
            System.out.println(" - " + teilnehmer[i].getName());
        }
        if (vorlesung != null) {
            vorlesung.anzeigen();
        }
        if (praktikum != null) {
            praktikum.anzeigen();
}
    }

}
