public class Garment extends Product {
    private char size;

    public Garment(String name, double price, int quantity, char size) {
        super(name, price, quantity);
        this.size = size;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }
}
