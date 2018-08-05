package com.example.muhammadgamal.cairotourguide;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Build;
import android.provider.ContactsContract;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.view.ViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.transition.Fade;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.elmargomez.typer.Font;
import com.elmargomez.typer.Typer;

public class MainActivity extends AppCompatActivity {

    public static int num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CollapsingToolbarLayout mCollapsingToolbar = findViewById(R.id.collapsing_toolbar);
        mCollapsingToolbar.setTitle(getTitle());
        mCollapsingToolbar.setExpandedTitleTextAppearance(R.style.ExpandedAppBar);
        mCollapsingToolbar.setCollapsedTitleTextAppearance(R.style.CollapsedAppBar);

        Typeface font = Typer.set(this).getFont(Font.ROBOTO_MEDIUM);
        mCollapsingToolbar.setCollapsedTitleTypeface(font);
        mCollapsingToolbar.setExpandedTitleTypeface(font);

        final Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);


        final ImageView theEgyptianMuseum = (ImageView) findViewById(R.id.theEgyptianMuseum);
        final ImageView cairoTower = (ImageView) findViewById(R.id.cairoTower);
        final ImageView museumOfIslamicArt = (ImageView) findViewById(R.id.museumOfIslamicArt);
        final ImageView khanel_Khalili = (ImageView) findViewById(R.id.khanel_Khalili);
        final ImageView al_AzharMosque = (ImageView) findViewById(R.id.al_AzharMosque);
        final ImageView el_MoezStreet = (ImageView) findViewById(R.id.el_MoezStreet);
        final ImageView mohamedAliPalace = (ImageView) findViewById(R.id.mohamedAliPalace);
        final ImageView sultanHassanMosque = (ImageView) findViewById(R.id.sultanHassanMosque);
        final Intent intent = new Intent(MainActivity.this, DetailActivity.class);
        RelativeLayout relativeLayout1 = (RelativeLayout) findViewById(R.id.relativeLayout1);
        RelativeLayout relativeLayout2 = (RelativeLayout) findViewById(R.id.relativeLayout2);
        RelativeLayout relativeLayout3 = (RelativeLayout) findViewById(R.id.relativeLayout3);
        RelativeLayout relativeLayout4 = (RelativeLayout) findViewById(R.id.relativeLayout4);
        RelativeLayout relativeLayout5 = (RelativeLayout) findViewById(R.id.relativeLayout5);
        RelativeLayout relativeLayout6 = (RelativeLayout) findViewById(R.id.relativeLayout6);
        RelativeLayout relativeLayout7 = (RelativeLayout) findViewById(R.id.relativeLayout7);
        RelativeLayout relativeLayout8 = (RelativeLayout) findViewById(R.id.relativeLayout8);
        relativeLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = 1;
                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(MainActivity.this, theEgyptianMuseum, ViewCompat.getTransitionName(theEgyptianMuseum));
                startActivity(intent, options.toBundle());
            }
        });
        relativeLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = 2;
                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(MainActivity.this, cairoTower, ViewCompat.getTransitionName(theEgyptianMuseum));
                startActivity(intent, options.toBundle());
            }
        });
        relativeLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = 3;
                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(MainActivity.this, museumOfIslamicArt, ViewCompat.getTransitionName(theEgyptianMuseum));
                startActivity(intent, options.toBundle());
            }
        });
        relativeLayout4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = 4;
                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(MainActivity.this, khanel_Khalili, ViewCompat.getTransitionName(theEgyptianMuseum));
                startActivity(intent, options.toBundle());
            }
        });
        relativeLayout5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = 5;
                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(MainActivity.this, al_AzharMosque, ViewCompat.getTransitionName(theEgyptianMuseum));
                startActivity(intent, options.toBundle());
            }
        });
        relativeLayout6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = 6;
                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(MainActivity.this, el_MoezStreet, ViewCompat.getTransitionName(theEgyptianMuseum));
                startActivity(intent, options.toBundle());
            }
        });
        relativeLayout7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = 7;
                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(MainActivity.this, mohamedAliPalace, ViewCompat.getTransitionName(theEgyptianMuseum));
                startActivity(intent, options.toBundle());
            }
        });
        relativeLayout8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = 8;
                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(MainActivity.this, sultanHassanMosque, ViewCompat.getTransitionName(theEgyptianMuseum));
                startActivity(intent, options.toBundle());
            }
        });
    }
}
