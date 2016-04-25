package model.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Univem on 18/04/2016.
 */
public class SqliteOpenHelper extends SQLiteOpenHelper {

    public static String DBNAME="sl";
    public static int DBVERSION=1;

    public SqliteOpenHelper(Context context) {
        super(context, DBNAME, null, DBVERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
      db.execSQL(LancamentoDao.CRIA_TABELA_LANCAMENTO);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //aqui os sqls de evolucao da base
    }
}
