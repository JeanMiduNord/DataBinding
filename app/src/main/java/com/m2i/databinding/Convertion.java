package com.m2i.databinding;


import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by Formation on 19/01/2018.
 */

public class Convertion extends BaseObservable {
    private Double euro;
    private Double yen;

    public Convertion() {
    }

    public Convertion(Double euro) {
        this.euro = euro;
    }


    public Convertion(Double euro, Double yen) {
        this.euro = euro;
        this.yen = yen;
    }

    @Bindable
    public String getEuro() {
        return String.valueOf(euro);
    }

    public Convertion setEuro(String euro) {
        if (this.euro != null) {
            this.euro = Double.valueOf(euro);
            this.yen = Double.valueOf(euro) * Double.valueOf(1000) ;
        }
        else{this.euro = Double.valueOf(0);}

        notifyPropertyChanged(BR.euro);
        notifyPropertyChanged(BR.yen);
        return this;
    }

    @Bindable
    public String getYen() {
        return String.valueOf(yen);
    }

    public Convertion setYen(String euro) {
        if (this.euro != null){
            this.yen = this.euro * 1000;
        }else{
            this.yen = Double.valueOf(0);
        }


        return this;
    }
}
