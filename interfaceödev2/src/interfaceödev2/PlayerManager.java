package interfaceödev2;

public class PlayerManager implements IPlayerService{


	 MernisManager mernisManager;
			
	 public PlayerManager(MernisManager mernisManager) {
		this.mernisManager = mernisManager;
	 }


	@Override
	public void addPlayer(Player player) {
		
				if(mernisManager.mernisManager(player)) {
					this.addPlayer(player);
					System.out.println(player.getFirstName() + " "+player.getLastName()+ 
							" sistemimize kaydoldu.");
				}
				else {
					System.out.println(player.getFirstName() + " "+player.getLastName()+ 
							" sistemimize kaydolamadı.");

			}
			
	}

	@Override
	public void update(Player player) {
		
		System.out.println(player.getFirstName()+" "+player.getLastName()+ " bilgileriniz sistemimizde güncellendi.");	
	}

	@Override
	public void delete(Player player) {
		System.out.println(player.getFirstName()+" "+player.getLastName()+ " bilgileriniz sistemimizde silindi.");	
		
	}

}
