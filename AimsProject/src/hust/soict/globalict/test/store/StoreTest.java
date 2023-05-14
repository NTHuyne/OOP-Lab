package hust.soict.globalict.test.store;
import hust.soict.globalict.aims.disc.DigitalVideoDisc;
import hust.soict.globalict.aims.store.Store;

public class StoreTest {
    public static void main(String[] args) {
        Store myStore = new Store();

        DigitalVideoDisc disc1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        myStore.addDVD(disc1);
    
        DigitalVideoDisc disc2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        myStore.addDVD(disc2);
    
        DigitalVideoDisc disc3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        myStore.addDVD(disc3);

        myStore.display();
    }
}
