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
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		SellerDao sd = DaoFactory.createSellerDao();
	
		System.out.println("===== TESTE FIND BY ID =====\n\n");
		
		System.out.println(sd.findById(2));
		
		System.out.println("\n\n===== TESTE FIND BY DEPARTMENT =====\n\n");
		
		Department obj = new Department(2, null);
		List<Seller> sellers = sd.findByDepartment(obj);
		for(Seller sel : sellers) {
			System.out.println(sel);
		}
		
		System.out.println("\n\n===== TESTE FIND ALL =====\n\n");
		
		List<Seller> sellers1 = sd.findall();
		for(Seller sel : sellers1) {
			System.out.println(sel);
		}
		
		System.out.println("\n\n===== TESTE INSERT =====\n\n");
		
		Seller seller = new Seller(18, "Rodrigo", "rodrigo@gmail.com", new Date(), 4000.0, obj);
		//sd.insert(seller);
		System.out.println("seller Id: " + seller.getId());
		
		System.out.println("\n\n===== TESTE UPDATE =====\n\n");
		
		sd.update(seller);
		
		System.out.println("\n\n===== TESTE DELETE =====\n\n");
		
		System.out.println("Enter id seller delete test: ");
		int code = sc.nextInt();
		sd.deleteById(code);
		System.out.println("Seller deleted sucess!");

		sc.close();
		
	}

}
