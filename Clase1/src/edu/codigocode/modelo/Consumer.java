package edu.codigocode.modelo;

@FunctionalInterface
public interface Consumer<T> {

	
	public void accept(T t);
}
