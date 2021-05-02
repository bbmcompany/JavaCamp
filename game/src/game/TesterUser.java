package game;

public class TesterUser extends User{
	
	private int privateId;
	public TesterUser(int id, String firstName, String lastName, int age, int privateId) {
		super(id, firstName, lastName, age);
		this.privateId = privateId;
		System.out.println("Test kullanicisi olusturuldu.");
	}
	public int getPrivateId() {
		return privateId;
	}
	public void setPrivateId(int privateId) {
		this.privateId = privateId;
	}

}
