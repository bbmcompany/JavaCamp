package game;

public interface CampaignInterface {
	
	void addCampaign(Game game, Admin admin, int discountRate);
	void deleteCampaign(Game game);
	void updateCampaign(Game game, Admin admin, int discountRate);
}
