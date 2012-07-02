/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.edu.fasa.localleasing.dataaccess;

import br.com.edu.fasa.localleasing.domainmodel.bean.Cliente;
import br.com.edu.fasa.localleasing.domainmodel.bean.Endereco;
import br.com.edu.fasa.localleasing.domainmodel.repository.IClienteRepositorio;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.Query;

/**
 *
 * @author Alexsander Duarte
 */
@Stateless
public class ClienteDAO extends GenericDAO<Cliente> implements IClienteRepositorio {
    
    public ClienteDAO(){
        super(Cliente.class);
    }

    @Override
    public List<Cliente> listarClientesPorMome(String nome) {
        try{
            Query query = getManager().createQuery("select c from Cliente c"
                    + "where c.nome = :nome");
            query.setParameter("nome", nome);
            return query.getResultList();
        }catch(Exception e){
            e.printStackTrace();
            return null;
            
        }
    }

    @Override
    public Cliente abrirClienteCPF(String cpf) {
        try{
            Query query = getManager().createQuery("select c from Cliente c "
                    + "where c.cnpj = :cnpj");
            query.setParameter("cnpj", cpf);
                    return (Cliente)query.getResultList().get(0);
        }catch(Exception e){
            return null;
        }
    }

    @Override
    public Cliente abrirClienteCNPJ(String cnpj) {
        try{
            Query query = getManager().createQuery("select c from Cliente c "
                    + "where c.cnpj = :cnpj");
            query.setParameter("cnpj", cnpj);
                    return (Cliente)query.getResultList().get(0);
        }catch(Exception e){
            return null;
        }
    }

    @Override
    public List<Cliente> clientePorCidade(String cidade) {
        try{
            Query query = getManager().createQuery("select c from cliente c"
                    + "join Endereco e on c.fkEndereco = e.id"
                    + "where e.cidade = cidade");
            return query.getResultList();
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    protected Long getID(Cliente obj) {
        return obj.getId();
    }
    
}
