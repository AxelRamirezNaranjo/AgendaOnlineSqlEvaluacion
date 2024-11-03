package com.example.agendaonlinedesde0;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;
import com.example.agendaonlinedesde0.R;

import androidx.appcompat.app.AppCompatActivity;

import com.example.agendaonlinedesde0.db.DBHelper;

public class MainActivity extends AppCompatActivity {

    /* RecyclerView listaContactos; */
    /*ArrayList<Contactos> listaArrayContactos; */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*=findViewById(R.id.listaContactos); */
        /* listaContactos.setLayoutManager(new LinearLayoutManager(this)); */

        /*dbContactos dbContactos = new dbContactos (MainActivity.this); */
        /*listaArrayContactos = new ArrayList<>(); */

        /* ListaContactosAdapter adapter = new ListaContactosAdapter(dbContactos.mostrarContactos()); */
        /*listaContactos.setAdapter(adapter); */
    }

    // muestra el menu de globo
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_principal, menu);
        return  true;
    }

    // muestra el resultado de la seleccion del menu
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.menuNuevo) {
            nuevoRegistro();
            return true;
        } else if (item.getItemId() == R.id.crearBase) {
            crearBase();
            return true;
        } else {
            return super.onOptionsItemSelected(item);
        }
    }


    //
    private void nuevoRegistro(){
        Intent intent = new Intent(this, NewActivity.class);
        startActivity(intent);
    }

    //
    private void crearBase(){
        DBHelper dbHelper = new DBHelper(MainActivity.this);
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        if (db != null) {
            Toast.makeText(MainActivity.this, "Base de datos creada", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(MainActivity.this, "Error al crear base de datos", Toast.LENGTH_LONG).show();
        }
    }

}