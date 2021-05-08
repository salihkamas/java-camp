package Adapters;

import java.rmi.RemoteException;

import Abstracts.UserCheckService;
import Entities.User;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements UserCheckService {

	@Override
	public boolean CheckIfRealPerson(User user) throws Exception {
		boolean result = false;
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
		try {
			if (kpsPublicSoapProxy.TCKimlikNoDogrula(Long.parseLong(user.getNationalityId()),
					user.getFirstName().toUpperCase(), user.getLastName().toUpperCase(),
					user.getDateOfBirth().getYear())) {
				result = true;
			}

		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return result;
	}

}
