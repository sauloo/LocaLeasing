/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.localeasing.domainmodel.repository;

import br.edu.fasa.localeasing.domainmodel.bean.ClienteBean;
import br.edu.fasa.localeasing.domainmodel.bean.EnderecoBean;
import java.util.List;

/**
 *
 * @author Alexsander Duarte
 */
public interface IClienteRepositorio extends IRepositorio<ClienteBean> {
    
    List<ClienteBean>listarClientesPorMome(String nome);
    
    void abrirClienteCPF(String cpf);
    
    void abrirClienteCNPJ(String cnpj);
    
    List<ClienteBean>clientePorCidade(EnderecoBean obj);
    
    
    
}
