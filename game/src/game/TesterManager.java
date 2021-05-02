package game;

public class TesterManager extends UserManager{

	public void inform(TesterUser user) {
		System.out.println("Test kullanicisi, id: " + user.getPrivateId() + "... oyun hatasini bildirdi.");
	}
}
