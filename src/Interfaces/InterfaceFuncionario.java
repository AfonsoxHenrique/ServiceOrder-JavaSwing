/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;
import ClassesBasicas.Funcionario;
import java.util.ArrayList;
/**
 *
 * @author Afonso
 */
public interface InterfaceFuncionario {
    void cadastrarFuncionario (Funcionario funcionario) throws Exception;
    void editarFuncionario (Funcionario funcionario) throws Exception;
    void excluirFuncionario (Funcionario funcionario) throws Exception;
    ArrayList <Funcionario> listarFuncionario (Funcionario funcionario) throws Exception;
    int contarFuncionario (Funcionario funcionario) throws Exception;
}
