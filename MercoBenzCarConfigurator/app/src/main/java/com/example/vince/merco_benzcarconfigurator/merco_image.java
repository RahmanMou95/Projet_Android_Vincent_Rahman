package com.example.vince.merco_benzcarconfigurator;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.NotificationCompat;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import static android.view.View.X;


/**
 * Created by Rahman on 21/03/2018.
 */

public class merco_image extends AppCompatActivity{

    String URL = "http://www.androidbegin.com/wp-content/uploads/2013/07/HD-Logo.gif";
    ImageView img_ext;
    Button btn_ext;
    ProgressDialog mProgressDialog;


    //@GET("application/json");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.image_merco);

        Button btn_toast_page2 = (Button)findViewById(R.id.btn_1);
        btn_toast_page2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(merco_image.this, "Vous etes bien sur la deuxième page", Toast.LENGTH_LONG).show();

            }
        });

        Button btn_Smart_ext = (Button)findViewById(R.id.btn_smart_ext);
        btn_Smart_ext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(merco_image.this,"SmartForTwo", Toast.LENGTH_LONG).show();


                String a = new APIMerco().SmartFortwoTurbo(true);

                Intent intent = new Intent (Intent.ACTION_VIEW, Uri.parse(a));
                startActivity(intent);

            }
        });

        Button btn_Smart_int = (Button)findViewById(R.id.btn_smart_int);
        btn_Smart_int.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(merco_image.this,"SmartForTwo", Toast.LENGTH_LONG).show();


                String a = new APIMerco().SmartFortwoTurbo(false);

                Intent intent = new Intent (Intent.ACTION_VIEW, Uri.parse(a));
                startActivity(intent);

            }
        });


        Button btn_E_ext = (Button)findViewById(R.id.btn_ClasseE_ext);
        btn_E_ext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(merco_image.this,"Mercedes-Benz Classe E", Toast.LENGTH_LONG).show();


                String a = new APIMerco().classeE(true);

                Intent intent = new Intent (Intent.ACTION_VIEW, Uri.parse(a));
                startActivity(intent);

            }
        });

        Button btn_E_int = (Button)findViewById(R.id.btn_classeE_int);
        btn_E_int.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(merco_image.this,"Mercedes-Benz Classe E", Toast.LENGTH_LONG).show();


                String a = new APIMerco().classeE(false);

                Intent intent = new Intent (Intent.ACTION_VIEW, Uri.parse(a));
                startActivity(intent);

            }
        });

        Button btn_GLA_ext = (Button)findViewById(R.id.btn_ClasseGLA_ext);
        btn_GLA_ext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(merco_image.this,"Mercedes-Benz Classe GLA", Toast.LENGTH_LONG).show();


                String a = new APIMerco().classeGLA(true);

                Intent intent = new Intent (Intent.ACTION_VIEW, Uri.parse(a));
                startActivity(intent);

            }
        });

        Button btn_GLA_int = (Button)findViewById(R.id.btn_ClasseGLA_int);
        btn_GLA_int.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(merco_image.this,"Mercedes-Benz Classe GLA", Toast.LENGTH_LONG).show();


                String a = new APIMerco().classeGLA(false);

                Intent intent = new Intent (Intent.ACTION_VIEW, Uri.parse(a));
                startActivity(intent);

            }
        });

        Button btn_SCAB_ext = (Button)findViewById(R.id.btn_ClasseS_ext);
        btn_SCAB_ext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(merco_image.this,"Mercedes-Benz Classe S Cabriolet", Toast.LENGTH_LONG).show();


                String a = new APIMerco().S_500_Cabrio(true);

                Intent intent = new Intent (Intent.ACTION_VIEW, Uri.parse(a));
                startActivity(intent);

            }
        });

        Button btn_SCAB_int = (Button)findViewById(R.id.btn_ClasseS_int);
        btn_SCAB_int.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(merco_image.this,"Mercedes-Benz Classe S Cabriolet", Toast.LENGTH_LONG).show();


                String a = new APIMerco().S_500_Cabrio(false);

                Intent intent = new Intent (Intent.ACTION_VIEW, Uri.parse(a));
                startActivity(intent);

            }
        });

    }

    public void Img_download_ext(View view) {
        startActivity(new Intent(this, ImageExtDownloaderActivity.class));
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        new MenuInflater(this).inflate(R.menu.menu,menu);
        return super.onPrepareOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.toast:
                Toast.makeText(merco_image.this, "Toast", Toast.LENGTH_SHORT).show();
                break;

            case R.id.Pop_up_item:
                new AlertDialog.Builder(merco_image.this)
                        .setMessage("PopUp").show();
                break;

            case R.id.notification_item:
                createNotification();
                break;

            case R.id.quitter:
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    public void createNotification(){

        Intent intent = new Intent(this, merco_image.class);
        PendingIntent pIntent = PendingIntent.getActivity(this, (int) System.currentTimeMillis(), intent, 0);


        Notification noti = new Notification.Builder(this)
                .setContentTitle("Découvrez chaque mois un nouveau restaurant !")
                .setContentText("Abonnez vous!").setSmallIcon(R.drawable.mercedes_benz_logo_transparent_png)
                .setContentIntent(pIntent)
                .addAction(R.drawable.mercedes_benz_logo_transparent_png, "Call", pIntent)
                .addAction(R.drawable.mercedes_benz_logo_transparent_png, "More", pIntent)
                .addAction(R.drawable.mercedes_benz_logo_transparent_png, "And more", pIntent).build();
        NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        noti.flags |= Notification.FLAG_AUTO_CANCEL;

        notificationManager.notify(0, noti);

    }

}