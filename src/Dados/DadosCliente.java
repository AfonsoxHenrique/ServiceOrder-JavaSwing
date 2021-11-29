/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dados;

import ClassesBasicas.Cliente;
import Interfaces.InterfaceCliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author AfonsoeAna
 */
public class DadosCliente extends Dados implements InterfaceCliente {

    @Override
    public void cadastrarCliente(Cliente cliente) throws Exception {
        abrirConexao();

        String SQL = " Insert Into cliente (cpf, rg, nome) ";
        SQL += " Values (?,?,?) ";

        PreparedStatement preparedStatement = conn.prepareStatement(SQL);

        preparedStatement.setString(1, cliente.getCpf());
        preparedStatement.setString(2, cliente.getRg());
        preparedStatement.setString(3, cliente.getNome());

        preparedStatement.executeUpdate();

        fecharConexao();
    }

    @Override
    public void editarCliente(Cliente clienteNovo, Cliente clienteVelho) throws Exception {
        abrirConexao();

        String SQL = " Update cliente Set cpf = ?, rg = ?, nome = ? Where cpf = ? ";

        PreparedStatement preparedStatement = conn.prepareStatement(SQL);

        preparedStatement.setString(1, clienteNovo.getCpf());
        preparedStatement.setString(2, clienteNovo.getRg());
        preparedStatement.setString(3, clienteNovo.getNome());
        preparedStatement.setString(4, clienteVelho.getCpf());

        preparedStatement.executeUpdate();

        fecharConexao();
    }

    @Override
    public void removerCliente(Cliente cliente) throws Exception {
        abrirConexao();

        String SQL = " Delete From cliente Where cpf = ? ";

        PreparedStatement preparedStatement = conn.prepareStatement(SQL);

        preparedStatement.setString(1, cliente.getCpf());

        preparedStatement.executeUpdate();

        fecharConexao();
    }

   

    @Override
    public int contadorCliente(Cliente cliente) throws Exception {
        abrirConexao();

        String SQL = "Select Count(*) As 'Total' From cliente ";

        PreparedStatement preparedStatement = conn.prepareStatement(SQL);

        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            return resultSet.getInt("Total");
        }
        return 0;
    }


    public boolean verificaUso(Cliente cliente) throws Exception {
        boolean retorno = false;
        abrirConexao();
        String sql = "Select distinct cpf_cliente from ordemservico Where cpf_cliente  = ? ";
        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        preparedStatement.setString(1, cliente.getCpf());
        ResultSet resultado = preparedStatement.executeQuery();
        while (resultado.next()) {
            retorno = true;
            break;
        }
        fecharConexao();
        return retorno;
    }

    @Override
    public ArrayList<Cliente> listarClientes(Cliente cliente) throws Exception {
        abrirConexao();
        ArrayList<Cliente> retorno = new ArrayList<>();
        String sql = " Select cpf, nome, rg ";
        sql += " From cliente ";
        sql += " Where 0 = 0";
        
        if (cliente.getCpf() != null && cliente.getCpf().trim().equals("") == false) {
            sql += " and cpf Like  ? " ;
        }
        if (cliente.getNome()!= null && cliente.getNome().trim().equals("") == false) {
            sql += " and nome LIKE  ? " ;
        }
          if (cliente.getRg()!= null && cliente.getRg().trim().equals("") == false) {
            sql += " and rg LIKE  ? " ;
        }
        
        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        
        int pos = 1;
        
        if (cliente.getCpf() != null && cliente.getCpf().trim().equals("") == false) {
            preparedStatement.setString(pos, "%" + cliente.getCpf() +"%") ;
            pos++;
        }
        if (cliente.getNome()!= null && cliente.getNome().trim().equals("") == false) {
            preparedStatement.setString(pos, "%" +cliente.getNome()+"%");
            pos++;
        }
        if (cliente.getRg() != null && cliente.getRg().trim().equals("") == false) {
            preparedStatement.setString(pos, "%" +cliente.getRg()+"%");
            pos++;
        }
        
        ResultSet resultado = preparedStatement.executeQuery();
        while (resultado.next()) {
            Cliente c = new Cliente();
            c.setCpf(resultado.getString("cpf"));
            c.setNome(resultado.getString("nome"));
            c.setRg(resultado.getString("rg"));
            retorno.add(c);
        }
        fecharConexao();
        return retorno;
    }



}
 