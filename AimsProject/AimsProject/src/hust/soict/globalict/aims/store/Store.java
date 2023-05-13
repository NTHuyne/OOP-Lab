package hust.soict.globalict.aims.store;
import hust.soict.globalict.aims.disc.DigitalVideoDisc;

public class Store {
    private DigitalVideoDisc itemsInStore[] = new DigitalVideoDisc[1000];
    private static int totalItems = 0;

    public Store(){}

    public void addDVD(DigitalVideoDisc disc){
        itemsInStore[totalItems] = disc;
        totalItems += 1;
    }

    public void removeDVD(DigitalVideoDisc disc){
        if(totalItems == 0){
            System.out.println("No items!");
        }
        else{
            int opt = 0;
            for (int i = 0; i<totalItems; i++){
                if(itemsInStore[i].CompareDVD(disc)){
                    opt = 1;
                    for (int j = i; j<totalItems; j ++){
                        itemsInStore[j] = itemsInStore[j+1];
                    }
                    totalItems --;
                } 
            }
            if(opt == 1){
                System.out.println("Delete successfully!");
            }
            else{
                System.out.println("Not found!");
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
        for (int i = 0; i<totalItems; i++){
            storeReport += String.format("%-3d%s",i+1, itemsInStore[i].toString());
            storeReport += "\n";
        }
        storeReport += "Total Item: "; storeReport += String.format("%d", totalItems);
        storeReport += "\n";
        for (int i = 0; i<50; i++){
            storeReport += "*";
        }
        storeReport += "\n";
        System.out.println(storeReport);
    }
}
