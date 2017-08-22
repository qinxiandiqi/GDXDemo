package com.qinxiandiqi.gdxdemo;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.badlogic.gdx.backends.android.AndroidFragmentApplication;
import com.qinxiandiqi.gdxdemo.game.GameFragment;

public class MainActivity extends AppCompatActivity implements AndroidFragmentApplication.Callbacks {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        GameFragment gameFragment = new GameFragment();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(android.R.id.content, gameFragment);
        transaction.commit();
    }

    @Override
    public void exit() {

    }
}
