package model;

import android.content.Context;

import java.util.Date;

import model.dao.LancamentoDao;

/**
 * Created by Univem on 13/04/2016.
 */
public class Lancamento {

    public Long id;
    public String descricao;
    public Double valor;
    public Date dataCriacao;
    public Integer tipoLancamento; //0 despesa 1 receita

    public Lancamento(String descricao){
        this.descricao = descricao;
        this.dataCriacao = new Date();
    }

    public Lancamento(String descricao, Double valor, Integer tipoLancamento) {
        this.valor = valor;
        this.descricao = descricao;
        this.dataCriacao = new Date();
    }

    public static void generateData(){
        new Lancamento("Conta do cartao de credito", 20.40, TipoLancamento.DESPESA.ordinal());
    }

    /**
     * Metodo que chama o DAO de lancamento e salva no banco de dados o lancamento instanciado
     * @param context
     */
    public void salvar(Context context){
        LancamentoDao lancamentoDao = new LancamentoDao(context);
        lancamentoDao.salvar(this);
    }
}
