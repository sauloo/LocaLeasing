/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.localeasing.dataaccess;

import br.edu.fasa.localeasing.domainmodel.repository.IRepositorio;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Alexsander Duarte
 */
public class GenericDAO <T> implements IRepositorio<T> {
    
     @PersistenceContext(name="Local_Leasing_-ejbPU")
    protected EntityManager manager;
    private Class type;
    
    public GenericDAO(Class type){
        this.type = type;
    }

    @Override
    public void salvar(T object) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void deletar(T object) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<T> listar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void editar(T object) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void abrir(T object) {
        throw new UnsupportedOperationException("Not supported yet.");
    }


}
