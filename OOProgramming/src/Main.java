public class Main {

    public static void main(String[] args) {

        String mesaj = "Vade oranı";

        Product product1 = new Product();  //create object
        product1.setName("Delonghi Kahve makinesi");
        product1.setDiscount(7);
        product1.setUnitPrice(7500);
        product1.setUnitsInStock(3);
        product1.setImageUrl("abssd1.jpg");


        Product product2 = new Product();  //create object
        product2.setName("Delonghi Kahve makinesi");
        product2.setDiscount(9);
        product2.setUnitPrice(5500);
        product2.setUnitsInStock(1);
        product2.setImageUrl("abssd2.jpg");


        Product product3 = new Product();  //create object
        product2.setName("Delonghi Kahve makinesi");
        product2.setDiscount(5);
        product2.setUnitPrice(4500);
        product2.setUnitsInStock(3);
        product2.setImageUrl("abssd3.jpg");

        Product [] products = {product1 , product2 , product3};

        System.out.println("<ul>");
        for(Product product : products) {
            System.out.println("<li>" + product.getName() + "</li>");
        }
        System.out.println("</ul>");

        IndivudualCustomer indivudualCustomer = new IndivudualCustomer();
        indivudualCustomer.setId(1);
        indivudualCustomer.setPhone("12345");
        indivudualCustomer.setCustomerNumber("12235689");
        indivudualCustomer.setFirstName("Busra");
        indivudualCustomer.setSecondName("Zenbilci");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCompanyName("Kodlama");
        corporateCustomer.setPhone("0533333333");
        corporateCustomer.setTaxtNumber("1111111111");
        corporateCustomer.setCustomerNumber("54321");

        Customer [] customers = {indivudualCustomer , corporateCustomer };
    }
}
