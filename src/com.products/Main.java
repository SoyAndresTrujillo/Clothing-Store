public class Main {
    public static void main(String[] args) {
        Accessory accessory1 = new Accessory("Garmin", 20000, 15, "Clock");
        Accessory accessory2 = new Accessory("Baseball", 200, 3, "Cap");

        Garment garment1 = new Garment("Jean", 100, 50, 'S');
        Garment garment2 = new Garment("T-shirt", 200, 20, 'M');

        Shop shop = new Shop();

        shop.addProduct(accessory1);
        shop.addProduct(accessory2);
        shop.addProduct(garment1);
        shop.addProduct(garment2);

        shop.quantityProducts();
        shop.printProducts();
    }
}