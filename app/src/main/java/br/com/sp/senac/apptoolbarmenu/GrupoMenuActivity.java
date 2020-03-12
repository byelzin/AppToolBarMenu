package br.com.sp.senac.apptoolbarmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;


public class GrupoMenuActivity extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grupo_menu_layout);

        toolbar = findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.grupomenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.mFav:
                Toast.makeText(getApplicationContext(), "Cliquei no favorito",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.mSpam:
                Toast.makeText(getApplicationContext(), "Cliquei no spam",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.mLixeira:
                Toast.makeText(getApplicationContext(), "Cliquei na lixeira",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.mGpSair:
                finish();
                break;

        }
        return true;
    }
}
