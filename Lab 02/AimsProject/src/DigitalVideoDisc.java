public class DigitalVideoDisc {
    private String title;
    private String category;
    private String diretor;
    private int length;
    private float cost;

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

    public DigitalVideoDisc(){};

    public DigitalVideoDisc(String title){
        super();
        this.setTitle(title);
    }

    public DigitalVideoDisc(String title, String category, float cost){
        super();
        this.setTitle(title);
        this.setCategory(category);
        this.setCost(cost);
    }

    public DigitalVideoDisc(String title, String category, String director, float cost){
        super();
        this.setTitle(title);
        this.setCategory(category);
        this.setCost(cost);
        this.setDiretor(director);
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost){
        super();
        this.setTitle(title);
        this.setCategory(category);
        this.setCost(cost);
        this.setDiretor(director);
        this.setLength(length);
    }

    public boolean CompareDVD(DigitalVideoDisc disc){
        return (disc.getTitle() == this.title) && (disc.getCategory() == this.category) && (disc.getDirector() == this.diretor) && (disc.getLength() == this.length) && (disc.getCost()==this.getCost());
    }

}
