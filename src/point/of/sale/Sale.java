package point.of.sale;

public class Sale {

    //Something we don't have access to
    ArtR56 artR56;

    public Sale(ArtR56 artR56){
        this.artR56 = artR56;
    }

    public void scan(String barcode){
        artR56.display(barcode);
    }


}
