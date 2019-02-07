package com.example.qq.qpp;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MoodFragment extends Fragment {

    public MoodFragment(){}

    private String type = "neg";

    public void setType(String type) {
        this.type = type;
    }

    Tools[] pos = new Tools[] {
            new Tools(0,"Happy" , R.drawable.ic_010_happy_1),
            new Tools(0, "Excited", R.drawable.ic_020_excited),
            new Tools(0, "Fire", R.drawable.ic_047_on_fire),
            new Tools(0, "Rich.", R.drawable.ic_055_rich),
            new Tools(0, "Angel", R.drawable.ic_062_angel),
            new Tools(0, "Laughing", R.drawable.ic_071_laughing_2),

            new Tools(0, "Rich.", R.drawable.ic_055_rich),
            new Tools(0, "Angel", R.drawable.ic_062_angel),
            new Tools(0, "Laughing", R.drawable.ic_071_laughing_2)
                };

    Tools[] neg = new Tools[] {
            new Tools(0,"shouting" , R.drawable.ic_001_shouting),
            new Tools(0,"crying" , R.drawable.ic_002_crying),
            new Tools(0,"scared" , R.drawable.ic_019_scared),
            new Tools(0,"injured" , R.drawable.ic_048_injured),
            new Tools(0,"scared" , R.drawable.ic_069_scared_1),
            new Tools(0,"liar" , R.drawable.ic_094_liar),

            new Tools(0,"injured" , R.drawable.ic_048_injured),
            new Tools(0,"scared" , R.drawable.ic_069_scared_1),
            new Tools(0,"liar" , R.drawable.ic_094_liar),
    };

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.mood_layout, container, false);

        RecyclerView rv = view.findViewById(R.id.recycler);
        Recycler recycler = new Recycler();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 3);
        rv.setLayoutManager(gridLayoutManager);
        rv.setHasFixedSize(true);
        rv.setAdapter(recycler);

        switch (type){
            case "pos":
                recycler.swapAdapter(pos);
                break;
            case "neg":
                recycler.swapAdapter(neg);
                break;
            default:
                recycler.swapAdapter(neg);
        }

        return view;
    }
}
