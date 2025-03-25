package allgemein;
import allgemein.Studierender;

import allgemein.Dozierender;

public class App {
    Dozierender dozierender;
    Studierender studierender;
    String frage;
    String antwort;
    public static void main(String[] args){
        Dozierender dozierender = new Dozierender("Prof. Dr. Max Mustermann","Informatik", "1234");
        Studierender studierender = new Studierender("Max", "123456", "Informatik");
        
        String frage = "Was ist Was?";
        String antwort = dozierender.frageBeantworten(frage);
    }
}