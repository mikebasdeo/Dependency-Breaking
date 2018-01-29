package point.of.sale;

public class FakeDisplay implements Display {


    public FakeDisplay() {

    }

    public void showLine(String line) {
        System.out.println(line);
    }


}
