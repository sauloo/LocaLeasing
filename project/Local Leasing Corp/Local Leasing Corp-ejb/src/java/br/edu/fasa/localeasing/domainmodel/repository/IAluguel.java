/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.localeasing.domainmodel.repository;

import br.edu.fasa.localeasing.domainmodel.bean.AluguelBean;
import br.edu.fasa.localeasing.domainmodel.bean.ClienteBean;
import br.edu.fasa.localeasing.domainmodel.bean.FuncionarioBean;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Alexsander Duarte
 */
public interface IAluguel extends IRepositorio<AluguelBean>  {
    
    
    List<AluguelBean> listaAluguemPorData(Date di, Date df);
    
    List<AluguelBean> produtosAlugados();
    
    List<AluguelBean> clientesPossuiAluguel(ClienteBean obj);
    
    List<AluguelBean> funcionariosPossuemAluguel(FuncionarioBean obj);
    
    
}
