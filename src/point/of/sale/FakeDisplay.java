package point.of.sale;

public class FakeDisplay implements Display {

    String lastLine = "";

    public FakeDisplay() {

    }

    @Override
    public void showLine(String line) {
        lastLine = line;
    }

    public String getLastLine(){
        return lastLine;
    }

}
