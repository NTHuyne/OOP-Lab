package hust.soict.globalict.aims;
import hust.soict.globalict.aims.media.*;
import hust.soict.globalict.aims.store.*;
import hust.soict.globalict.aims.cart.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aims {
    private Store store;
    private Cart currentCart;

    public Aims() {
        store = new Store();
    }

    public void run() {
        showMenu();
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        while (choice != 0) {
            switch (choice) {
                case 1:
                    viewStore();
                    break;
                case 2:
                    updateStore();
                    break;
                case 3:
                    seeCurrentCart();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
            showMenu();
            choice = scanner.nextInt();
        }

        System.out.println("Exiting the application. Goodbye!");
        scanner.close();
    }

    public static void showMenu() {
        System.out.println("AIMS: ");
        System.out.println("--------------------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3");
    }

    public void viewStore() {
        store.display();
        storeMenu();
    }

    public static void storeMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. See a media's details");
        System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
        System.out.println("4. See current cart");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4");
    }

    public void updateStore() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 to add a media : 2 to remove a media: ");
        int choice = scanner.nextInt();
        scanner.close();

        if (choice == 1) {
            System.out.println("Enter the details of the media to add:");
            System.out.println("Title: ");
            String title = scanner.next();
            System.out.println("Type (1 for Book, 2 for DVD, 3 for CD): ");
            int type = scanner.nextInt();
            System.out.println("ID: ");
            int id = scanner.nextInt();
            System.out.println("Cost: ");
            float cost = scanner.nextFloat();
            
			if (type == 1) {
                System.out.println("Author: ");
                String author = scanner.next();
                System.out.println("Category: ");
                String category = scanner.next();
                Book book = new Book(id, title, category, cost);
                book.addAuthor(author);
                store.addMedia(book);
                System.out.println("Book added to the store.");
            } else if (type == 2) {
                System.out.println("Director: ");
                String director = scanner.next();
                System.out.println("Category: ");
                String category = scanner.next();
                System.out.println("Length: ");
                int length = scanner.nextInt();
                DigitalVideoDisc dvd = new DigitalVideoDisc(title, category, director, length, cost);
                store.addMedia(dvd);
                System.out.println("DVD added to the store.");
            } else if (type == 3) {
                System.out.println("Artist: ");
                String artist = scanner.next();
                System.out.println("Category: ");
                String category = scanner.next();
                System.out.println("Director: ");
                String director = scanner.next();
                System.out.println("Length: ");
                int length = scanner.nextInt();
                CompactDisc cd = new CompactDisc(id, title, category, cost, length, director, artist);
                store.addMedia(cd);
                System.out.println("CD added to the store.");
            } else {
                System.out.println("Invalid media type. Media not added to the store.");
            }
        } else if (choice == 2) {
            System.out.println("Enter the title of the media to remove: ");
            String title = scanner.next();
            store.removeMedia(title);
        } else {
            System.out.println("Invalid choice. Returning to the main menu.");
        }
    }

    public void seeCurrentCart() {
        System.out.println("Current Cart:");
        for (Media media : currentCart.getItemsOrdered()) {
            System.out.println(media);
        }
        cartMenu();
    }

    public static void cartMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Filter medias in cart");
        System.out.println("2. Sort medias in cart");
        System.out.println("3. Remove media from cart");
        System.out.println("4. Play a media");
        System.out.println("5. Place order");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4-5");
    }

    public void addToCart(Media media) {
        currentCart.addMedia(media);
        System.out.println("Media added to the cart.");
    }

    public void removeFromCart(Media media) {
        currentCart.removeMedia(media);
        System.out.println("Media removed from the cart.");
    }

    public void playMedia(Media media) {
        if (media instanceof Playable) {
            Playable playable = (Playable) media;
            playable.play();
        } else {
            System.out.println("Cannot play the selected media.");
        }
    }

    public void filterMediaInCart() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 to filter by ID, or 2 to filter by title: ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("Enter the ID: ");
            int id = scanner.nextInt();
            List<Media> filteredList = new ArrayList<>();
            for (Media media : currentCart.getItemsOrdered()) {
                if (media.getId() == id) {
                    filteredList.add(media);
                }
            }
            displayMediaList(filteredList);
        } else if (choice == 2) {
            System.out.println("Enter the title: ");
            String title = scanner.next();
            List<Media> filteredList = new ArrayList<>();
            for (Media media : currentCart.getItemsOrdered()) {
                if (media.getTitle().equalsIgnoreCase(title)) {
                    filteredList.add(media);
                }
            }
            displayMediaList(filteredList);
        } else {
            System.out.println("Invalid choice.");
        }
        scanner.close();
    }

    public void sortMediaInCart(){
        System.out.println("Sort medias in cart by:");
        System.out.println("1. Title");
        System.out.println("2. Cost");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1) currentCart.sortByTitle();
        else if (choice == 2) currentCart.sortByCost();
        else System.out.println("Invalid choice. Please try again.");
        scanner.close();
    }

    public void removeMediaFromCart() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the title of the media to remove: ");
        String title = scanner.next();
        scanner.close();

        for (Media media : currentCart.getItemsOrdered()) {
            if (media.getTitle().equalsIgnoreCase(title)) {
                removeFromCart(media);
                return;
            }
        }
        System.out.println("Media not found in the cart.");
    }

    public void placeOrder() {
        System.out.println("Order placed. Thank you for shopping!");
        currentCart.getItemsOrdered().clear();
    }

    public void displayMediaList(List<Media> mediaList) {
        for (Media media : mediaList) {
            System.out.println(media);
        }
    }

    public static void main(String[] args) {
        Aims aims = new Aims();
        aims.run();
    }
}