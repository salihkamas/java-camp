package core.adapters.concretes;

import core.adapters.abstracts.AuthServiceExternal;
import entities.concretes.User;

public class GoogleAuthManager implements AuthServiceExternal {
	private final GoogleAuthManager googleAuthManager;

	public GoogleAuthManager(GoogleAuthManager googleAuthManager) {
		super();
		this.googleAuthManager = googleAuthManager;
	}

	@Override
	public void register(User user) {
		googleAuthManager.register(user);
	}

	@Override
	public void login(User user) {
		googleAuthManager.login(user);

	}

}
