package oopWithNLayeredApp.bisuness;
import java.util.List;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {
	
	private ProductDao productDao;
	private Logger[] loggers; //Logger[] loggers
	
	
	public ProductManager(ProductDao productDao, Logger[] loggers) { //product manager newlendiğinde bana bir product dao ver.
		this.productDao = productDao;
		this.loggers = loggers; //bu classın içindeki loggers, gönderilen loggerlar(14.satırdaki loggers)dır.
	}


	public void add(Product product) throws Exception  { //response
		//iş kuralları
		if(product.getUnitPrice()<10) {
			throw new Exception("Ürün fiyatı 10 dan küçük olamaz."); //throw hata fırlatıyor.
		}
		
		
		productDao.add(product);
		
		for (Logger logger : loggers) { //[db, mail]
			logger.log(product.getName());
		}
		
	}

}
