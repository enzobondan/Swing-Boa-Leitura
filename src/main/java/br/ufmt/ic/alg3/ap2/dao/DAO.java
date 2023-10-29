package br.ufmt.ic.alg3.ap2.dao;

import java.util.List;

/**
 *
 * @author Jivago Medeiros
 * @param <T>
 */
public interface DAO<T> {
    
    boolean salvar(T t);
    
    boolean deletar(T t);
    
    List<T> listar();
    
    
}
