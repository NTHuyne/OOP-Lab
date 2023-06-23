package hust.soict.globalict.aims.screen;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.*;

import hust.soict.globalict.aims.media.Book;
import hust.soict.globalict.aims.media.CompactDisc;
import hust.soict.globalict.aims.media.DigitalVideoDisc;
import hust.soict.globalict.aims.media.Disc;
import hust.soict.globalict.aims.media.Media;
import hust.soict.globalict.aims.store.Store;

public class StoreScreen extends JFrame {
    private Store store;

    public StoreScreen (Store store){
        this.store = store;
        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());

        cp.add(createNorth(), BorderLayout.NORTH);
        cp.add(createCenter(), BorderLayout.CENTER);

        setVisible(true);
        setTitle("Store");
        setSize(1024,768);
    }

    JPanel createNorth(){
        JPanel north = new JPanel();
        north.setLayout(new BoxLayout(north, BoxLayout.Y_AXIS));
        north.add(createMenuBar());
        north.add(createHeader());
        return north;
    }

    JPanel createCenter(){
        JPanel center = new JPanel();
        center.setLayout(new GridLayout(3,3,2,2));
        
        ArrayList<Media> mediaInStore = store.getItemsInStore();
        for(int i =0; i<9; i++){
            MediaStore cell = new MediaStore(mediaInStore.get(i));
            center.add(cell);
        }

        return center;
    }

    JMenuBar createMenuBar(){
        JMenu menu = new JMenu("Options");

        JMenu smUpdateStore = new JMenu("Update Store");
        smUpdateStore.add(new JMenuItem("Add Book"));
        smUpdateStore.add(new JMenuItem("Add CD"));
        smUpdateStore.add(new JMenuItem("Add DVD"));

        menu.add(smUpdateStore);
        menu.add(new JMenuItem("View Store"));
        menu.add(new JMenuItem("View cart"));

        JMenuBar menuBar = new JMenuBar();
        menuBar.setLayout(new FlowLayout(FlowLayout.LEFT));
        menuBar.add(menu);

        return menuBar;
    }

    JPanel createHeader(){
        JPanel header = new JPanel();
        header.setLayout(new BoxLayout(header, BoxLayout.X_AXIS));

        JLabel title = new JLabel("AIMS");
        title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 50));
        title.setForeground(Color.CYAN);

        JButton cart = new JButton("View cart");
        cart.setPreferredSize(new Dimension(100, 50));
        cart.setMinimumSize(new Dimension(100, 50));

        header.add(Box.createRigidArea(new Dimension(10,10)));
        header.add(title);
        header.add(Box.createHorizontalGlue());
        header.add(cart);
        header.add(Box.createRigidArea(new Dimension(10, 10)));

        return header;
    }

    public static void main(String[] args) {
        Store newStore = new Store();
        Media m1 = new Disc(1, "Rose", "Pop", 5.23f);
        Media m2 = new Book(2, "Fire World", "Comedy", 3.2f);
        Media m3 = new CompactDisc(3, "La vi en rose", "jazz", 4.5f, 4, "Hzard San", "Miko Lan Trinh");
        Media m4 = new DigitalVideoDisc(4, "Phu nu rat iu", "Cau be", "Cau be", 4, 6.1f);
        Media m5 = new Book(5, "Tinh hoa hoi tu", "GDCD", 3.1f);
        Media m6 = new Book(6, "Cam ky thi hoa", "GDCD", 8.1f);
        Media m7 = new Book(7, "Tinh hoa hoi tu", "Hi, I don't know", 1.1f);
        Media m8 = new CompactDisc(8, "Ca nhinh", "hihi", 4.5f, 5, "Cau be", "Miko Lan Trinh");
        Media m9 = new Book(9, "Hello world", "IT", 0.1f);
        Media m10 = new Book(10, "My Java", "ITSS", 0.2f);
        
        newStore.addMedia(m1);
        newStore.addMedia(m2);
        newStore.addMedia(m3);
        newStore.addMedia(m4);
        newStore.addMedia(m5);
        newStore.addMedia(m6);
        newStore.addMedia(m7);
        newStore.addMedia(m8);
        newStore.addMedia(m9);
        newStore.addMedia(m10);

        new StoreScreen(newStore);
    }

}
