package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

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
		printList(list);
		
		System.out.println("----TEST 3 -> Find All----");
		list = sellerDao.findAll();
		printList(list);
		
		System.out.println("----TEST 4 -> Insert----");
		Seller newSeller = new Seller(null,"Greory","gregory@gmail.com", new Date(), 4000.0,department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New Seller "+newSeller.getId());
		
		System.out.println("----TEST 5 -> Update----");
		seller = sellerDao.findById(8);
		seller.setName("Martha Waine");
		sellerDao.update(seller);
		System.out.println("Update completed!\n"+seller);
		
		System.out.println("----TEST 6 -> Delete----");
		Scanner sc = new Scanner(System.in);
		System.out.print("Type the Id for deletion: ");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Entry deleted!");
		list = sellerDao.findAll();
		printList(list);
		sc.close();
	}
	
	public static void printList(List<Seller> list){
		for(Seller obj : list) {
			System.out.println(obj);
		}
	}

}
