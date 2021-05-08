package Concretes;

import Abstracts.BaseService;

public class BaseManager<T> implements BaseService<T> {

	@Override
	public T getAll() {
		System.out.println("Successfuly listed");
		return null;
	}

	@Override
	public void add(T entity) {
		System.out.println("Successfuly added");

	}

	@Override
	public void delete(T entity) {
		System.out.println("Successfuly deleted");

	}

	@Override
	public void update(T entity) {
		System.out.println("Successfuly updated");

	}

}
