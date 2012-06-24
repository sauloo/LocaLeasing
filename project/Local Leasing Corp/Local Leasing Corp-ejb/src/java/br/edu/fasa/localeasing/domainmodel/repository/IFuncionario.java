/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.localeasing.domainmodel.repository;

import br.edu.fasa.localeasing.domainmodel.bean.FuncionarioBean;
import java.util.List;

/**
 *
 * @author Alexsander Duarte
 */
public interface IFuncionario extends IRepositorio<FuncionarioBean> {
    
    
    List<FuncionarioBean> listarFuncionarioPorNome(String nome);
    
    
}
