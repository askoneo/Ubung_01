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
    public String sprechstundeAnfragen(Dozierender dozierender, String datum, String uhrzeit){
        return dozierender.sprechstundeAnfragen(this, datum, uhrzeit);
    }

    public String getName(){
        return name;
    }
}

