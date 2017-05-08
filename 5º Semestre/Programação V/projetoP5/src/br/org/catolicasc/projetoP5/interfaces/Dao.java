package br.org.catolicasc.projetoP5.interfaces;

import java.util.List;

public interface Dao<T> {

	
	public void salva(T t);

	public void remove(T t);

	public List<T> listaTodos();

	public T buscaPorld(Long id);
	
	public List<T> listaPaginada(int ini, int max);
}
