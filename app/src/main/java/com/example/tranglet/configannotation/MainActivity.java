package com.example.tranglet.configannotation;

import android.support.v7.app.AppCompatActivity;

import com.example.tranglet.configannotation.model.Demo;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;

@EActivity(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {
    @AfterViews
    void init() {
        Demo demo = new Demo();
        demo.setName("aHAHA");
    }
}
