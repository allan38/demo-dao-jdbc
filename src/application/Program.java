package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
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
		
	}

}
