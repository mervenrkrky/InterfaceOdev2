package interfaceödev2;

public class GameManager implements IGameService {

	@Override
	public void addGame(Games game, Player player) {
		System.out.println(player.getFirstName()+" " +player.getLastName()+" oyuncu "+game.getGameName() + " oyunu satýn aldý");
		
	}

	@Override
	public void updateGame(Games game, Player player) {
		System.out.println(player.getFirstName() +" "+player.getLastName()+" oyuncu "+game.getGameName() + " oyununda uyeliðini güncelledi");
		
	}

	@Override
	public void deleteGame(Games game, Player player) {
		System.out.println(player.getFirstName() +" "+player.getLastName()+" oyuncu "+game.getGameName() + " oyununu sildi");
		
	}
	

}
