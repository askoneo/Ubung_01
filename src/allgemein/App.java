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
        
        String sprechstundeAntwort = studierender.sprechstundeAnfragen(dozierender, "04.01.2004", "10:00");
        System.out.println(sprechstundeAntwort);

        dozierender.feedbackGeben("Das ist ein Testfeedback.");
        dozierender.feedbackGeben("Das ist ein weiteres Testfeedback.");

        System.out.println("Feedbackliste:");
        for (String feedback : dozierender.getFeedbackListe()) {
            System.out.println("- " + feedback);
        }


    }
}