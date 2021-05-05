package interface�dev2;
import java.rmi.RemoteException;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisManager {
@SuppressWarnings("deprecation")
public boolean mernisManager(Player player) {
		
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
		boolean result = false;
		try {
			result = kpsPublicSoapProxy.TCKimlikNoDogrula(
					Long.parseLong(player.getNationalityId()),
					player.getFirstName().toUpperCase(), 
					player.getLastName().toUpperCase(), 
					player.getDateOfBirth().getYear());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return result;
		
		
	
		
}
}
