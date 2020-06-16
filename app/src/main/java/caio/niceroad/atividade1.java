package caio.niceroad;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class atividade1 extends AppCompatActivity implements View.OnClickListener{
    // private EditText edtValor;
    Button btnFazer;
    Button btnDicas;
    Button btnPonto;
    Button btnCognato;
    private ViewPager mSlideViewPager;
    private LinearLayout mDotLayout;
    private TextView[] mDots;
    private SliderAdapter4 sliderAdapter4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); //Mostrar o botão
        getSupportActionBar().setHomeButtonEnabled(true);      //Ativar o botão
        getSupportActionBar().setTitle("Nice road");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trocaativ);


        //edtValor = (EditText) findViewById(R.id.edtValor);
        btnFazer = (Button) findViewById(R.id.btnFazer);
        btnCognato = (Button) findViewById(R.id.btnCognato);
        btnDicas = (Button) findViewById(R.id.btnDicas);
        btnPonto = (Button) findViewById(R.id.btnPonto);

        btnFazer.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent it = new Intent(atividade1.this, atividadepresente.class);
                // it.putExtra("VALOR", edtValor.getText().toString());
                startActivity(it);
            }
        });

        btnCognato.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent it = new Intent(atividade1.this, atividadefuturo.class);
                // it.putExtra("VALOR", edtValor.getText().toString());
                startActivity(it);
            }
        });

        btnPonto.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent it = new Intent(atividade1.this, atividadepassado1.class);
                // it.putExtra("VALOR", edtValor.getText().toString());
                startActivity(it);
            }
        });

        btnDicas.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent it = new Intent(atividade1.this, atividade3.class);
                // it.putExtra("VALOR", edtValor.getText().toString());
                startActivity(it);
            }
        });

        mSlideViewPager = (ViewPager) findViewById(R.id.slideViewPager);
        mDotLayout = (LinearLayout) findViewById(R.id.dotsLayout);

        sliderAdapter4 = new SliderAdapter4(this);
        mSlideViewPager.setAdapter(sliderAdapter4);

        addDotsIndicator(0);
        mSlideViewPager.addOnPageChangeListener(viewListener);
    }
        public void addDotsIndicator ( int position){
            mDots = new TextView[2];
            mDotLayout.removeAllViews();

            for (int i = 0; i < mDots.length; i++) {

                mDots[i] = new TextView(this);
                mDots[i].setText(Html.fromHtml("&#8226;"));
                mDots[i].setTextSize(35);
                mDots[i].setTextColor(getResources().getColor(R.color.colorTransparentWhite));

                mDotLayout.addView(mDots[i]);

            }
            if (mDots.length > 0) {

                mDots[position].setTextColor(getResources().getColor(R.color.colorPrimaryDark));

            }
        }
        ViewPager.OnPageChangeListener viewListener = new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float y, int i1) {

            }

            @Override
            public void onPageSelected(int i) {
                addDotsIndicator(i);
            }

            @Override
            public void onPageScrollStateChanged(int i) {
            }
        };


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


