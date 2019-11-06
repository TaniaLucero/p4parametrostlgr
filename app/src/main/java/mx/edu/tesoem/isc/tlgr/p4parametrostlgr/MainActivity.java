package mx.edu.tesoem.isc.tlgr.p4parametrostlgr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText vnombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vnombre=(EditText) findViewById(R.id.txtnombre);
    }

    public void EnviarParametros (View v){
        Intent pantalla = new Intent(this,RecibeParametrosActivity.class);

        pantalla.putExtra("pnombre",vnombre.getText().toString());
        startActivity(pantalla);
        finish();
    }
}
