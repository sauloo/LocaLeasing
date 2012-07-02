/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.edu.fasa.localleasing.dataaccess;

import br.com.edu.fasa.localleasing.domainmodel.bean.Aluguel;
import br.com.edu.fasa.localleasing.domainmodel.repository.IAluguel;
import java.util.Date;
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
public class AluguelDAO extends GenericDAO<Aluguel> implements IAluguel {

    public AluguelDAO(){
        super(Aluguel.class);
    }
    
    @Override
    public List<Aluguel> listaAluguelPorData(Date di, Date df) {
        try{
            Query query = getManager().createQuery("select a from Aluguel a where a.dataLocacao between :di and :df");
            query.setParameter("di", di);
            query.setParameter("df", di);
            return query.getResultList();
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Aluguel> produtosAlugados() {
        try{
         Query query = getManager().createQuery("select a from Aluguel a "
                + "join Equipamento e on a.fkEquipamento = e.id"
                + "where e.status = 1"); 
         return query.getResultList();
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
        
    }

    @Override
    public List<Aluguel> clientesPossuiAluguel(String nome) {
        try{
            Query query = getManager().createQuery("select a from Aluguel a"
                    + "join Cliente c on a.fkCliente = c.id"
                    + "join Equipamento e on a.fkEquipamento = e.id"
                    + "where e.status = 1 and e.nome = :nome ");
            query.setParameter("nome", nome);
            return query.getResultList();
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Aluguel> funcionariosPossuemAluguel(String nome) {
        try{
            Query query = getManager().createQuery("select a from Aluguel a"
                    + "join Funcionario f on a.fkFuncionario = f.id"
                    + "join Equipamento e on a.fkEquipamento = e.id"
                    + "where e.status = 1 and f.nome = :nome ");
            query.setParameter("nome", nome);
            return query.getResultList();
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
    

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    protected Long getID(Aluguel obj) {
        return obj.getId();
    }
    
}
