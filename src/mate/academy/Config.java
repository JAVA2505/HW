package mate.academy;

public class Config {
	
	private String host = "localhost";
	private String db = "demo";
	private String user = "root";
	private String psw = "";
	
	
	public Config( ) {
		
	}
	
	public Config(String host, String db, String user, String psw) {
		super();
		this.host = host;
		this.db = db;
		this.user = user;
		this.psw = psw;
	}


	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getDb() {
		return db;
	}

	public void setDb(String db) {
		this.db = db;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPsw() {
		return psw;
	}

	public void setPsw(String psw) {
		this.psw = psw;
	}
	
	
	
	
	

}
