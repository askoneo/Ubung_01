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
    public String fragestellen(String farge){
        return " Die Frage ist: " + farge;
    }
}
