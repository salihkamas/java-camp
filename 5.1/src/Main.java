import business.concretes.AuthManager;
import business.concretes.UserManager;
import dataAccess.concretes.HibernateUserDao;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User salih = new User(1, "Salih", "Kamaş", "salih@salih.com", "salih123", true);
		AuthManager authManager=new AuthManager(new UserManager(new HibernateUserDao()));
		
		authManager.register(salih);
		
		authManager.login(salih);
	}

}
