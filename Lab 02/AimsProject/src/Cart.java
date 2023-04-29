public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    public static int qtyOrdered = 0;
    private float total = 0;

    public Cart(){};

    public void addDigitalVideoDisc(DigitalVideoDisc disc){
        if(qtyOrdered >= MAX_NUMBERS_ORDERED){
            System.out.println("The cart is almost full");
        }
        else{
            qtyOrdered ++; 
            this.itemsOrdered[qtyOrdered-1] = disc;
        }
    }

    public float totalCost(){
        for (int i = 0; i<qtyOrdered; i++){
            this.total = this.total + itemsOrdered[i].getCost();
        }
        return this.total;
    }

    public void show(){
        for (int i = 0; i<qtyOrdered; i++){
            System.out.println(itemsOrdered[i].getTitle());
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc){
        if(qtyOrdered == 0){
            System.out.println("No items!");
        }
        else{
            int opt = 0;
            for (int i = 0; i<qtyOrdered; i++){
                if(itemsOrdered[i].CompareDVD(disc)){
                    opt = 1;
                    for (int j = i; j<qtyOrdered; j ++){
                        itemsOrdered[j] = itemsOrdered[j+1];
                    }
                    qtyOrdered --;
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
}
