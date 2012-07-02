/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.edu.fasa.localleasing.domainmodel.repository;

import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author Alexsander Duarte
 */
public interface IRepositorio <T> {
    
    void salvar(T object);
    
    void deletar(T object);
    
    List<T>listar(String sql);
    
    //void editar(T object);
    
    T abrir(long id);
}
