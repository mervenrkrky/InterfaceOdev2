package interface�dev2;

public class CampaignManager implements ICampaignService {

	@Override
	public void addCampaign(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " %" + campaign.getDiscountRate()+ " indirim oran�yla sisteme yuklendi");
		
	}

	@Override
	public void deleteCampaign(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " %" + campaign.getDiscountRate()+ " indirim oran�yla sistemden silindi");
		
	}

	@Override
	public void updateCampaign(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " %" + campaign.getDiscountRate()+ "indirim oran�yla sisteme g�ncellendi ");
		
	}

}
