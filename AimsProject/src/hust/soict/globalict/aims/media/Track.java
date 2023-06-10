package hust.soict.globalict.aims.media;

public class Track implements Playable {
	private String title;
	private int length;
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	@Override
	public boolean equals(Object o) {
		if (o instanceof Track) 
			return (this.title.equals(((Track) o).getTitle()) && this.length == ((Track) o).getLength());
		else {
			return false;
		}
	}
	
	@Override
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}
	
	
}	
