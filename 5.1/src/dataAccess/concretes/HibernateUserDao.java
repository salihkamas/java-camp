package dataAccess.concretes;

import java.util.List;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class HibernateUserDao implements UserDao {

	@Override
	public void add(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " added with hibernate");

	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " deleted with hibernate");

	}

	@Override
	public void update(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " updated with hibernate");

	}

	@Override
	public List<User> getAll() {
		System.out.println("Successfuly listed");
		return null;
	}

}
