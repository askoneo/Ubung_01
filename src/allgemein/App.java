package allgemein;

public class App {
    Dozierender dozierender;
    Studierender studierender;
    String frage;
    String antwort;
    public static void main(String[] args){
        Dozierender dozent = new Dozierender("Simon Nestler", "Informatik", "Raum 123");

        Studierender student1 = new Studierender("Max Mustermann", "123456", "UXD");

        // Teste Frage-Antwort System
        student1.frageStellen(dozent, "Wann ist die nächste Vorlesung?");
        student1.sprechstundenAnfrage(dozent, "18.04.2025", "15:30", "Fragen zur Klausur");
        student1.feedbackGeben(dozent, "Sehr interessante Vorlesung!");

        // Dozent zeigt Feedbacks an
        dozent.feedbackAnzeigen();

 // Lehrveranstaltung mit Platz für 2 Teilnehmer
        Lehrveranstaltung informatikKurs = new Lehrveranstaltung("Softwareentwicklung", dozent, 2);
        
        // Teilnehmer hinzufügen
        informatikKurs.addStudierender(student1);

        // Erstellen einer Vorlesungs- und Praktikumsstunde
        Vorlesungsstunde vorlesung = new Vorlesungsstunde("Java", "15.04.2025", "10:00", "J102");
        Praktikumsstunde praktikum = new Praktikumsstunde("Git Übungen", "16.04.2025", "14:00", "C303", "Studierender - Dozierender Interaktion");

        // Setzen der Vorlesung und des Praktikums
        informatikKurs.setVorlesung(vorlesung);
        informatikKurs.setPraktikum(praktikum);

        // Anzeige der Lehrveranstaltung
    informatikKurs.anzeigen();
}
}
