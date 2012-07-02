/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.edu.fasa.localleasing.domainmodel.repository;

import br.com.edu.fasa.localleasing.domainmodel.bean.Funcionario;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author Alexsander Duarte
 */
@Remote
public interface IFuncionario extends IRepositorio<Funcionario> {
    
    
    List<Funcionario> listarFuncionarioPorNome(String nome);
    
    Boolean getUserLogin(String login, String senha);
    
}
