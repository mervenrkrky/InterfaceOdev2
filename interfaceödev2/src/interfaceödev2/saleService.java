package interfaceödev2;

public class saleService {
	public void sale(Games game,Campaign campaign) {
		double afterPrice=game.getGamePrice()-(game.getGamePrice()*campaign.getDiscountRate()/100);
		System.out.println(game.getGameName() +" oyununun "+ campaign.getCampaignName() +" sonucu indirimli fiyatý: "+afterPrice);
		
	}

}
