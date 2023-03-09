package oop1;

public class Main {

	public static void main(String[] args) {
		
		String mesaj = "Vade Oranı";
		
		//set - değer atamak
		Product product1 = new Product();
		product1.setName("Delongi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(3);
		product1.setImageUrl("img1.jpg");
		
		//get - okumak
		//System.out.println(product1.name);
		
		
		Product product2 = new Product();
		product2.setName("Smage Kahve Makinesi");
		product2.setDiscount(7);
		product2.setUnitPrice(7500);
		product2.setUnitsInStock(3);
		product2.setImageUrl("img1.jpg");
		
		
		Product product3 = new Product();
		product3.setName("Kitchen Aid Kahve Makinesi");
		product3.setDiscount(7);
		product3.setUnitPrice(7500);
		product3.setUnitsInStock(3);
		product3.setImageUrl("img1.jpg");
		
		Product[] products = {product1, product2, product3};
		
		//array lerde for each kullanırız.
		
		for (Product p : products) {  //products ları tek tek gez.(product1, product2, product3)
			
			System.out.println(p.getName());
			
		}
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("0522222222");
		individualCustomer.setCustomerNumber("12345");
		individualCustomer.setFirstName("Begüm");
		individualCustomer.setLastName("Akyazıcı");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setPhone("0533333");
		corporateCustomer.setCustomerNumber("54321");
		corporateCustomer.setCampanyName("BTK");
		corporateCustomer.setTaxNumber("111");
		
		Customer[] customers = {individualCustomer, corporateCustomer};
		
		

	}

}