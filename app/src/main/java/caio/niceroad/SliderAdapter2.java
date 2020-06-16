
package caio.niceroad;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class SliderAdapter2 extends PagerAdapter {

    Context context;
    android.view.LayoutInflater LayoutInflater;

    public SliderAdapter2(Context context) {
        this.context = context;
    }

    public int[] slide_images = {
            R.drawable.cognatofinal,
            //R.drawable.cognatofinal2,
            R.drawable.cognatofinal3,
            R.drawable.cognatofinal4
//            R.drawable.cognatofina5
    };

/*    public String[] slide_headings = {
            "Revista personalizada",
            "Motel",
            "Biblioteca",
            "Lanche",
            "Ajuda"
    };*/



    public String[] slide_descs = {
            "Journal - Revista personalizada Newspaper - Jornal",
//            "Motel - Hotel simples\n" +
//                    "Hotel - Hotel",
            "Library - Biblioteca\n" +
                    "Book Store - Livraria",
            "Lunch - Almoço\n" +
                    "Snack - Lanche"
//            "Support - Apoiar\n" +
//                    "Hold on - Surportar"
    };

     public String[] slide_tit = {
     "Falso Cognato",
             "Falso Cognato",
//             "Falso Cognato",
             "Falso Cognato"
//             "Falso Cognato"
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
        View view = LayoutInflater.inflate(R.layout.activity_cognatoalmoco, container, false);

        ImageView slideImageView = (ImageView) view.findViewById(R.id.imageView);
        TextView slideDescription = (TextView) view.findViewById(R.id.textView5);
        TextView slideTitle = (TextView) view.findViewById(R.id.textView6);

        slideImageView.setImageResource(slide_images[position]);
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

