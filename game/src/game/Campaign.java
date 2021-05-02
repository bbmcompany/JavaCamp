package game;

public class Campaign implements CampaignInterface{

	@Override
	public void addCampaign(Game game, Admin admin, int discountRate) {
		int newPrice = game.getGamePrice() - ((game.getGamePrice() * discountRate) / 100);
		System.out.println("Admin " +admin.getFirstName() +  " : " +game.getGameName() + " adli oyunun yeni fiyati " + newPrice);
		
	}

	@Override
	public void deleteCampaign(Game game) {
		System.out.println("Kampanya bilgilendirmesi :" + game.getGameName() + "adli oyunda kampanya bitmistir." );
		
	}

	@Override
	public void updateCampaign(Game game, Admin admin , int discountRate) {
		System.out.println("Admin " + admin.getFirstName() + " : " + game.getGameName() + " adli oyunu kampanyasinin kampanyasini güncelledi.");
		addCampaign(game, admin, discountRate);
		
	}

}
