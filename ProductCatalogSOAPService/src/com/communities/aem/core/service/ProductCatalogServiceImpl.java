/**
 * 
 */
package com.communities.aem.core.service;

/**
 * @author pavan.kumar.manda
 *
 */


import java.util.*;
import java.util.Arrays;
import java.util.List;
import org.apache.axis.utils.StringUtils;

import com.communities.aem.core.service.Product;
/**
 * @author pavan.kumar.manda
 *
 */
public class ProductCatalogServiceImpl {

	private static List<Product> productCatalog;
	//Product p = new Product();
	
	 public ProductCatalogServiceImpl() {
	
		initializeProductCatalog();
	 }
	
	 public Product searchById(int id) throws Exception {
		 for (Product p : productCatalog) if (p.getId() == id) return p;
		 throw new Exception("No product found with id " + id);
	 }
	 @SuppressWarnings({ "unchecked", "rawtypes" })
	 public Product[] searchByCategory(String category)throws Exception{		 
			 List<Product> prods = new ArrayList();			 
		     for (Product p : productCatalog) {	if(category.equalsIgnoreCase(p.getCategory())){	prods.add(p); } }
		     
		     Product[] products = new Product[prods.size()];
		     for (int i = 0; i < prods.size(); i++) {
		    	 products[i] = prods.get(i);
		     }
		 return products;		 
	 }
	 @SuppressWarnings({ "unchecked", "rawtypes" })
	 public Product[] searchByName(String name)throws Exception{
		List<Product> prods = new ArrayList();			 
	     for (Product p : productCatalog) {	if((name.compareTo(p.getName())== 0) || (p.getName().contains(name)) ){	prods.add(p); } }	     
	     Product[] products = new Product[prods.size()];
	     for (int i = 0; i < prods.size(); i++) {
	    	 products[i] = prods.get(i);
	     }
		 return products;		 
	 }
	 public Product[] getAllProducts() {
		 Product[] products = new Product[productCatalog.size()];
		 int i = 0;
		
		 for (Product p : productCatalog) {
			 products[i] = p;
			 i++;
		 }
		
		 return products;
	 }
	
	 public void insertProduct(Product product) {
		 productCatalog.add(product);
	 }
	
	 @SuppressWarnings({ "unchecked", "rawtypes" })
	private void initializeProductCatalog() {
	
		 if (productCatalog == null) {
			 productCatalog = new ArrayList();
			 productCatalog.add(new Product(1, "Keyboard", "Electronics", 29.99D, "https://assets.logitech.com/assets/54901/k811-gallery.png"));
			 productCatalog.add(new Product(2, "Mouse", "Electronics", 9.95D, "https://assets.logitech.com/assets/55214/m100-gallery.png"));
			 productCatalog.add(new Product(3, "17\" Monitor", "Electronics", 159.49D, "https://webobjects2.cdw.com/is/image/CDW/3851763?$400x350$"));
			 productCatalog.add(new Product(4, "Hammer", "Hardware", 9.95D, "https://www.austinchronicle.com/binary/8128/blogHAMMER.png"));
			 productCatalog.add(new Product(5, "Slot Screwdriver", "Hardware", 7.95D, "https://www.austinchronicle.com/binary/8128/blogHAMMER.png"));
			 productCatalog.add(new Product(6, "The British Invasion of Java", "Books", 11.39D, "https://www.austinchronicle.com/binary/8128/blogHAMMER.png"));
			 productCatalog.add(new Product(7, "A House in Bali", "Books", 15.99D, "https://www.austinchronicle.com/binary/8128/blogHAMMER.png"));
			 productCatalog.add(new Product(8, "An Alaskan Odyssey", "Books", 799.99D, "https://www.austinchronicle.com/binary/8128/blogHAMMER.png"));
			 productCatalog.add(new Product(9, "LCD Projector", "Electronics", 1199.19D, "https://www.christiedigital.com/img/Products/Christie%20LW400/inpage/Christie-LW400-LCD-Digital-Projector-Main2.png"));
		 }
	 }
 }