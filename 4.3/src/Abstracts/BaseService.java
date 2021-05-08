package Abstracts;

public interface BaseService<T> {
	T getAll();

	void add(T entity);

	void delete(T entity);

	void update(T entity);
}
