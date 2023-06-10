package hust.soict.globalict.aims.media;
import java.util.Comparator;

public abstract class Media {
    private int id;
    private String title;
    private String category;
    private float cost;

    public Media(String title){
        super();
        this.setTitle(title);
    }

    public Media(int id, String title, String category, float cost){
        this.setId(id);
        this.setTitle(title);
        this.setCategory(category);
        this.setCost(cost);
    }

    public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
    public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
    
    public Media () {
    	super();
    }

    public int TitleComparator(Media other) {
        int titleComparison = this.getTitle().compareTo(other.getTitle());
        if (titleComparison != 0) {
            return titleComparison;
        }
        // If titles are the same, compare by cost
        return Float.compare(this.getCost(), other.getCost());
    }
    
    public int CostComparator(Media other) {
        int costComparison = Float.compare(this.getCost(), other.getCost());
        if (costComparison != 0) {
            return costComparison;
        }
        // If costs are the same, compare by title
        return this.getTitle().compareTo(other.getTitle());
    }
    
    public boolean isMatch(String keyword) {
        return title.toLowerCase().contains(keyword.toLowerCase());
    }
    
    @Override
    public boolean equals(Object o) {
    	if(o instanceof Media) {
    		if(this.title.equals(((Media) o).getTitle())) {
    			return true;
    		}
    		else {
    			return false;
    		}
    	}
    	else {
    		return false;
    	}
    }

}
