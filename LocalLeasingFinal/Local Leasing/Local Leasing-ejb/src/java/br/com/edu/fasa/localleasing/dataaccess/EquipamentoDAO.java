/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.edu.fasa.localleasing.dataaccess;

import br.com.edu.fasa.localleasing.domainmodel.bean.Equipamento;
import br.com.edu.fasa.localleasing.domainmodel.repository.IEquipamento;
import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.Query;

/**
 *
 * @author Alexsander Duarte
 */
@Stateless
@LocalBean
public class EquipamentoDAO extends GenericDAO<Equipamento> implements IEquipamento {
    
    public EquipamentoDAO(){
        super(Equipamento.class);
    }

    @Override
    public List<Equipamento> listarEquipamentosPorModelo(String modelo) {
        try{
            Query query = getManager().createQuery("select e from Equipamento e "
                    + "where e.modelo = :modelo");
            query.setParameter("modelo", modelo);
            return query.getResultList();
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Equipamento> listarEquipamentosPorMarca(String marca) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Equipamento> listarEquipamentoStatus(int status) {
        try{
            Query query = getManager().createQuery("select e from Equipamento e"
                    + "where e.status = :status");
            query.setParameter("status", status);
            return query.getResultList();
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void alteraStatusEquipamento(Long id, int status) {
        try{
           Query query = getManager().createQuery("update Equipamento e set e.status = :status"
                    + "where e.id = :id");
            query.setParameter("id", id);
            query.setParameter("status", status);
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    protected Long getID(Equipamento obj) {
        return obj.getId();
    }
    
}
