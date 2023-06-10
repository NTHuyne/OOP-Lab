package hust.soict.globalict.test.disc;

import hust.soict.globalict.aims.media.DigitalVideoDisc;

public class TestPassingParameter {
    public static void main(String[] args) {
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("JungLe");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");
        swap(jungleDVD, cinderellaDVD);
        System.out.println("Jungle dvd title: " + jungleDVD.getTitle());
        System.out.println("Cinderella dvd title: " + cinderellaDVD.getTitle());
        changeTitle(jungleDVD, cinderellaDVD.getTitle());
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
    }

    public static void swap(Object ob1, Object ob2) {
        Object temp = ob1;
        ob1 = ob2;
        ob2 = temp;
    }

    public static void changeTitle(DigitalVideoDisc dvd, String Title) {
        String oldTitile = dvd.getTitle();
        dvd.setTitle(Title);
        dvd = new DigitalVideoDisc(oldTitile);
    }
}
