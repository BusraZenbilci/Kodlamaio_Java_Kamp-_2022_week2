public class Main {

    public static void main(String[] args) {
        /*
        Product product = new Product();
        product.set_name("Laptop");
        product.setId(123);
        product.set_description("Asus");
        product.set_price(5000);
        product.set_stockAmount(3);
  */

        Product product = new Product(1 , "Laptop" , "Asus" ,3000 , 3 , "Siyah" );

        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        System.out.println(product.get_kod());

    }
}
