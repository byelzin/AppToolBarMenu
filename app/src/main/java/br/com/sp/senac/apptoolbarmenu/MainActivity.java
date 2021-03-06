package br.com.sp.senac.apptoolbarmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Variavel global

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle("Senac Largo Treze");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_toolbar, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.mSalvar:
                ;
                Toast.makeText(getApplicationContext(), "Cliquei no salvar!!!", Toast.LENGTH_SHORT).show();
                break;
        }
        switch (item.getItemId()) {
            case R.id.mAlterar:
                ;
                Toast.makeText(getApplicationContext(), "Cliquei no alterar!!!", Toast.LENGTH_SHORT).show();
                break;
        }
        switch (item.getItemId()) {
            case R.id.mExcluir:
                ;
                Toast.makeText(getApplicationContext(), "Cliquei no excluir!!!", Toast.LENGTH_SHORT).show();
                break;
        }
        switch (item.getItemId()) {
            case R.id.mBuscar:
                ;
                Toast.makeText(getApplicationContext(), "Cliquei no buscar!!!", Toast.LENGTH_SHORT).show();
                break;
        }
        switch (item.getItemId()) {
            case R.id.mAbrir:
                startActivity(new Intent(getApplicationContext(),SubMenu_Activity.class));

                ;
                Toast.makeText(getApplicationContext(), "Cliquei no abrir!!!", Toast.LENGTH_SHORT).show();
                break;
        }
        switch (item.getItemId()) {
            case R.id.mSair:

                finish();
                ;
                Toast.makeText(getApplicationContext(), "Cliquei no sair!!!", Toast.LENGTH_SHORT).show();
                break;
        }
        switch (item.getItemId()) {
            case R.id.mGrupo:
                startActivity(new Intent(getApplicationContext(), GrupoMenuActivity.class));

                ;
                Toast.makeText(getApplicationContext(), "Cliquei no abrir!!!", Toast.LENGTH_SHORT).show();
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
