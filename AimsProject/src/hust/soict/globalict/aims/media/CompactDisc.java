package hust.soict.globalict.aims.media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable {
	private String artist;
	private List<Track> tracks = new ArrayList<Track>();

	public CompactDisc(int id, String title, String category, float cost, int length, String director, String artist){
		super(id, title, category, cost, length, director);
		this.setArtist(artist);
	}

	public CompactDisc() {
		super();
	}
	
	public CompactDisc(String title, String artist) {
		super();
		this.setTitle(title);
		this.setArtist(artist);
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	public void addTrack(Track track) {
		this.tracks.add(track);
	}
	
	public void removeTrack(Track track) {
		if(this.tracks.remove(track)){
			System.out.println("Removed successfully");
		}
		else {
			System.out.println("Removed failed");
		}
	}
	
	public int getLength() {
		int totalLength = 0;
		for (Track t: this.tracks) {
			totalLength += t.getLength();
		}
		return totalLength;
	}

	@Override
	public void play() {
		for (Track t: this.tracks) {
			t.play();
		}
	}
	
	
}
