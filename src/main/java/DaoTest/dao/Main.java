package DaoTest.dao;

import java.sql.SQLException;
import java.util.List;



public class Main {

	public static void main(String[] args) throws SQLException {
		Reiziger r1 = new Reiziger("test3", "01-01-2001");
		DbManager db = new DbManager();
		db.saveReiziger(r1);
		OvChipkaart o1 = new OvChipkaart("student week", r1);
		db.saveOV(o1);
	// workshop test
		 
	
	

	}
}
