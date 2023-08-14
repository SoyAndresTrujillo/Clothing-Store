public class Accessory extends Product {
    private String kind;
    public Accessory(String name, double price, int quantity, String kind) {
        super(name, price, quantity);
        this.kind = kind;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }
}
