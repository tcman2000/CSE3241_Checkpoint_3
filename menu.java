import java.util.*;

public class MyClass {
    public static void main(String args[]) {
    //Prints menu
      System.out.println("Please select one of the options below by entering the corresponding letter");
      System.out.println("a. Add New records");
      System.out.println("b. Edit records");
      System.out.println("c. Search");
      System.out.println("d. Order items");
      System.out.println("e. Userful reports {DONT USE}");
      //Readers input
      Scanner reader = new Scanner(System.in);
      String input = reader.nextLine();
      
      Map books = new HashMap();
      Map audiobooks = new HashMap();
      Map movies = new HashMap();
      Map albums = new HashMap();
      Map ordered_item = new HashMap();
      
      switch(input) {
          case a:
              System.out.println("Please select which type of media item you will be adding by entering the corresponding letter");
              System.out.println("a: book");
              System.out.println("b: audiobook");
              System.out.println("c: movie");
              System.out.println("d: album");
              String media_type = reader.nextLine();
              System.out.println("Enter the following information separated by a comma and no space (ie 1,2,dog)");
              System.out.println("Number of physical copies, Number of digital copies, name, year");
              String media_info = reader.nextLine();
              Switch(media_type) {
                  case a:
                      
                      System.out.println("Number of pages, Number of chapters, author, and series");
                      break;
                  case b:
                      break;
                  case c:
                      break;
                  case d:
                      break;
              }
              break;
          case b:
              break;
          case c:
              break;
          case d:
              break;
          case e:
              break;
          default:
              System.out.println("Improper input.");
      }
    }
