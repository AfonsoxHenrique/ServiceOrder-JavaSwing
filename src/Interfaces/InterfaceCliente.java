/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;
import ClassesBasicas.Cliente;
import java.util.ArrayList;

/**
 *
 * @author Afonso
 */
public interface InterfaceCliente {
    void cadastrarCliente (Cliente cliente) throws Exception;
    void editarCliente (Cliente clienteNovo, Cliente clienteVelho) throws Exception;
    void removerCliente (Cliente cliente) throws Exception;
    int  contadorCliente (Cliente cliente) throws Exception;
    ArrayList<Cliente> listarClientes(Cliente cliente) throws Exception;
    
    //
    //boolean verificaUso(Cliente cliente) throws Exception;
}