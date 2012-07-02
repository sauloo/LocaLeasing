/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.edu.fasa.localleasing.domainmodel.repository;

import br.com.edu.fasa.localleasing.domainmodel.bean.Aluguel;
import br.com.edu.fasa.localleasing.domainmodel.bean.Cliente;
import br.com.edu.fasa.localleasing.domainmodel.bean.Funcionario;
import java.util.Date;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author Alexsander Duarte
 */
@Remote
public interface IAluguel extends IRepositorio<Aluguel>  {
    
    
    List<Aluguel> listaAluguelPorData(Date di, Date df);
    
    List<Aluguel> produtosAlugados();
    
    List<Aluguel> clientesPossuiAluguel(String nome);
    
    List<Aluguel> funcionariosPossuemAluguel(String nome);
    
    
}
