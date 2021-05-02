package game;

public class GameManager{
	
	public void sell(User user, Game game) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " adli kullanici " + game.getGameName() +  " adli oyunu aldi.");
	}
}
