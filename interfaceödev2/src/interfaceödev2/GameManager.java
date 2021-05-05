package interface�dev2;

public class GameManager implements IGameService {

	@Override
	public void addGame(Games game, Player player) {
		System.out.println(player.getFirstName()+" " +player.getLastName()+" oyuncu "+game.getGameName() + " oyunu sat�n ald�");
		
	}

	@Override
	public void updateGame(Games game, Player player) {
		System.out.println(player.getFirstName() +" "+player.getLastName()+" oyuncu "+game.getGameName() + " oyununda uyeli�ini g�ncelledi");
		
	}

	@Override
	public void deleteGame(Games game, Player player) {
		System.out.println(player.getFirstName() +" "+player.getLastName()+" oyuncu "+game.getGameName() + " oyununu sildi");
		
	}
	

}
