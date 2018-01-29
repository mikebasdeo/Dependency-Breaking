package point.of.sale;

public class Sale {

    //Things we don't have access to
    Storage storage;
   // ArtR56Display artR56;
    Display display;


    public Sale(Display display, Storage storage){
        this.display = display;
        this.storage = storage;
    }

    public void scan(String barcode){

        //display the barcode
        display.showLine(barcode);

        //lookup barcode in fake storage and get item
        display.showLine(storage.barcode(barcode));
    }


}
