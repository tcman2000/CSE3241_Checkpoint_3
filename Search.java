import java.util.*;

public class Search {
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
      
      // [id, no_of_phys_cpoies, digCopies, name, year, no_pages, chapters]
      ArrayList<ArrayList<String>> books = new ArrayList<>();
      // [id, physCopies, digCopies, name, year, chapters, length_time]
      ArrayList<ArrayList<String>> audiobooks = new ArrayList<>();
      // [id, physCopies, digCopies, name, year, length_time, content_rating]
      ArrayList<ArrayList<String>> movies = new ArrayList<>();
      // [id, physCopies, digCopies, name, year, length_time]
      ArrayList<ArrayList<String>> albums = new ArrayList<>();
      ArrayList<ArrayList<String>> ordered_items = new ArrayList<>();
      
      switch(input) {
          case "a":
              System.out.println("Please select which type of media item you will be adding by entering the corresponding letter");
              System.out.println("a: book");
              System.out.println("b: audiobook");
              System.out.println("c: movie");
              System.out.println("d: album");
              String media_type = reader.nextLine();
              System.out.println("Enter the following information separated by a comma and no space (ie 1,2,dog)");
              System.out.println("Number of physical copies, Number of digital copies, name, year");
              String media_info = reader.nextLine();
              switch(media_type) {
                  case "a":
                      
                      System.out.println("Number of pages, Number of chapters, author, and series");
                      break;
                  case "b":
                      break;
                  case "c":
                      break;
                  case "d":
                      break;
              }
              break;
          case "b": // edit
              break;
          case "c": // search
            System.out.println("Please select which type of media item you will be adding by entering the corresponding letter");
            System.out.println("a: book");
            System.out.println("b: audiobook");
            System.out.println("c: movie");
            System.out.println("d: album");
            String media_type_search = reader.nextLine();
            switch(media_type_search) {
                case "a":
                    System.out.println("Enter the name of the book");
                    String bookName = reader.nextLine();
                    bookName.toLowerCase();
                    for (int i = 0; i < books.size(); i++) {
                        if (books.get(i).get(3).equals(bookName)) {
                            System.out.println(books.get(i));
                            break;
                        }

                        if ((i - 1) == books.size()) {
                            System.out.println("Book not found.");
                        }
                    }
                    break;
                case "b":
                    System.out.println("Enter the name of the book");
                    String audiobookName = reader.nextLine();
                    audiobookName.toLowerCase();
                    for (int i = 0; i < audiobooks.size(); i++) {
                        if (audiobooks.get(i).get(3).equals(audiobookName)) {
                            System.out.println(audiobooks.get(i));
                            break;
                        }

                        if ((i - 1) == audiobooks.size()) {
                            System.out.println("AudioBook not found.");
                        }
                    }
                    break;
                case "c":
                    System.out.println("Enter the name of the book");
                    String movieName = reader.nextLine();
                    movieName.toLowerCase();
                    for (int i = 0; i < movies.size(); i++) {
                        if (movies.get(i).get(3).equals(movieName)) {
                            System.out.println(movies.get(i));
                            break;
                        }

                        if ((i - 1) == movies.size()) {
                            System.out.println("Book not found.");
                        }
                    }
                    break;
                case "d":
                    System.out.println("Enter the name of the book");
                    String albumName = reader.nextLine();
                    albumName.toLowerCase();
                    for (int i = 0; i < albums.size(); i++) {
                        if (albums.get(i).get(3).equals(albumName)) {
                            System.out.println(albums.get(i));
                            break;
                        }

                        if ((i - 1) == albums.size()) {
                            System.out.println("Book not found.");
                        }
                    }
                    break;
                default:
                    System.out.println("Invalid Input");
            }
              break;
          case "d":
              break;
          case "e":
              break;
          default:
              System.out.println("Improper input.");
      }
    }
}
