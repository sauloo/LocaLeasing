/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.edu.fasa.localleasing.dataaccess;

import br.com.edu.fasa.localleasing.domainmodel.repository.IRepositorio;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Alexsander Duarte
 */
public abstract class GenericDAO <T> implements IRepositorio<T> {
    
    @PersistenceContext(name="Local_Leasing_-ejbPU")
    private EntityManager manager;
    private Class type;
    protected abstract Long getID(T obj);
   
    
    public GenericDAO(Class type){
        this.type = type;
    }

    @Override
    public void salvar(T object) {
        try{
            getManager().merge(object);
            getManager().flush();
        }catch(Exception e){
         e.printStackTrace();
            
        }
    }

    @Override
    public void deletar(T object) {
        try{
            getManager().remove(getManager().getReference(type, getID(object)));
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public List<T> listar(String jpql) {
        try{
            List<T> lista = manager.createQuery(jpql).getResultList();
            return lista;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }

   /* @Override
    public void editar(T object) {
        throw new UnsupportedOperationException("Not supported yet.");
    }*/

    
    @Override
    public T abrir(long id) {
        return (T)manager.find(type, id);
    }

    /**
     * @return the manager
     */
    public EntityManager getManager() {
        return manager;
    }

    /**
     * @param manager the manager to set
     */
    public void setManager(EntityManager manager) {
        this.manager = manager;
    }

    /**
     * @return the type
     */
    public Class getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(Class type) {
        this.type = type;
    }


}
