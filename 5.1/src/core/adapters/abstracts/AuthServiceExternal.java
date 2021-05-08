package core.adapters.abstracts;

import entities.concretes.User;

public interface AuthServiceExternal {
	void register(User user);

	void login(User user);
}
