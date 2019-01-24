package com.sio.glpi_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private EditText nom;
    private EditText prenom;
    private Operateur lOperateur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton camera_btn = findViewById(R.id.camera_btn);
        camera_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNewActivity();
            }
        });

        Button saveOperateur = findViewById(R.id.save_btn);
        saveOperateur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nom = (EditText)findViewById(R.id.txtNom);
                prenom = (EditText)findViewById(R.id.txtPrenom);
                //lOperateur = new Operateur(nom.getText(), prenom.getText());
                Dialogue();
            }

        });

    }

    public void Dialogue(){
        AlertDialog.Builder builder1 = new AlertDialog.Builder(this );
        builder1.setMessage(nom.getText() + " " + prenom.getText());
        AlertDialog alert11 = builder1.create();
        alert11.show();
    }

    public void openNewActivity () {
        Intent intent;
        intent = new Intent(this, CameraActivity.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
