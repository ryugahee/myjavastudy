package ch7;

interface Parserable {
  public abstract void parse(String fileName);
}

class ParserManager {
  public static Parserable getParser(String type)  {
    if (type.equals("XML")) {
      return new XMLParser();
    } else {
      Parserable p = new HTMLParser();
      return p;
    }
  }
}

class XMLParser implements Parserable {
  public void parse (String filename) {
    System.out.println(filename + "- XML parsing completed.");
  }
}

class HTMLParser implements Parserable {
  public void parse (String filename) {
    System.out.println(filename + "- HTML parsing completed.");
  }
}

public class ParserTest {

  public static void main(String[] args) {
    Parserable parser = ParserManager.getParser("XML");
    parser.parse("document.xml");
    parser = ParserManager.getParser("HTML");
    parser.parse("document2.html");
  }
}
