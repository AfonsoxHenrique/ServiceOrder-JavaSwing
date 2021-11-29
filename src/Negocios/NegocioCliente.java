/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocios;

import ClassesBasicas.Cliente;
import Dados.DadosCliente;
import Interfaces.InterfaceCliente;
import java.util.ArrayList;

/**
 *
 * @author Afonso
 */
public class NegocioCliente implements InterfaceCliente {

    @Override
    public void cadastrarCliente(Cliente cliente) throws Exception {
        if (cliente.getCpf().equals("")) {
            throw new Exception("Digite o CPF do cliente!");
        }
        if (cliente.getCpf().length() != 14) {
            throw new Exception("O CPF deve conter 11 digitos!");
        }
        if (cliente.getNome().length() > 100) {
            throw new Exception("O nome pode conter somente até 100 caracteres!");
        }
        if (cliente.getNome().trim().equals("")) {
            throw new Exception("Digite o nome do cliente!");
        }
        if (cliente.getRg().length() != 10) {
            throw new Exception("O RG deve conter 10 caracteres!");
        }
        DadosCliente dadosCliente = new DadosCliente();
        dadosCliente.cadastrarCliente(cliente);
    }

    @Override
    public void editarCliente(Cliente clienteNovo, Cliente clienteVelho) throws Exception {
        if (clienteNovo.getCpf().length() != 14) {
            throw new Exception("O CPF deve conter 14 digitos!");
        }
        if (clienteNovo.getRg().length() > 10) {
            throw new Exception("O RG deve conter até 10 digitos!");
        }
        DadosCliente dadosCliente = new DadosCliente();
        dadosCliente.editarCliente(clienteNovo, clienteVelho);
    }

    @Override
    public void removerCliente(Cliente cliente) throws Exception {
        if (cliente == null) {
            throw new Exception("Digite os dados do cliente!");
        }
        if (this.verificaUso(cliente) == true) {
            throw new Exception("O referido cliente possui ordem de serviço vinculada ao mesmo!");
        }
        DadosCliente dadosCliente = new DadosCliente();
        dadosCliente.removerCliente(cliente);
    }

    @Override
    public int contadorCliente(Cliente cliente) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }  

    private boolean verificaUso(Cliente cliente) throws Exception {
        DadosCliente dadosCliente = new DadosCliente();
        return dadosCliente.verificaUso(cliente);
    }

    @Override
    public ArrayList<Cliente> listarClientes(Cliente cliente) throws Exception {
        DadosCliente dadosCliente = new DadosCliente();
        return dadosCliente.listarClientes(cliente);
    }

}
