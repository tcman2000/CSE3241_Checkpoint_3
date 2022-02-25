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
              System.out.println("Please select which type of media item you will be editing by entering the corresponding letter");
              System.out.println("a: book");
              System.out.println("b: audiobook");
              System.out.println("c: movie");
              System.out.println("d: album");
              String media_type = reader.nextLine();
              System.out.println("Please enter the item id of the media item you want to edit: ");
              int item_id = reader.nextInt();
              Switch(media_type) {
                  String edited_media_item;
                  case a:
                      System.out.println("Here is the current media item: " + books.get(item_id));
                      System.out.println("Enter the following information for the updated item separated by comma and no space (ie 1,2,dog)");
                      System.out.println("Number of physical copies, Number of digital copies, name, year, number of pages, number of chapters, author, series");
                      edited_media_item = reader.nextLine();
                      books.set(item_id, edited_media_item);
                      break;
                  case b:
                      System.out.println("Here is the current media item: " + audiobooks.get(item_id));
                      System.out.println("Enter the following information for the updated item separated by comma and no space (ie 1,2,dog)");
                      System.out.println("Number of physical copies, Number of digital copies, name, year, number of chapters, length, author");
                      edited_media_item = reader.nextLine();
                      audiobooks.set(item_id, edited_media_item);
                      break;
                  case c:
                      System.out.println("Here is the current media item: " + movies.get(item_id));
                      System.out.println("Enter the following information for the updated item separated by comma and no space (ie 1,2,dog)");
                      System.out.println("Number of physical copies, Number of digital copies, name, year, length, content rating, director");
                      edited_media_item = reader.nextLine();
                      movies.set(item_id, edited_media_item);
                      break;
                  case d:
                      System.out.println("Here is the current media item: " + albums.get(item_id));
                      System.out.println("Enter the following information for the updated item separated by comma and no space (ie 1,2,dog)");
                      System.out.println("Number of physical copies, Number of digital copies, name, year, length, artist");
                      edited_media_item = reader.nextLine();
                      albums.set(item_id, edited_media_item);
                      break;
              }
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
