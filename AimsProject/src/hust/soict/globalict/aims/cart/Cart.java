package hust.soict.globalict.aims.cart;
import java.util.ArrayList;
import java.util.List;
import hust.soict.globalict.aims.media.Media;
import hust.soict.globalict.aims.media.MediaComparatorByCostTitle;
import hust.soict.globalict.aims.media.MediaComparatorByTitleCost;
import javafx.beans.property.FloatProperty;
import javafx.beans.property.SimpleFloatProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.Collections;

public class Cart {
//    public static final int MAX_NUMBERS_ORDERED = 20;
    private ObservableList<Media> itemsOrdered = FXCollections.observableArrayList();
    private FloatProperty totalCostProperty = new SimpleFloatProperty(0);
    private float total = 0;

    public Cart(){};

    public ObservableList<Media> getItemsOrdered(){
        return itemsOrdered;
    }

    public float totalCost(){
        for (Media t: this.itemsOrdered) {
        	total += t.getCost();
        }
        return this.total;
    }
    
    public void addMedia(Media media) {
    	this.itemsOrdered.add(media);
    }
    
    public void removeMedia(Media media) {
    	if(itemsOrdered.remove(media)){
    		System.out.println("Removed successfully");
    	}
    	else {
    		System.out.println("Removed failed");
    	}
    }

    public String print(){
        String cartReport = "";
        cartReport += "\n";
        for (int i = 0; i<23; i++){
            cartReport += "*";
        }
        cartReport += "CART";
        for (int i = 0; i<23; i++){
            cartReport += "*";
        }
        cartReport += "\n";
        cartReport += "Ordered Items"; 
        cartReport += "\n";
        for (int i = 0; i<itemsOrdered.size(); i++){
            cartReport += String.format("%-3d%s",i+1, itemsOrdered.get(i).toString());
            cartReport += "\n";
        }
        cartReport += "Total Cost: "; cartReport += String.format("%f", this.totalCost());
        cartReport += "\n";
        for (int i = 0; i<50; i++){
            cartReport += "*";
        }
        cartReport += "\n";
        return cartReport;
    }

    public void searchById(int id){
        int result = 0;
        String displayOutput = "\n";
        for (int i=0; i< itemsOrdered.size(); i++){
            if(itemsOrdered.get(i).getId()==id){
                displayOutput += String.format("%-3d%s",i+1, itemsOrdered.get(i).toString());
                displayOutput += "\n";
                result = 1;
            }
        }
        if(result==0){
            displayOutput += "No item found";
            System.out.println(displayOutput);
        }
        else{
            System.out.println(displayOutput);
        }
    }

    public void searchByTitle(String title){
        int result = 0;
        String displayOutput = "\n";
        for (int i=0; i< itemsOrdered.size(); i++){
            if(itemsOrdered.get(i).getTitle().equals(title)){
                displayOutput += String.format("%-3d%s",i+1, itemsOrdered.get(i).toString());
                displayOutput += "\n";
                result = 1;
            }
        }
        if(result==0){
            displayOutput += "No item found";
            System.out.println(displayOutput);
        }
        else{
            System.out.println(displayOutput);
        }
    }

    public void sortByTitle(){
        Collections.sort(itemsOrdered, new MediaComparatorByTitleCost());
        System.out.println("Media sorted by title:");
        print();
    }

    public void sortByCost() {
        Collections.sort(itemsOrdered, new MediaComparatorByCostTitle());
        System.out.println("Media sorted by cost:");
        print();
    }
    
    private void updateTotalCost() {
        float total = 0;
        for (Media media : itemsOrdered) {
            total += media.getCost();
        }
        totalCostProperty.set(total);
    }

    public float getTotalCost() {
        return totalCostProperty.get();
    }

    public FloatProperty getTotalCostProperty() {
        return totalCostProperty;
}
}
