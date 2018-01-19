package com.m2i.databinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.m2i.databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private Person joe;
    private Convertion devise;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Hydratation de la personne
        joe = new Person("user","Joe");


        devise = new Convertion();
        // Création de l'objet de liaison

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);


        //définition des variables à lier
        binding.setPerson(joe);

        binding.setConvertion(devise);

    }

    public void onPromote(View vieww){
        joe.setName("Admin");
        //binding.setPerson(joe);
    }
}
