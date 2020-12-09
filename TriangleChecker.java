import java.util.Scanner;

public class TriangleChecker {
  
  public enum TriangleType {
    NONE, 
    NORMAL,
    ISOSCELES,  // Gleichschenklig
    EQUILATERAL // Gleichseitig
  }


  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Geben Sie die Seitenlängen ein.");
    float a = enterFloat(s, "a: ");
    float b = enterFloat(s, "b: ");
    float c = enterFloat(s, "c: ");
    s.close();
    printAnalysis(a, b, c);
  }

  // Eingabe einer Seitenlänge
  private static float enterFloat(Scanner s, String prompt) {
    System.out.print(prompt);
    return s.nextFloat();
  }

  // Ausgabe der ermittelten Dreiecksart
  private static void printAnalysis(float a, float b, float c) {
    TriangleType type = checkTriangle(a, b, c);
    switch (type) {
      case NONE:
        System.out.println("Kein Dreieck");
        break;        
      case NORMAL:
        System.out.println("Dreieck");
        break;        
      case ISOSCELES:
        System.out.println("Gleichschenkliges Dreieck");
        break;        
      case EQUILATERAL:
        System.out.println("Gleichseitiges Dreieck");
        break;        
    }
  }

  // Analyse der Dreiecksart
  public static TriangleType checkTriangle(float a, float b, float c) {
    if(checkForNormal(a,b,c)){
      if(checkForEquilateral(a,b,c)) return TriangleType.EQUILATERAL;
      if(checkForIsosceles(a,b,c)) return TriangleType.ISOSCELES;
      return TriangleType.NORMAL;
    }
    return TriangleType.NONE;
  }

  public static boolean checkForEquilateral(float a, float b, float c){
    if(a == b && a == c) return true;
    return false;
  }
  
  public static boolean checkForIsosceles(float a, float b, float c){
    if(a == b || a == c || b == c) return true;
    return false;
  }
  
  public static boolean checkForNormal(float a, float b, float c){
    if((a > 0 || b > 0 || c > 0)&&
       (c <= a+b && b <= a+c && a <= c+b)
      ) return true;
    return false;
  }
  

}