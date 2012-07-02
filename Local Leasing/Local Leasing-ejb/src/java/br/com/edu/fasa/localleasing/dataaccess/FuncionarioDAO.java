/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.edu.fasa.localleasing.dataaccess;

import br.com.edu.fasa.localleasing.domainmodel.bean.Funcionario;
import br.com.edu.fasa.localleasing.domainmodel.repository.IFuncionario;
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
public class FuncionarioDAO extends GenericDAO<Funcionario> implements IFuncionario{
    
    public FuncionarioDAO(){
        super(Funcionario.class);
    }
            

    @Override
    public List<Funcionario> listarFuncionarioPorNome(String nome) {
        try{
            Query query = getManager().createQuery("select f from Funcionario f "
                    + "where f.nome = :nome");
            query.setParameter("nome", nome);
            return query.getResultList();
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
    
    @Override
    public Boolean getUserLogin(String login, String senha){
        try{
         Query query = getManager().createQuery(" select f from Funcionario f"
                 + " where f.login = :login and f.senha = :senha ");
         query.setParameter("login", login);
         query.setParameter("senha", senha);
         //verifica se resultado é diferente de vazio e retorna true, senao retorna falsos
         if(!query.getResultList().isEmpty())
         return true;    
         else
         return false;
        }catch(Exception e){
        e.printStackTrace();
            return false;    
        }
        
    }
    

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    protected Long getID(Funcionario obj) {
        return obj.getId();
    }
    
}
