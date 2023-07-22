package Song;

public class SongDriver {
	   public static void main(String[] args) {
		      Playlist one = new Playlist();

		      Song song1 = new Song("Mehabooba", "Abhi", "KGF", 267000);
		      Song song2 = new Song("Rocky bhai", "Bhanu","KGF2", 207000);
		      Song song3 = new Song("Upavasa", "Sham", "Ramachari", 185000);
		      Song song4 = new Song("Anthu Inthu", "Rakisht", "Santhu straight forward", 185000);
		      
		      one.add(song1);               
		      one.add(song2);               
		      one.add(song3);                
		      one.add(song4);                
		     


		      one.print();

		      one.remove("679");   

		      one.print();

		      one.remove("Watch Me");

		      one.print(); 

		      one.clear();
		      one.print();
		       }
		    }   