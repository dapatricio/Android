package com.herprogramacion.restaurantericoparico.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.herprogramacion.restaurantericoparico.R;


public class FragmentoVideos extends android.support.v4.app.Fragment implements YouTubePlayer.OnInitializedListener {
    View rootView;



    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragmento_videos, container, false);

        Button vid1 = (Button)rootView.findViewById(R.id.btnVd1);
        Button vid2 = (Button)rootView.findViewById(R.id.btnVd2);
        Button vid3 = (Button)rootView.findViewById(R.id.btnVd3);
        Button vid4 = (Button)rootView.findViewById(R.id.btnVd4);
        vid1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String url = "7pSbb-dyBeA";
                Intent info = new Intent("com.herprogramacion.restaurantericoparico.Actividad_Youtube");
                Bundle b = new Bundle();
                    b.putString("url", url);
                info.putExtras(b);
                startActivity(info);
            }
        });
        vid2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String url = "uu-pHbj0aEk";
                Intent info = new Intent("com.herprogramacion.restaurantericoparico.Actividad_Youtube");
                Bundle b = new Bundle();
                b.putString("url", url);
                info.putExtras(b);
                startActivity(info);
            }
        });
        vid3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String url = "75EdS2wzxCw";
                Intent info = new Intent("com.herprogramacion.restaurantericoparico.Actividad_Youtube");
                Bundle b = new Bundle();
                b.putString("url", url);
                info.putExtras(b);
                startActivity(info);
            }
        });
        vid4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String url = "qJXOKjTac2U";
                Intent info = new Intent("com.herprogramacion.restaurantericoparico.Actividad_Youtube");
                Bundle b = new Bundle();
                b.putString("url", url);
                info.putExtras(b);
                startActivity(info);
            }
        });
        return rootView;
    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {

    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

    }
}