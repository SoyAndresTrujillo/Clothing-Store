public class Main {
    public static void main(String[] args) {
        Product[] products = new Product[4];

        Accessory accessory1 = new Accessory("Garmin", 20000, 15, "Clock");
        Accessory accessory2 = new Accessory("Baseball", 200, 3, "Cap");

        Garment garment1 = new Garment("Jean", 100, 50, 'S');
        Garment garment2 = new Garment("T-shirt", 200, 20, 'M');

        products[0] = accessory1;
        products[1] = accessory2;
        products[2] = garment1;
        products[3] = garment2;

        for (Product product: products) {
            System.out.println(product.getName() + " - " + product.getPrice() + " USD");
        }
    }
}