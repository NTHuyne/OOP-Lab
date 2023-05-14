package hust.soict.globalict.aims.disc;
public class DigitalVideoDisc {
    private String title;
    private String category;
    private String diretor;
    private int length;
    private float cost;
    private static int nbDigitalVideoDiscs = 0;
    private int id;

    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public String getCategory(){
        return this.category;
    }

    public String getDirector(){
        return this.diretor;
    }

    public int getLength() {
        return this.length;
    }

    public float getCost() {
        return this.cost;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public static int getNbDigitalVideoDiscs(){
        return nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(){
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
        return (disc.getTitle() == this.title) && (disc.getCategory() == this.category) && (disc.getDirector() == this.diretor) && (disc.getLength() == this.length) && (disc.getCost()==this.getCost());
    }

    public String toString(){
        return String.format(". DVD - %-20s - %-20s - %-20s - %-3d: %7f $", this.getTitle(), this.getCategory(), this.getDirector(), this.getLength(), this.getCost());
    }

    public boolean isMatch (String title){
        return this.getTitle().equalsIgnoreCase(title) ? true : false;
    }

}
