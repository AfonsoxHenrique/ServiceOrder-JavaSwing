/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocios;

import ClassesBasicas.Funcionario;
import Dados.DadosFuncionario;
import Interfaces.InterfaceFuncionario;
import java.util.ArrayList;

/**
 *
 * @author Afonso
 */
public class NegocioFuncionario implements InterfaceFuncionario{

    @Override
    public void cadastrarFuncionario(Funcionario funcionario) throws Exception {
        DadosFuncionario dadosFuncionario = new DadosFuncionario();
        dadosFuncionario.cadastrarFuncionario(funcionario);
    }

    @Override
    public void editarFuncionario(Funcionario funcionario) throws Exception 
    {
        if(funcionario.getCpf().length() != 14 || funcionario.getCpf().length() == 8)
        {
            throw new Exception ("O CPF deve conter 11 digitos");
        }
        if(funcionario.getCpf() == null || funcionario.getCpf().equals(" . . - "))
        {
            throw new Exception ("Digite o CPF");
        }
        if(funcionario.getRg()== null || funcionario.getRg().equals(""))
        {
            throw new Exception ("Digite o RG");
        }
        if(funcionario.getNome() == null || funcionario.getNome().equals(""))
        {
            throw new Exception ("Digite o nome");
        }
        DadosFuncionario dadosFuncionario = new DadosFuncionario();
        dadosFuncionario.editarFuncionario(funcionario);
    }

    @Override
    public void excluirFuncionario(Funcionario funcionario) throws Exception {
        if(String.valueOf(funcionario.getMatricula()).equals(""))
        {
            throw new Exception ("Escolha algum funcionário para remover");
        }
        if (this.verificaUso(funcionario) == true) {
            throw new Exception("O referido funcionário possui OS vinculada ao mesmo");
        }
        DadosFuncionario dadosFuncionario = new DadosFuncionario();
        dadosFuncionario.excluirFuncionario(funcionario);
    }

    @Override
    public ArrayList<Funcionario> listarFuncionario(Funcionario funcionario) throws Exception {
        DadosFuncionario dadosFuncionario = new DadosFuncionario();
        return dadosFuncionario.listarFuncionario(funcionario);
    }

    @Override
    public int contarFuncionario(Funcionario funcionario) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private boolean verificaUso(Funcionario funcionario) throws Exception {
        DadosFuncionario dadosFuncionario = new DadosFuncionario();
        return dadosFuncionario.verificaUso(funcionario);
    }
}
