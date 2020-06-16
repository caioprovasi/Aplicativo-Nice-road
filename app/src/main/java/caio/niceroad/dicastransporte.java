package caio.niceroad;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class dicastransporte extends AppCompatActivity{

    private Button btnFazer;
    private Button btnDicas;
    private Button btnPonto;
    private Button btnCognato;

    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); //Mostrar o botão
        getSupportActionBar().setHomeButtonEnabled(true);      //Ativar o botão
        getSupportActionBar().setTitle("Nice road");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dicastransporte);


//edtValor = (EditText) findViewById(R.id.edtValor);
        btnFazer = (Button) findViewById(R.id.btnFazer);
        btnCognato = (Button) findViewById(R.id.btnCognato);
        btnDicas = (Button) findViewById(R.id.btnDicas);
        btnPonto = (Button) findViewById(R.id.btnPonto);

        btnFazer.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent it = new Intent(dicastransporte.this, dicasmapa.class);
                // it.putExtra("VALOR", edtValor.getText().toString());
                startActivity(it);
            }
        });

        btnCognato.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent it = new Intent(dicastransporte.this, dicashotell.class);
                // it.putExtra("VALOR", edtValor.getText().toString());
                startActivity(it);
            }
        });

        btnPonto.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent it = new Intent(dicastransporte.this, dicasvalor.class);
                // it.putExtra("VALOR", edtValor.getText().toString());
                startActivity(it);
            }
        });

        btnDicas.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent it = new Intent(dicastransporte.this, dicascorrida.class);
                // it.putExtra("VALOR", edtValor.getText().toString());
                startActivity(it);
            }
        });

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) { //Botão adicional na ToolBar
        switch (item.getItemId()) {
            case android.R.id.home:  //ID do seu botão (gerado automaticamente pelo android, usando como está, deve funcionar
                startActivity(new Intent(this, Main.class));  //O efeito ao ser pressionado do botão (no caso abre a activity)
                finishAffinity();  //Método para matar a activity e não deixa-lá indexada na pilhagem
                break;
            default:break;
        }
        return true;
    }
    public void onClick(View v) {
        finish();
    }

}


