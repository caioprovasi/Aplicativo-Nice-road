package caio.niceroad;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.media.MediaPlayer;
import android.view.MenuItem;
import android.widget.Button;
import android.view.View;


public class dicas3 extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); //Mostrar o botão
        getSupportActionBar().setHomeButtonEnabled(true);      //Ativar o botão
        getSupportActionBar().setTitle("Nice road");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dicas3);

        final MediaPlayer hamburgersound = MediaPlayer.create(this, R.raw.playhamburger);
        Button playhamburger = (Button) this.findViewById(R.id.play_hamburger);

        playhamburger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               hamburgersound.start();
            }
        });

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) { //Botão adicional na ToolBar
        switch (item.getItemId()) {
            case android.R.id.home:  //ID do seu botão (gerado automaticamente pelo android, usando como está, deve funcionar
                startActivity(new Intent(this, dicas2.class));  //O efeito ao ser pressionado do botão (no caso abre a activity)
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