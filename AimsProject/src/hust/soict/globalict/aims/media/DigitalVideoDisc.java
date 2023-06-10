package hust.soict.globalict.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {
    private String diretor;
    private int length;
    private static int nbDigitalVideoDiscs = 0;
    public String getDirector(){
        return this.diretor;
    }

    public int getLength() {
        return this.length;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public static int getNbDigitalVideoDiscs(){
        return nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(){
    	super();
    }

    public DigitalVideoDisc(String title){
        super();
        this.setTitle(title);
        nbDigitalVideoDiscs += 1;
        this.setId(nbDigitalVideoDiscs);
    }

    public DigitalVideoDisc(String title, String category, float cost){
        super();
        this.setTitle(title);
        this.setCategory(category);
        this.setCost(cost);
        nbDigitalVideoDiscs += 1;
        this.setId(nbDigitalVideoDiscs);
    }

    public DigitalVideoDisc(String title, String category, String director, float cost){
        super();
        this.setTitle(title);
        this.setCategory(category);
        this.setCost(cost);
        this.setDiretor(director);
        nbDigitalVideoDiscs += 1;
        this.setId(nbDigitalVideoDiscs);
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost){
        super();
        this.setTitle(title);
        this.setCategory(category);
        this.setCost(cost);
        this.setDiretor(director);
        this.setLength(length);
        nbDigitalVideoDiscs += 1;
        this.setId(nbDigitalVideoDiscs);
    }

    public boolean compareDVD(DigitalVideoDisc disc){
        return (disc.getTitle() == this.getTitle()) && (disc.getCategory() == this.getCategory()) && (disc.getDirector() == this.diretor) && (disc.getLength() == this.length) && (disc.getCost()==this.getCost());
    }


    public String toString(){
        return String.format(". DVD - %-20s - %-20s - %-20s - %-3d: %7f $", this.getTitle(), this.getCategory(), this.getDirector(), this.getLength(), this.getCost());
    }

    public boolean isMatch (String title){
        return this.getTitle().equalsIgnoreCase(title) ? true : false;
    }

	@Override
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}

}
