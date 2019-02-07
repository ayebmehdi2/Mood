package com.example.qq.qpp;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.qq.qpp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        if (savedInstanceState != null) return;

        MoodFragment fragment = new MoodFragment();
        fragment.setType("neg");
        getFragmentManager().beginTransaction().add(R.id.fr, fragment).commit();

        MoodFragment fragment2 = new MoodFragment();
        fragment.setType("pos");
        getFragmentManager().beginTransaction().add(R.id.fr2, fragment2).commit();

        binding.neg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ModNeg();
            }
        });

        binding.pos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ModPos();
            }
        });

        binding.neg2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ModNeg2();
            }
        });

        binding.pos2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ModPos2();
            }
        });

    }

    public void ModPos(){
        binding.pos.setBackgroundResource(R.drawable.sh2);
        binding.pos.setTextColor(getResources().getColor(R.color.t));
        binding.neg.setBackgroundResource(R.drawable.sh);
        binding.neg.setTextColor(getResources().getColor(R.color.colorAccent));
        MoodFragment fragment = new MoodFragment();
        fragment.setType("pos");
        getFragmentManager().beginTransaction().replace(R.id.fr, fragment).commit();
    }
    public void ModNeg(){
        binding.neg.setBackgroundResource(R.drawable.sh2);
        binding.neg.setTextColor(getResources().getColor(R.color.t));
        binding.pos.setBackgroundResource(R.drawable.sh);
        binding.pos.setTextColor(getResources().getColor(R.color.colorAccent));
        MoodFragment fragment = new MoodFragment();
        fragment.setType("neg");
        getFragmentManager().beginTransaction().replace(R.id.fr, fragment).commit();
    }

    public void ModPos2(){
        binding.pos2.setBackgroundResource(R.drawable.sh2);
        binding.pos2.setTextColor(getResources().getColor(R.color.t));
        binding.neg2.setBackgroundResource(R.drawable.sh);
        binding.neg2.setTextColor(getResources().getColor(R.color.colorAccent));
        MoodFragment fragment = new MoodFragment();
        fragment.setType("pos");
        getFragmentManager().beginTransaction().replace(R.id.fr2, fragment).commit();
    }

    public void ModNeg2(){
        binding.neg2.setBackgroundResource(R.drawable.sh2);
        binding.neg2.setTextColor(getResources().getColor(R.color.t));
        binding.pos2.setBackgroundResource(R.drawable.sh);
        binding.pos2.setTextColor(getResources().getColor(R.color.colorAccent));
        MoodFragment fragment = new MoodFragment();
        fragment.setType("neg");
        getFragmentManager().beginTransaction().replace(R.id.fr2, fragment).commit();
    }

}
