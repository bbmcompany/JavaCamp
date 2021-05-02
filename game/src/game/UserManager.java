package game;

public class UserManager implements UserInterface{

	@Override
	public void addAccount(User user) {
		System.out.println(user.getFirstName() + " adli kullanici eklendi.");
		Utils.checkEdevlet(user);
	}

	@Override
	public void updateAccount(User user) {
		System.out.println(user.getFirstName() + " adli kullanicinin hesabi güncellendi.");
		
	}

	@Override
	public void deleteAccount(User user) {
		System.out.println(user.getFirstName()  + " adli kullanici hesabini sildi.");
		
	}

}
