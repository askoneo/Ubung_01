public class Dozierender {
    String name;
    String fakultaet;  
    String bueronummer ;

  public Dozierender(String name, String fakultaet, String bueronummer){
      this.name = name;
      this.fakultaet = fakultaet;
      this.bueronummer = bueronummer;
  }
  public String frageBeantworten(String frage){
      return "Die Antwort auf die Frage:" + frage+ "ist...";
  }

}

