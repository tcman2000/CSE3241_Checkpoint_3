// package checkpoint3;
import java.util.*;

public class Menu {
    public static void main(String args[]) {
    	boolean menu = true;
    	//ArrayLists to store data
    	ArrayList<ArrayList<String>> books = new ArrayList<>();
    	ArrayList<ArrayList<String>> audiobooks = new ArrayList<>();
    	ArrayList<ArrayList<String>> movies = new ArrayList<>();
    	ArrayList<ArrayList<String>> albums = new ArrayList<>();
    	ArrayList<ArrayList<String>> ordered_items = new ArrayList<>();
    	
    	//Prints menu
    	while(menu) {
	    	System.out.println("Please select one of the options below by entering the corresponding letter");
	    	System.out.println("a. Add New records");
	    	System.out.println("b. Edit records");
	    	System.out.println("c. Search");
	    	System.out.println("d. Order items");
	    	System.out.println("e. Userful reports {DONT USE}");
	    	System.out.println("Enter anything else to exit");
	    	//Readers input
	    	Scanner reader = new Scanner(System.in);
	    	String input = reader.nextLine();
	  		int new_entry_index = 0;
	  		switch(input) {
	          	//Add
	          	case "a":
	          		//Ask for info
	          		System.out.println("Please select which type of media item you will be adding by entering the corresponding letter");
	          		System.out.println("a: book");
	          		System.out.println("b: audiobook");
	          		System.out.println("c: movie");
	          		System.out.println("d: album");
	          		String media_type = reader.nextLine();
	          		System.out.println("Enter the following information separated by a comma and no space (ie 1,2,dog)");
	          		System.out.println("Number of physical copies, Number of digital copies, name, year");
	          		String media_info = reader.nextLine();
	          		
	          		//Ask for info specific to media type
	          		System.out.println("Enter the additional following information separated by a comma and no space");
	          		System.out.println(media_type);
	          		if(media_type.equals("a")) {
	          			System.out.println("Number of pages, Number of chapters, author, and series");
	      				new_entry_index = books.size();
	          		} else if(media_type.equals("b")) {
	          			System.out.println("Chapters, length, and author");
	          			new_entry_index = audiobooks.size();
	          		} else if(media_type.equals("c")) {
	          			System.out.println("Length, content rating, and director");
	          			new_entry_index = movies.size();
	          		} else if(media_type.equals("d")) {
	          			System.out.println("Length and artist");
	          			new_entry_index = albums.size();
	          		}
	          		
		          	String additional_media_info = reader.nextLine();
		          	//Arraylist to store attributes
		          	ArrayList attributes = new ArrayList();
		          	String attribute = "";
		          	
		          	//Add unique key to attributes
		          	attributes.add(new_entry_index);
		          	//Parse attributes from input string and add to attributes
		          	while(media_info.length() > 0) {
	          			int comma_index = media_info.indexOf(",");
	          			if(comma_index != -1) {
	          				attribute = media_info.substring(0, comma_index);
	          				attributes.add(attribute);
	          				media_info = media_info.substring(comma_index+1);
	          			} else {
	          				attributes.add(media_info);
	          				media_info = "";
	          			}
	          		}
		          	
		          	media_info = additional_media_info;
		          	while(media_info.length() > 0) {
		          		int comma_index = media_info.indexOf(",");
	          			if(comma_index != -1) {
	          				attribute = media_info.substring(0, comma_index);
	          				attributes.add(attribute);
	          				media_info = media_info.substring(comma_index+1);
	          			} else {
	          				attributes.add(media_info);
	          				media_info = "";
	          			}
		          	}
		          	
		          	if(media_type.equals("a")) {
	          			books.add(attributes);
	          		} else if(media_type.equals("b")) {
	          			audiobooks.add(attributes);
	          		} else if(media_type.equals("c")) {
	          			movies.add(attributes);
	          		} else if(media_type.equals("d")) {
	          			albums.add(attributes);
	          		}
		          	
		          	//Test output
		          	System.out.println("Test output");
		          	System.out.println("Attributes of item added");
		          	for(int i = 0; i < attributes.size(); i++) {
		          		System.out.println(attributes.get(i));
		          	}
		          	System.out.println();
	              break;
	          case "b":
	              break;
	          case "c":
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
							if (books.get(i).get(3).toLowerCase().equals(bookName)) {
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
						System.out.println("Enter the name of the movie");
						String movieName = reader.nextLine();
						movieName.toLowerCase();
						for (int i = 0; i < movies.size(); i++) {
							if (movies.get(i).get(3).equals(movieName)) {
								System.out.println(movies.get(i));
								break;
							}
	
							if ((i - 1) == movies.size()) {
								System.out.println("Movie not found.");
							}
						}
						break;
					case "d":
						System.out.println("Enter the name of the Album");
						String albumName = reader.nextLine();
						albumName.toLowerCase();
						for (int i = 0; i < albums.size(); i++) {
							if (albums.get(i).get(3).equals(albumName)) {
								System.out.println(albums.get(i));
								break;
							}
	
							if ((i - 1) == albums.size()) {
								System.out.println("Album not found.");
							}
						}
						break;
					default:
						System.out.println("Invalid Input");
				}
	              break;
	          case "d":
	        	//Prompt user for type of item being ordered/activated
	        	  System.out.println("Please select which media item you are ordering/activating by entering the corresponding letter");
	        	  System.out.println("a: book");
	        	  System.out.println("b: audiobook");
	        	  System.out.println("c: movie");
	        	  System.out.println("d: album");
	        	  media_type = reader.nextLine();
	        	  
	        	  //Prompt user for product id
	        	  System.out.println("Please enter the product id of the item.");
	        	  int product_id = reader.nextInt();
	        	  reader.nextLine();
	        	  
	        	  //Prompt user for new order or activation
	        	  System.out.println("Please select new order or activate existing order by selecting the corresponding letter");
	        	  System.out.println("a: order new");
	        	  System.out.println("b: activate existing");
	        	  String order_select = reader.nextLine();
	        	  System.out.println(order_select);
	        	  //Add new order
	        	  if(order_select.equals("a")) {
	        		  System.out.println("Enter the following information separated by a comma and no space (ie 1,2,dog)");
	        		  System.out.println("PO number, Price, number of copies purchased, date of arrival");
	        		  String order_info = reader.nextLine();
	        		  
	        		  //Arraylist to store attributes
	        		  attributes = new ArrayList();
	        		  attribute = "";
		          	
	        		  //Parse attributes from input string and add to attributes
	        		  while(order_info.length() > 0) {
	        			  int comma_index = order_info.indexOf(",");
	        			  if(comma_index != -1) {
	        				  attribute = order_info.substring(0, comma_index);
	        				  attributes.add(attribute);
	        				  order_info = order_info.substring(comma_index+1);
	        			  } else {
	        				  attributes.add(order_info);
	        				  order_info = "";
	        			  }
	        		  }
	        		  ordered_items.add(attributes);
	        		  
	        		//Test output
			          	System.out.println("Test output");
			          	System.out.println("Attributes of order");
			          	for(int i = 0; i < attributes.size(); i++) {
			          		System.out.println(attributes.get(i));
			          	}
			          	System.out.println();
	        	  } else if (order_select.equals("b")) {
	    		  //Activate existing order
	        		  //Prompt for PO number and search for
	        		  System.out.println("Please enter the PO number of the order");
	        		  String po_num = reader.nextLine();
	        		  ArrayList order = null;
	        		  for(int i = 0; i < ordered_items.size(); i++) {
	        			  order = (ArrayList) ordered_items.get(i);
	        			  if(order.get(0).equals(po_num)) {
	        				i = ordered_items.size();  
	        			  }
	        		  }
	        		  ArrayList selected_table = null;
	        		  //Find corresponding media item
	        		  if(media_type.equals("a")) {
	        			  selected_table = books;
	        		  } else if(media_type.equals("b")) {
	        			  selected_table = audiobooks;
	        		  } else if(media_type.equals("c")) {
	        			  selected_table = movies;
	        		  } else if(media_type.equals("d")) {
	        			  selected_table = albums;
	        		  }
	        		  //Prompt if digital or physical copies
	        		  System.out.println("Enter 'a' if activating digital copies or 'b' if activating physical copies");
	        		  String digPhy = reader.nextLine();
	        		  ArrayList item = null;
	        		  //Find corresponding media item
	        		  for(int i = 0; i < selected_table.size(); i++) {
	        			  item = (ArrayList) selected_table.get(i);
	        			  if(item.get(0).equals(product_id)) {
	        				  i = selected_table.size();
	        			  }
	        		  }
	        		  //Update number of copies
	        		  if(digPhy.equals("a")) {
	        			  String new_copies = Integer.toString(Integer.parseInt((String) item.get(2)) + Integer.parseInt((String) order.get(2)));
	        			  item.set(2, new_copies);
	        		  } else if(digPhy.equals("b")) {
	        			  String new_copies = Integer.toString(Integer.parseInt((String) item.get(1)) + Integer.parseInt((String) order.get(2)));
	        			  item.set(1, new_copies);
	        		  }
	        		  
	        		//Test output
			          	System.out.println("Test output");
			          	System.out.println("Attributes of copies added");
			          	for(int i = 0; i < item.size(); i++) {
			          		System.out.println(item.get(i));
			          	}
			          	System.out.println();
	        	  }
	              break;
	          case "e":
	              break;
	          default:
	              System.out.println("Exiting.");
	              menu = false;
	      }
		
	  		//Test output of database
	  		System.out.println("All items");
	  		ArrayList test = null;
	  		System.out.println("\nbooks");
          	for(int i = 0; i < books.size(); i++) {
          		test = (ArrayList) books.get(i);
          		System.out.println("");
          		for(int j = 0; j < test.size(); j++) {
	          		System.out.println(test.get(j));
	          	}
          	}
          	System.out.println("\naudiobooks");
          	for(int i = 0; i < audiobooks.size(); i++) {
          		test = (ArrayList) audiobooks.get(i);
          		System.out.println("");
          		for(int j = 0; j < test.size(); j++) {
	          		System.out.println(test.get(j));
	          	}
          	}
          	System.out.println("\nmovies");
          	for(int i = 0; i < movies.size(); i++) {
          		test = (ArrayList) movies.get(i);
          		System.out.println("");
          		for(int j = 0; j < test.size(); j++) {
	          		System.out.println(test.get(j));
	          	}
          	}
          	System.out.println("\nalbums");
          	for(int i = 0; i < albums.size(); i++) {
          		test = (ArrayList) albums.get(i);
          		System.out.println("");
          		for(int j = 0; j < test.size(); j++) {
	          		System.out.println(test.get(j));
	          	}
          	}
    	}
    }
	
}