package nLayeredDemo.business.concretes;

import java.util.List;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAcces.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;

public class ProductManager implements ProductService {
	
	private ProductDao prýductDao;
	private LoggerService loggerService;
	
	public ProductManager(ProductDao prýductDao, LoggerService loggerService) {
		super();
		this.prýductDao = prýductDao;
		this.loggerService = loggerService;
	}

	@Override
	public void add(Product product) {
		if(product.getCategoryId() == 1)
		{
			System.out.println("Bu kategoride ürün kabul edilmiyor");
			return;
		}
		
		this.prýductDao.add(product);
		this.loggerService.logToSystem("Ürün eklendi " + product.getName());
		
	}

	@Override
	public List<Product> getAll() {
		
		return null;
	}
	
}
