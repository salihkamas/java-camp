package Concretes;

import Abstracts.UserCheckService;
import Entities.User;

public class UserCheckManager implements UserCheckService {

	@Override
	public boolean CheckIfRealPerson(User user) throws Exception {
		// TODO Auto-generated method stub
		return true;
	}

}
