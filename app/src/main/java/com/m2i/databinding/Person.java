package com.m2i.databinding;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

// BaseObservable permet une liaison biderectionnelle entre données et vues
public class Person extends BaseObservable {
    private String name;
    private String firstName;

    public Person() {
    }

    public Person(String name, String firstName) {
        this.name = name;
        this.firstName = firstName;
    }

    @Bindable
    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        // BR classe de binding référence, générée automatiquement lors de l'extention à BaseObservable
        // person déclaré dans activity_main
        notifyPropertyChanged(BR.name);
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public Person setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }
}
