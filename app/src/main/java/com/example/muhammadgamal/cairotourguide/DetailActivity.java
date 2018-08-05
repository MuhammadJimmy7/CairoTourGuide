package com.example.muhammadgamal.cairotourguide;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.transition.Fade;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);


        CollapsingToolbarLayout mCollapsingToolbar = findViewById(R.id.collapsing_toolbar);
        mCollapsingToolbar.setExpandedTitleTextAppearance(R.style.ExpandedAppBar);
        mCollapsingToolbar.setCollapsedTitleTextAppearance(R.style.CollapsedAppBar);

        final Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        ImageView backdrop = (ImageView) findViewById(R.id.backdrop);
        TextView details = (TextView) findViewById(R.id.details);
        FloatingActionButton floatingActionButton = (FloatingActionButton) findViewById(R.id.floatingActionButton);

        if (MainActivity.num == 1) {
            backdrop.setImageResource(R.drawable.museumegypt);
            mCollapsingToolbar.setTitle("The Egyptian Museum");
            details.setText(R.string.the_egyptian_museum);
        } else if (MainActivity.num == 2) {
            backdrop.setImageResource(R.drawable.cairotower);
            mCollapsingToolbar.setTitle("Cairo Tower");
            details.setText(R.string.cairo_tower);
        } else if (MainActivity.num == 3) {
            backdrop.setImageResource(R.drawable.c4dc5cf51eb34a7bdf885fd981f);
            mCollapsingToolbar.setTitle("Museum of Islamic Art");
            details.setText(R.string.museum_islamic_art);
        } else if (MainActivity.num == 4) {
            backdrop.setImageResource(R.drawable.khanelkalily);
            mCollapsingToolbar.setTitle("khanel el-Khalili");
            details.setText(R.string.Khan_el_Khalili);
        } else if (MainActivity.num == 5) {
            backdrop.setImageResource(R.drawable.alazharmosque);
            mCollapsingToolbar.setTitle("Al-Azhar Mosque");
            details.setText(R.string.al_azhar_mosque);
        } else if (MainActivity.num == 6) {
            backdrop.setImageResource(R.drawable.elmoez);
            mCollapsingToolbar.setTitle("El-Moez Street");
            details.setText(R.string.el_moez_street);
        } else if (MainActivity.num == 7) {
            backdrop.setImageResource(R.drawable.mohamedalipalace);
            mCollapsingToolbar.setTitle("Mohamed Ali Palace");
            details.setText(R.string.mohamed_ali_palace);
        } else {
            backdrop.setImageResource(R.drawable.sultanhassan);
            mCollapsingToolbar.setTitle("Sultan Hassan Mosque");
            details.setText(R.string.sultan_hassan);
        }

        floatingActionButton.setOnClickListener(new View.OnClickListener() {

            String message;

            @Override
            public void onClick(View v) {
                if (MainActivity.num == 1) {
                    message = "google.navigation:q=Egyptian+Museum+Cairo";
                } else if (MainActivity.num == 2) {
                    message = "google.navigation:q=Cairo+Tower";
                } else if (MainActivity.num == 3) {
                    message = "google.navigation:q=Museum+of+Islamic+Art+Cairo";
                } else if (MainActivity.num == 4) {
                    message = "google.navigation:q=Khan+el-Khalili";
                } else if (MainActivity.num == 5) {
                    message = "google.navigation:q=Al-Azhar+Mosque";
                } else if (MainActivity.num == 6) {
                    message = "google.navigation:q=Al+Moez+Ldin+Allah+Al+Fatmi";
                } else if (MainActivity.num == 7) {
                    message = "google.navigation:q=Prince+Mohamed+Ali+Palace";
                } else {
                    message = "google.navigation:q=Mosque-Madrassa+of+Sultan+Hassan";
                }
                Intent intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse(message));
                startActivity(intent);
            }
        });
    }

    @Override
    public void onBackPressed() {
        //To support reverse transitions when user clicks the device back button
        //fix the floating button flashing
        FloatingActionButton floatingActionButton = (FloatingActionButton) findViewById(R.id.floatingActionButton);
        floatingActionButton.setVisibility(View.GONE);
        supportFinishAfterTransition();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            //To support reverse transition when user clicks the action bar's Up/Home button
            case android.R.id.home:
                //fix the floating button flashing
                FloatingActionButton floatingActionButton = (FloatingActionButton) findViewById(R.id.floatingActionButton);
                floatingActionButton.setVisibility(View.GONE);
                supportFinishAfterTransition();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }
}
