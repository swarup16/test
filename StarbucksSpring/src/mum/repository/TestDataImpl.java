package mum.repository;

import java.util.List;

import mum.repository.Database;

public class TestDataImpl implements DataFacade {

	Database db = new Database();

	public String getPassword(String name) {
		return db.getPassword(name);
	}

	public List<String> getAdvice(String roast) {
		return db.getAdvice(roast);
	}

	public static void main(String args[]) {
		TestDataImpl testImp = new TestDataImpl();
		//testImp.getPassword("Dave");
		//testImp.getAdvice("Dark");
	}

}
