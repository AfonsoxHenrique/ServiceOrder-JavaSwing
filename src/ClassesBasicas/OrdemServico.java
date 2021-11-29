package ClassesBasicas;

import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Afonso
 */
public class OrdemServico 
{
    private int numero;
    private String motivoCancelamento;
    private Date dataCadastro;
    private Date dataSolucao;
    private String descricaoProblema;
    private String descricaoServico;
    private Date datacancelamento;
    
    private Cliente cliente;
    private Funcionario funcionario;
    private ClassificacaoProblema classificacaoProblema;

    public static String CANCELADA = "Cancelada";
    public static String ABERTA = "Aberta";
    public static String SOLUCIONADA = "Solucionada";

    public OrdemServico()
    {
        this.cliente = new Cliente();
        this.funcionario = new Funcionario();
        this.classificacaoProblema = new ClassificacaoProblema();
    }

    public String getStatusOrdemServico() {
        String retorno = ABERTA;
        if (this.getDataSolucao() != null) {
            retorno = SOLUCIONADA;
        } else if (this.getDatacancelamento() != null) {
            retorno = CANCELADA;
        }
        return retorno;
    }

    public Date getDatacancelamento() {
        return datacancelamento;
    }

    public void setDatacancelamento(Date datacancelamento) {
        this.datacancelamento = datacancelamento;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getMotivoCancelamento() {
        return motivoCancelamento;
    }

    public void setMotivoCancelamento(String motivoCancelamento) {
        this.motivoCancelamento = motivoCancelamento;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Date getDataSolucao() {
        return dataSolucao;
    }

    public void setDataSolucao(Date dataSolucao) {
        this.dataSolucao = dataSolucao;
    }

    public String getDescricaoProblema() {
        return descricaoProblema;
    }

    public void setDescricaoProblema(String descricaoProblema) {
        this.descricaoProblema = descricaoProblema;
    }

    public String getDescricaoServico() {
        return descricaoServico;
    }

    public void setDescricaoServico(String descricaoServico) {
        this.descricaoServico = descricaoServico;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public ClassificacaoProblema getClassificacaoProblema() {
        return classificacaoProblema;
    }

    public void setClassificacaoProblema(ClassificacaoProblema classificacaoProblema) {
        this.classificacaoProblema = classificacaoProblema;
    }

}
