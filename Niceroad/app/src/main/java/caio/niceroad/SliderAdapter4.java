
package caio.niceroad;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class SliderAdapter4 extends PagerAdapter {
    
    Context context;
    android.view.LayoutInflater LayoutInflater;

    public SliderAdapter4(Context context) {
        this.context = context;
    }

    public int[] slide_images = {
            R.drawable.atividade,
            R.drawable.atividade2
    };

    public String[] slide_tit = {
            "Atividades",
            "Atividades"
    };
    public String[] slide_comparar = {
            "vocabulario",
            "comparacao"
    };
    public String[] slide_duracao = {
            "passado",
            "duracao"
    };
    public String[] slide_modal = {
            "presente",
            "modal"
    };
    public String[] slide_possessiva = {
            "futuro",
            "possessiva"
    };

    @Override
    public int getCount() {
        return slide_tit.length;

    }


    @Override
    public boolean isViewFromObject(View view, Object o) {
        return view == (RelativeLayout) o;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        LayoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = LayoutInflater.inflate(R.layout.activity_atividade2, container, false);

        ImageView slideImageView = (ImageView) view.findViewById(R.id.imageView);
        TextView slideTitle = (TextView) view.findViewById(R.id.textView4);
        TextView slidecomparar = (TextView) view.findViewById(R.id.textView7);
        TextView slideduracao = (TextView) view.findViewById(R.id.textView8);
        TextView slidemodal = (TextView) view.findViewById(R.id.textView9);
        TextView slidepossessiva = (TextView) view.findViewById(R.id.textView10);

        slideImageView.setImageResource(slide_images[position]);
        slideTitle.setText(slide_tit[position]);
        slidecomparar.setText(slide_comparar[position]);
        slideduracao.setText(slide_duracao[position]);
        slidemodal.setText(slide_modal[position]);
        slidepossessiva.setText(slide_possessiva[position]);

        container.addView(view);

        return view;
    }
    @Override
    public void destroyItem(ViewGroup container, int position, Object object){
        container.removeView((RelativeLayout)object);

    }
}

