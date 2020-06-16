package caio.niceroad;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class dicas1 extends AppCompatActivity implements View.OnClickListener{
    // private EditText edtValor;
    private Button btnFazer;
    private Button btnDicas;
    private Button btnPonto;
    private Button button4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); //Mostrar o botão
        getSupportActionBar().setHomeButtonEnabled(true);      //Ativar o botão
        getSupportActionBar().setTitle("Nice road");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dicas1);


        //edtValor = (EditText) findViewById(R.id.edtValor);
        btnFazer = (Button) findViewById(R.id.btnFazer);
        button4 = (Button) findViewById(R.id.btnCognato);
        btnDicas = (Button) findViewById(R.id.btnDicas);
        btnPonto = (Button) findViewById(R.id.btnPonto);

        btnFazer.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent it = new Intent(dicas1.this, dicastransporte.class);
                // it.putExtra("VALOR", edtValor.getText().toString());
                startActivity(it);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent it = new Intent(dicas1.this, dicassaude.class);
                // it.putExtra("VALOR", edtValor.getText().toString());
                startActivity(it);
            }
        });

        btnPonto.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent it = new Intent(dicas1.this, dicashotel.class);
                // it.putExtra("VALOR", edtValor.getText().toString());
                startActivity(it);
            }
        });

        btnDicas.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent it = new Intent(dicas1.this, dicas2.class);
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
