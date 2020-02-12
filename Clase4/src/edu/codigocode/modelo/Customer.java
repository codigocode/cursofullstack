package edu.codigocode.modelo;

import java.util.Objects;

public interface Customer<T> {

	void accept(T t);
	
	default Customer<T> andThen(Customer<T> other){
		Objects.nonNull(other);
		return (T t)->{
			this.accept(t);
			other.accept(t);
			
		};
	}
}
