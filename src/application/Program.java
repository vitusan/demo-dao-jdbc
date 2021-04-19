package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		Department dep = new Department("Books",1); 
		
		Seller sel = new Seller("Ruan", 1, "ruan@gmail.com", new Date(), 3000.0, dep);
		
		// Inje��o de depend�ncia sem explicitar a implementa��o
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println(sel);

	}

}
