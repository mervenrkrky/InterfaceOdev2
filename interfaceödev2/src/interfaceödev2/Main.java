package interfaceödev2;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Player player1 =  new Player(1, "Mervenur", "Karakaya", new Date(2000), "tc");
		Player player2 =  new Player(2, "Edanur", "Karakaya", new Date(1997), "tc");
		
		
		Games game1= new Games(1, "PUBG", 100);
		Games game2=new Games(2, "CS:GO", 300);
		
		
		
		
		
		Campaign campaign1 = new Campaign(1, "YENÝ KAYIT KAMPANYASI", 30);
		Campaign campaign2 = new Campaign(1, "BAHAR KAMPANYASI", 35);
		System.out.println("**************************************************************");
		PlayerManager playmanager= new PlayerManager(new MernisManager());
		playmanager.addPlayer(player1);
		playmanager.addPlayer(player2);
		System.out.println("**************************************************************");
		
		saleService sale1= new saleService();
		sale1.sale(game1, campaign2);
		sale1.sale(game2, campaign1);
		
		System.out.println("**************************************************************");
		GameManager gamemanager= new GameManager();
		gamemanager.addGame(game2, player2);
		gamemanager.deleteGame(game1, player1);
		System.out.println("**************************************************************");
		CampaignManager campaignmanager = new CampaignManager();
		campaignmanager.updateCampaign(campaign2);
		campaignmanager.addCampaign(campaign1);
		
		
		
		
	}

}
