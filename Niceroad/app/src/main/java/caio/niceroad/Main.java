package caio.niceroad;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

//import android.support.v7.app.ActionBarActivity;


public class Main extends AppCompatActivity implements View.OnClickListener {

    private Button btnFazer;
    private Button btnDicas;
    private Button btnCognato;
    private Button btnPonto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        btnFazer = (Button) findViewById(R.id.btnFazer);
        btnDicas = (Button) findViewById(R.id.btnDicas);
        btnPonto = (Button) findViewById(R.id.btnPonto);
        btnCognato = (Button) findViewById(R.id.btnCognato);

        btnFazer.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent it = new Intent(Main.this, atividade1.class);
                // it.putExtra("VALOR", edtValor.getText().toString());
                startActivity(it);
            }
        });

        btnCognato.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent it = new Intent(Main.this, cognato.class);
                // it.putExtra("VALOR", edtValor.getText().toString());
                startActivity(it);
            }
        });

        btnPonto.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent it = new Intent(Main.this, ponto.class);
                // it.putExtra("VALOR", edtValor.getText().toString());
                startActivity(it);
            }
        });

        btnDicas.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent it = new Intent(Main.this, dicas1.class);
                // it.putExtra("VALOR", edtValor.getText().toString());
                startActivity(it);
            }
        });

    }
    public void onClick(View v) {
        //Button Clicked
    }
}
   /* @Override
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
    }*/

//    public void abreNovo(View view){
//        Intent intent = new Intent(this,NovoActivity.class);
//        startActivity(intent);
//    }
//
//    public void abreLista(View view){
//        Intent intent = new Intent(this,ListaActivity.class);
//        startActivity(intent);
//    }
//
//}
