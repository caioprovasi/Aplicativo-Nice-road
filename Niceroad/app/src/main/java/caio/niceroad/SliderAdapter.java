package caio.niceroad;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

public class SliderAdapter extends PagerAdapter {

    Context context;
    android.view.LayoutInflater LayoutInflater;

    public SliderAdapter(Context context) {
        this.context = context;
    }

    public int[] slide_images = {
            R.drawable.pontofinal,
//            R.drawable.pontofinal4,
            R.drawable.ponto3,
            R.drawable.pontofinal5
//            R.drawable.pontofinal2
    };

    public String[] slide_headings = {
            "Estatua da liberdade",
//            "Central Park",
            "Walt Disney World Resort",
            "Times Square"
//            "Universal Orlando Resort"
    };

    public String[] slide_descs = {
            "Endereço: Nova York, NY 10004, EUA Altura: 93 m Início da construção: setembro de 1875",
//            "Endereço: Nova York, NY, EUA\n" +
//                    "Área: 1,317 mi²\n" +
//                    "Telefone: +1 212-310-6600",
            "Endereço: Walt Disney World Resort, Orlando, FL 32830, EUA\n" +
                    "Atendimento ao cliente: +1 407-939-5277",
            "Endereço: Manhattan, NY 10036, EUA\n" +
                    "Distrito: Manhattan"
//            "Endereço: 6000 Universal Blvd, Orlando, FL 32819, EUA\n" +
//                    "Inauguração: 7 de junho de 1990\n" +
//                    "Atendimento ao cliente: +1 407-363-8000"
    };

     public String[] slide_tit = {
     "Ponto turístico",
//     "Ponto turístico",
             "Ponto turístico",
             "Ponto turístico"
//             "Ponto turístico"
     };

    @Override
    public int getCount() {
        return slide_headings.length;

    }

    @Override
    public boolean isViewFromObject(View view, Object o) {
        return view == (RelativeLayout) o;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        LayoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = LayoutInflater.inflate(R.layout.activity_ponto, container, false);

        ImageView slideImageView = (ImageView) view.findViewById(R.id.imageView);
        TextView slideHeading = (TextView) view.findViewById(R.id.textView);
        TextView slideDescription = (TextView) view.findViewById(R.id.textView2);
        TextView slideTitle = (TextView) view.findViewById(R.id.textView3);

        slideImageView.setImageResource(slide_images[position]);
        slideHeading.setText(slide_headings[position]);
        slideDescription.setText(slide_descs[position]);
        slideTitle.setText(slide_tit[position]);

        container.addView(view);

        return view;
    }
    @Override
    public void destroyItem(ViewGroup container, int position, Object object){
        container.removeView((RelativeLayout)object);

    }
}
