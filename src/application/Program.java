package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Department obj = new Department(1, "João");
		
		SellerDao sd = DaoFactory.createSellerDao();
		
		Seller seller = new Seller(21, "allan", "allan@gmail.com", new Date(), 2000.0, obj);
		
		System.out.println(obj);
		
		System.out.println(seller);
		
	}

}
