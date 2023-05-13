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
        for (int i = 0; i<qtyOrdered; i++){
            cartReport += String.format("%-3d%s",i+1, itemsOrdered[i].toString());
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

    public void searchById(int id){
        int result = 0;
        String displayOutput = "\n";
        for (int i=0; i< qtyOrdered; i++){
            if(itemsOrdered[i].getId()==id){
                displayOutput += String.format("%-3d%s",i+1, itemsOrdered[i].toString());
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
        for (int i=0; i< qtyOrdered; i++){
            if(itemsOrdered[i].isMatch(title)){
                displayOutput += String.format("%-3d%s",i+1, itemsOrdered[i].toString());
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
}
