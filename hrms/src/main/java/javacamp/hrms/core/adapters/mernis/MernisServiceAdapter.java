package javacamp.hrms.core.adapters.mernis;

import java.rmi.RemoteException;
import java.util.Locale;

import org.springframework.stereotype.Service;

import javacamp.hrms.entities.concretes.Candidates;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

@Service
public class MernisServiceAdapter implements CheckService {

	@Override
	public boolean checkIfRealTcNo(Candidates candidates) {

		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();

		boolean result = true;
		try {
			result = kpsPublicSoapProxy.TCKimlikNoDogrula(Long.parseLong(candidates.getIdentificationNumber()),
					candidates.getFirstName().toUpperCase(new Locale("tr")),
					candidates.getLastName().toUpperCase(new Locale("tr")), 0);
		} catch (RemoteException e) {
			e.printStackTrace();
		}

		return result;
	}

}
