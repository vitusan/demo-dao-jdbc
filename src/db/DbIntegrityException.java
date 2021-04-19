package db;

public class DbIntegrityException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public DbIntegrityException(String db) {
		super(db);
	}

}
