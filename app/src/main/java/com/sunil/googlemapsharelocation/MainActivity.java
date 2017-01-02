package com.sunil.googlemapsharelocation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.GoogleMap)
    Button GoogleMap;
    @BindView(R.id.MapBoxMap)
    Button MapBoxMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.GoogleMap)
    public void googleMapClicked(){
        startActivity(new Intent(this, GoogleMapLocationActivity.class));
    }

    @OnClick(R.id.MapBoxMap)
    public void mapBoxClicked(){
        startActivity(new Intent(this, MapBoxLocationActivity.class));
    }
}
