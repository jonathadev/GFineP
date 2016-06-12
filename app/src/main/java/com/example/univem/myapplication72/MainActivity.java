package com.example.univem.myapplication72;


        import android.app.Activity;
        import android.content.Intent;
        import android.os.Bundle;
        import android.util.Log;
        import android.view.View;
        import android.view.Menu;
        import android.view.MenuItem;
        import android.widget.AdapterView;
        import android.widget.ArrayAdapter;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.ListView;
        import android.widget.Toast;

        import java.io.IOException;
        import java.io.PrintWriter;
        import java.net.Socket;
        import java.net.UnknownHostException;
        import java.util.ArrayList;



public class MainActivity extends Activity {

    ListView lv;
    EditText nameTxt;
    Button addbtn, updatebtn,deleteBtn, clearBtn;
    ArrayList<String> names = new ArrayList<String>();
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv=(ListView) findViewById(R.id.lv);//1?
        nameTxt=(EditText) findViewById(R.id.nameTxt);
        addbtn=(Button) findViewById(R.id.addbtn);
        updatebtn=(Button) findViewById(R.id.updatebtn);
        deleteBtn = (Button) findViewById(R.id.deleteBtn);
        clearBtn=(Button) findViewById(R.id.clearBtn);


//ADAPTER
        lv.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_multiple_choice, names);
        lv.setAdapter(adapter);

        //SET SELECTED ITEM
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override

            public void onItemClick(AdapterView<?> arg0, View v, int pos,
                                    long id) {
                //TODO Auto-gerated method stud
                nameTxt.setText(names.get(pos));
            }
        });

        //HANDLE EVENTS
        addbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                add();

            }
        });

        updatebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                update();

            }
        });

        deleteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                delete();

            }
        });

        clearBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                clear();

            }
        });

    }
    //ADD
    private void add() {
        try//imprimir
        {

            Socket sock = new Socket("192.168.0.144",  9100);
            PrintWriter oStream = new PrintWriter(sock.getOutputStream());
            oStream.println("HI,test from Android Device");
            oStream.println("\n\n\n");
            oStream.close();
            sock.close();
        }
        catch (UnknownHostException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        String name = nameTxt.getText().toString();

        if ( (name != null) && name.length() > 0) {
            //ADD
            adapter.add(name);

            //REFRESH
            adapter.notifyDataSetChanged();

            Toast.makeText(getApplicationContext(), "Inserido " + name + "!",
                    Toast.LENGTH_SHORT).show();


        } else {
            Toast.makeText(getApplicationContext(), "Não foi posssivel inserir " + name + "!",
                    Toast.LENGTH_SHORT).show();
        }


    }


    //UPDATE
    private void update()
    {
        try {
            String name = nameTxt.getText().toString();
            //GET POS OF SELECTED ITEM
            int pos = lv.getCheckedItemPosition();

            if (!name.isEmpty() && name.length() > 0) {
                //REMOVE ITEM
                adapter.remove(names.get(pos));

                //INSERT
                adapter.insert(name, pos);

                //refresh
                adapter.notifyDataSetChanged();

                Toast.makeText(getApplicationContext(), "Editado para " + name + "!",
                        Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(getApplicationContext(), "Não foi possivel editar!",
                        Toast.LENGTH_SHORT).show();

            }
        }catch (Exception e){
            Log.wtf("DO THIS", " WHEN SAVE() FAILS");
        }
    }
    //delete
    private void delete()
    {
        try {
            int pos = lv.getCheckedItemPosition();
            if (pos > -1) {
                //remove
                adapter.remove(names.get(pos));
                //reflesh
                adapter.notifyDataSetChanged();

                nameTxt.setText("");
                Toast.makeText(getApplicationContext(), "Deletado!", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(getApplicationContext(), "Não foi possivel deletar!",
                        Toast.LENGTH_SHORT).show();

            }
        }catch (Exception e){}
    }

    //CLEAR
    private void clear()
    {
        adapter.clear();
        Toast.makeText(getApplicationContext(), "Limpo!",
                Toast.LENGTH_SHORT).show();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);

        MenuItem searchItem = menu.findItem(R.id.action_novadespesa);

        return super.onCreateOptionsMenu(menu);
    }



}



