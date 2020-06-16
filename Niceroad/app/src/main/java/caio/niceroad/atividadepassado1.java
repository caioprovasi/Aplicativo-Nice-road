package caio.niceroad;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import java.util.ArrayList;

import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

public class atividadepassado1 extends AppCompatActivity {

   ArrayList<String> selection = new ArrayList<String>();
   TextView final_text;
   private Button Button;

    private Boolean clicou = true;


   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atividadepassado1);
        Button = (Button) findViewById(R.id.Button);
        final_text = (TextView)findViewById(R.id.final_result);
        final_text.setEnabled(false);

    }
        public void selectItem (View view) {
            boolean checked = ((RadioButton) view).isChecked();

            switch (view.getId()) {

                case R.id.radioButton3:

                    if (checked) {
                        selection.add("incorreto");
                        final_text.setTextColor(Color.RED);
                    }
                    else {
                        selection.add("incorreto");
                    }
                    break;

                case R.id.radioButton4:

                    if (checked) {
                        selection.add("correto");
                        final_text.setTextColor(Color.GREEN);
                    } else {
                        selection.add("correto");
                    }
                    break;

            }
        }
           public void finalSelection (View view)
            {

                String final_checkbox_selection = "";
                for (String Selections : selection) ;
                {

                    /*final_checkbox_selection = final_checkbox_selection + selection + "\n";*/
                    final_checkbox_selection = final_checkbox_selection + selection;
                }
                final_text.setText(final_checkbox_selection);
                final_text.setEnabled(true);
                iniciar();
            }
            public void iniciar()
            {
                if (!clicou){
                    Button.setText("Enviar");
                    clicou = true;
                }
                else {
                    Button.setText("Continuar");
                    Button.setOnClickListener(new View.OnClickListener() {

                        @Override
                        public void onClick(View v) {
                            Intent it = new Intent(atividadepassado1.this, atividadepassado2.class);
                            // it.putExtra("VALOR", edtValor.getText().toString());
                            startActivity(it);
                        }
                    });
                    clicou = false;
                }

            }
        }




