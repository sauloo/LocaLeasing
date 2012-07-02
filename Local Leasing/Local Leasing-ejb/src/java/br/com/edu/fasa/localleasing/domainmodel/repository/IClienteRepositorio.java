/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.edu.fasa.localleasing.domainmodel.repository;

import br.com.edu.fasa.localleasing.domainmodel.bean.Cliente;
import br.com.edu.fasa.localleasing.domainmodel.bean.Endereco;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author Alexsander Duarte
 */
@Remote
public interface IClienteRepositorio extends IRepositorio<Cliente> {
    
    List<Cliente>listarClientesPorMome(String nome);
    
    Cliente abrirClienteCPF(String cpf);
    
    Cliente abrirClienteCNPJ(String cnpj);
    
    List<Cliente>clientePorCidade(String cidade);
    
    
    
}
