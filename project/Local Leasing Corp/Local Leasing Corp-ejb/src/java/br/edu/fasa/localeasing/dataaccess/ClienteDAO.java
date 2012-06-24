/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.localeasing.dataaccess;

import br.edu.fasa.localeasing.domainmodel.bean.ClienteBean;
import br.edu.fasa.localeasing.domainmodel.bean.EnderecoBean;
import br.edu.fasa.localeasing.domainmodel.repository.IClienteRepositorio;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author Alexsander Duarte
 */
@Stateless
public class ClienteDAO extends GenericDAO<ClienteBean> implements IClienteRepositorio {
    
    public ClienteDAO(){
        super(ClienteBean.class);
    }

    @Override
    public List<ClienteBean> listarClientesPorMome(String nome) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void abrirClienteCPF(String cpf) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void abrirClienteCNPJ(String cnpj) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<ClienteBean> clientePorCidade(EnderecoBean obj) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
