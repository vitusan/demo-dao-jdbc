package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		// Injeção de dependência sem explicitar a implementação
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

	}

}
