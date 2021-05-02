package game;

public class Admin extends User{
	
	private int adminId;
	public Admin(int id, String firstName, String lastName, int age, int adminId) {
		super(id, firstName, lastName, age);
		this.adminId = adminId;
		
		
	}
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	
	

}
