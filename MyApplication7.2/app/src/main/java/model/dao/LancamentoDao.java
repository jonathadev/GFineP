package model.dao;

import android.content.ContentValues;
import android.content.Context;

import model.Lancamento;

/**
 * Created by Univem on 18/04/2016.
 */
public class LancamentoDao {
    public static String COLUNA_ID ="_id";
    public static String COLUNA_DESCRICAO = "descricao";
    public static String COLUNA_DATA = "data";
    public static String COLUNA_VALOR = "valor";
    public static String COLUNA_TIPO = "tipo";
    public static String TABELA_LANCAMENTO = "lancamento";

    public static String CRIA_TABELA_LANCAMENTO = "create table " + TABELA_LANCAMENTO + "(" +
           COLUNA_ID +" integer primary key autoincrement,"+
           COLUNA_DESCRICAO + " text," +
           COLUNA_DATA + " integer," +
           COLUNA_VALOR + " real," +
           COLUNA_TIPO + " integer" +
            " )";

    SqliteOpenHelper sqliteOpenHelper;

    public LancamentoDao(Context context){
        sqliteOpenHelper = new SqliteOpenHelper(context);
    }

    public Lancamento salvar(Lancamento lancamento){
        ContentValues contentValues = new ContentValues();
        contentValues.put(COLUNA_DESCRICAO, lancamento.descricao);
        contentValues.put(COLUNA_DATA, lancamento.dataCriacao.getTime());
        contentValues.put(COLUNA_VALOR, lancamento.valor);
        contentValues.put(COLUNA_TIPO, lancamento.tipoLancamento);

        Long id = sqliteOpenHelper.getWritableDatabase().insert(TABELA_LANCAMENTO,null,contentValues);

        lancamento.id = id;

        return lancamento;
    }
}
