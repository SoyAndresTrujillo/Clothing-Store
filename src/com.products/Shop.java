public class Shop {
    private final Product[] inventory;
    private int quantityProducts;

    public Shop() {
        inventory = new Product[15];
        quantityProducts = 0;
    }

    public void addProduct(Product product) {
        inventory[quantityProducts] = product;
        quantityProducts++;
    }

    public void quantityProducts() {
        System.out.println("The quantity of product is: " + quantityProducts);
    }

    public void printProducts() {
        for (Product product: inventory) {
            if (product == null) {
                break;
            } else {
                System.out.println(product.getName() + " - " + product.getPrice() + " USD");
            }
        }
    }
}
