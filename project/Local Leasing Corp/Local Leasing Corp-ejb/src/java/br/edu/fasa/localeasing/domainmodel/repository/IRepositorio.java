/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.localeasing.domainmodel.repository;

import java.util.List;

/**
 *
 * @author Alexsander Duarte
 */
public interface IRepositorio <T> {
    
    void salvar(T object);
    
    void deletar(T object);
    
    List<T>listar();
    
    void editar(T object);
    
    void abrir(T object);
}
