package com.company.cyclades;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Maciej on 04/12/2017.
 */

public class GodsImg {

    GodsImg(Activity _activity) {
        this.activity = _activity;

        map = new HashMap<String, Integer>();
        map.put("ares", R.drawable.ares);
        map.put("atena", R.drawable.atena);
        map.put("kronos", R.drawable.kronos);
        map.put("posejdon", R.drawable.posejdon);
        map.put("zeus", R.drawable.zeus);

        godsImg = new ImageView[5];
        godsImg[0] = (ImageView) this.activity.findViewById(R.id.imageView);
        godsImg[1] = (ImageView) this.activity.findViewById(R.id.imageView2);
        godsImg[2] = (ImageView) this.activity.findViewById(R.id.imageView3);
        godsImg[3] = (ImageView) this.activity.findViewById(R.id.imageView4);
        godsImg[4] = (ImageView) this.activity.findViewById(R.id.imageView5);

        godsStr = new String[5];
        godsStr[0] = "ares";
        godsStr[1] = "atena";
        godsStr[2] = "kronos";
        godsStr[3] = "posejdon";
        godsStr[4] = "zeus";

        for(int i = 0; i < 5; i++) {
            godsImg[i].setVisibility(View.GONE);
        }
    }

    public Activity activity;
    ImageView godsImg[];
    String godsStr[];
    Map<String, Integer> map;

    public ImageView getGodsImg(int index) {
        return godsImg[index];
    }

    public void updateVisibility(int godsNumber) {
        for(int i = 0; i < godsNumber; i++) {
            godsImg[i].setVisibility(View.VISIBLE);
        }
    }

    public void setImageResource(int imageIndex, int value) {
        godsImg[imageIndex].setImageResource(map.get(godsStr[value]));
    }
}
