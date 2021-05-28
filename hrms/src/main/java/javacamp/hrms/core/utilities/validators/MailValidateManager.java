package javacamp.hrms.core.utilities.validators;

import org.springframework.stereotype.Service;

import javacamp.hrms.entities.concretes.Candidates;

@Service
public class MailValidateManager implements MailValidateService {

	@Override
	public boolean isMail(Candidates candidates) {

		if (candidates.getEmailAddress() != null) {
			return true;
		} else {
			System.out.println("Mail məlumatlarınızı düzgün daxil etdiyinizə əmin olun");
			return false;
		}

	}

}
