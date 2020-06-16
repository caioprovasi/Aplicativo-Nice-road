package caio.niceroad;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.view.ViewPropertyAnimatorCompatSet;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class atividade2 extends AppCompatActivity implements View.OnClickListener{
    // private EditText edtValor;
    Button btnFazer;
    Button btnDicas;
    Button btnPonto;
    Button btnCognato;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); //Mostrar o botão
        getSupportActionBar().setHomeButtonEnabled(true);      //Ativar o botão
        getSupportActionBar().setTitle("Nice road");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atividade2);


        //edtValor = (EditText) findViewById(R.id.edtValor);
        btnFazer = (Button) findViewById(R.id.btnFazer);
        btnCognato = (Button) findViewById(R.id.btnCognato);
        btnDicas = (Button) findViewById(R.id.btnDicas);
        btnPonto = (Button) findViewById(R.id.btnPonto);

        btnFazer.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent it = new Intent(atividade2.this, atividademodal.class);
                // it.putExtra("VALOR", edtValor.getText().toString());
                startActivity(it);
            }
        });

        btnCognato.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent it = new Intent(atividade2.this, atividadepossessiva.class);
                // it.putExtra("VALOR", edtValor.getText().toString());
                startActivity(it);
            }
        });

        btnPonto.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent it = new Intent(atividade2.this, atividadeduracao.class);
                // it.putExtra("VALOR", edtValor.getText().toString());
                startActivity(it);
            }
        });

        btnDicas.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent it = new Intent(atividade2.this, atividadecomparar.class);
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


