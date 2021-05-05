package nLayeredDemo.business.concretes;

import java.util.List;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAcces.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;

public class ProductManager implements ProductService {
	
	private ProductDao pr�ductDao;
	private LoggerService loggerService;
	
	public ProductManager(ProductDao pr�ductDao, LoggerService loggerService) {
		super();
		this.pr�ductDao = pr�ductDao;
		this.loggerService = loggerService;
	}

	@Override
	public void add(Product product) {
		if(product.getCategoryId() == 1)
		{
			System.out.println("Bu kategoride �r�n kabul edilmiyor");
			return;
		}
		
		this.pr�ductDao.add(product);
		this.loggerService.logToSystem("�r�n eklendi " + product.getName());
		
	}

	@Override
	public List<Product> getAll() {
		
		return null;
	}
	
}
