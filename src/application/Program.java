package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		// Inje��o de depend�ncia sem explicitar a implementa��o
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("----TEST 1 -> Find By Id----");
		Seller seller = sellerDao.findById(2);
		System.out.println(seller);
		System.out.println("----TEST 2 -> Find By Department----");
		Department department = new Department(null,2);
		List<Seller> list = sellerDao.findByDepartment(department);
		for(Seller obj : list) {
			System.out.println(obj);
		}
		System.out.println("----TEST 3 -> Find All----");
		list = sellerDao.findAll();
		for(Seller obj : list) {
			System.out.println(obj);
		}
		System.out.println("----TEST 4 -> Insert----");
		Seller newSeller = new Seller(null,"Greory","gregory@gmail.com", new Date(), 4000.0,department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New Seller "+newSeller.getId());
	}

}
