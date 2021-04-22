package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		// Inje��o de depend�ncia sem explicitar a implementa��o
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		Seller seller = sellerDao.findById(2);
		
		System.out.println(seller);

	}

}
