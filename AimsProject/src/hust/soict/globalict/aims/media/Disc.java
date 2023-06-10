package hust.soict.globalict.aims.media;

public class Disc extends Media {
	private int length;
	private String director;

	public Disc(int id, String title, String category, float cost){
        super(id, title, category, cost);
    }

	public Disc(int id, String title, String category, float cost, int length, String director){
        super(id, title, category, cost);
		this.setDirector(director);
		this.setLength(length);
    }
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	
	public Disc () {
		super();
	}
	
	public Disc(int length, String director) {
		super (); 
		this.setLength(length);
		this.setDirector(director);
	}
}
