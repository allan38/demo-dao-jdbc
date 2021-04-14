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
	
		
	
		System.out.println("===== TESTE FIND BY ID =====");
		
		System.out.println(sd.findById(2));
		
		System.out.println("===== TESTE FIND BY DEPARTMENT =====");
		
		Department obj = new Department(2, null);
		List<Seller> sellers = sd.findByDepartment(obj);
		for(Seller sel : sellers) {
			System.out.println("List of Sellers: " + sel );
		}
		
	}

}
