package com.fabriciohsilva.somdosbichos_android;

import android.app.Activity;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity implements View.OnClickListener {


    private ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.mViewHolder.imgCao    = (ImageView) findViewById(R.id.cao);
        this.mViewHolder.imgGato   = (ImageView) findViewById(R.id.gato);
        this.mViewHolder.imgLeao   = (ImageView) findViewById(R.id.leao);
        this.mViewHolder.imgMacaco = (ImageView) findViewById(R.id.macaco);
        this.mViewHolder.imgOvelha = (ImageView) findViewById(R.id.ovelha);
        this.mViewHolder.imgVaca   = (ImageView) findViewById(R.id.vaca);

        this.mViewHolder.imgCao.setOnClickListener(this);
        this.mViewHolder.imgGato.setOnClickListener(this);
        this.mViewHolder.imgLeao.setOnClickListener(this);
        this.mViewHolder.imgMacaco.setOnClickListener(this);
        this.mViewHolder.imgOvelha.setOnClickListener(this);
        this.mViewHolder.imgVaca.setOnClickListener(this);


    }//end protected void onCreate

    @Override
    public void onClick(View v) {

        switch ( v.getId() ){
            case R.id.cao:
                this.mViewHolder.mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.cao);
                tocarSom();
                break;

            case R.id.gato:
                this.mViewHolder.mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.gato);
                tocarSom();
                break;

            case R.id.leao:
                this.mViewHolder.mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.leao);
                tocarSom();
                break;

            case R.id.macaco:
                this.mViewHolder.mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.macaco);
                tocarSom();
                break;

            case R.id.ovelha:
                this.mViewHolder.mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.ovelha);
                tocarSom();
                break;

            case R.id.vaca:
                this.mViewHolder.mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.vaca);
                tocarSom();
                break;

        }//end switch ( v.getId() )

    }// end public void onClick(View v)

    public void tocarSom(){
        if (this.mViewHolder.mediaPlayer != null)
            this.mViewHolder.mediaPlayer.start();
    }//end public void tocarSom()

    @Override
    protected void onDestroy() {

        if (this.mViewHolder.mediaPlayer != null){
            this.mViewHolder.mediaPlayer.stop();
            this.mViewHolder.mediaPlayer.release();
            this.mViewHolder.mediaPlayer = null;
        }//end if (this.mViewHolder.mediaPlayer != null)

        super.onDestroy();
    }//end protected void onDestroy()


    private static class ViewHolder {
        ImageView imgCao;
        ImageView imgGato;
        ImageView imgLeao;
        ImageView imgMacaco;
        ImageView imgOvelha;
        ImageView imgVaca;
        MediaPlayer mediaPlayer;
    }//end private static class mviewHolder

}//end public class MainActivity extends AppCompatActivity
