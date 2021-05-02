package game;

public class Main {

	public static void main(String[] args) {
		
		UserManager userManager = new UserManager();
		TesterManager testerManager = new TesterManager();
		GameManager gameManager = new GameManager();
		Campaign campaignManager = new Campaign();
		
		Game game01 = new Game("Mario", 1434, 134);
		Game game02 = new Game("Star Wars", 1436, 180);
		
		
		GeneralUser user = new GeneralUser(1, "Baris", "Malkoc", 20);
		userManager.addAccount(user);
		userManager.updateAccount(user);
		
		
		TesterUser testUser = new TesterUser(2, "Cagri", "Koca", 23, 10987);
		testerManager.addAccount(testUser);
		testerManager.updateAccount(testUser);
		testerManager.inform(testUser);
		testerManager.deleteAccount(testUser);
		
		gameManager.sell(user, game01);
		
		Admin admin = new Admin(0, "Zeynep", "Güclü", 20, 98765);
		
		campaignManager.addCampaign(game01, admin, 25);
		campaignManager.deleteCampaign(game01);
		
		campaignManager.addCampaign(game02, admin, 33);
		campaignManager.updateCampaign(game02, admin, 20);
		
		

	}

}
