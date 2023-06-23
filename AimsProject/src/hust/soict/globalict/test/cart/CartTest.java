package hust.soict.globalict.test.cart;
import hust.soict.globalict.aims.cart.Cart;
import hust.soict.globalict.aims.media.DigitalVideoDisc;

public class CartTest {
    public static void main(String[] args) {
        Cart anOrder = new Cart();

        DigitalVideoDisc disc1 = new DigitalVideoDisc(1, "The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        anOrder.addMedia(disc1);

        DigitalVideoDisc disc2 = new DigitalVideoDisc(2, "Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        anOrder.addMedia(disc2);

        DigitalVideoDisc disc3 = new DigitalVideoDisc(3, "Aladin", "Animation", 18.99f);
        anOrder.addMedia(disc3);
        // Print
        System.out.println(anOrder.print());
        // Search by Id
        anOrder.searchById(2);
        // Search by Title
        anOrder.searchByTitle("The Lion king");
    }
}
