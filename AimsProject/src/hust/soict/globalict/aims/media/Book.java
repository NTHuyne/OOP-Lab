package hust.soict.globalict.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
    private List<String> authors = new ArrayList<String>();
    
    public Book(){

    }
    
    public Book(String title, String category) {
    	super();
    	this.setCategory(category);
    	this.setTitle(title);
    }

    public Book(int id, String title, String category, float cost){
        super(id, title, category, cost);
    }

    public void addAuthor(String authorName){
        this.authors.add(authorName);
    }

    public void removeAuthor(String authorName){
        if(this.authors.remove(authorName)){
            System.out.println("Removed successfully");
        }else{
            System.out.println("Removed failed");
        }
    }

    public static void main(String[] args) {
        
    }
}
