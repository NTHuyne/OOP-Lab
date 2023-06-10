package hust.soict.globalict.aims.store;
import java.util.ArrayList;
import java.util.List;

import hust.soict.globalict.aims.media.*;
import java.util.Iterator;

public class Store {
    private List<Media> itemsInStore = new ArrayList<Media>();
//    private static int totalItems = 0;

    public Store(){}

    public void addMedia(Media media){
        this.itemsInStore.add(media);
    }

    public void removeMedia(String title) {
        Iterator<Media> iterator = itemsInStore.iterator();
        while (iterator.hasNext()) {
            Media media = iterator.next();
            if (media.getTitle().equals(title)) {
                iterator.remove();
            }
        }
    }

    public void display(){
        String storeReport = "";
        storeReport += "\n";
        for (int i = 0; i<23; i++){
            storeReport += "*";
        }
        storeReport += "STORE";
        for (int i = 0; i<23; i++){
            storeReport += "*";
        }
        storeReport += "\n";
        storeReport += "Ordered Items"; 
        storeReport += "\n";
        for (int i = 0; i<itemsInStore.size(); i++){
            storeReport += String.format("%-3d%s",i+1, itemsInStore.get(i).toString());
            storeReport += "\n";
        }
        storeReport += "Total Item: "; storeReport += String.format("%d", itemsInStore.size());
        storeReport += "\n";
        for (int i = 0; i<50; i++){
            storeReport += "*";
        }
        storeReport += "\n";
        System.out.println(storeReport);
    }
}
