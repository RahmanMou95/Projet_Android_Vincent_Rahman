package com.example.vince.merco_benzcarconfigurator;


import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.Image;
import android.provider.ContactsContract;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

public class ImageExtDownloaderActivity extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.download_img_ext);

        imageView =(ImageView)findViewById(R.id.imageView);

        Picasso.get()
                .load("https://www.wsupercars.com/wallpapers/Mercedes-Benz/2018-Mercedes-AMG-GT-C-Edition-50-V6-1080.jpg")
                .into(imageView);

        new AlertDialog.Builder(ImageExtDownloaderActivity.this)
                .setMessage("Voici une image de la Mercedes GT Edition 50")
                .show();

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.toast:
                Toast.makeText(ImageExtDownloaderActivity.this, "Toast", Toast.LENGTH_SHORT).show();
                break;

            case R.id.Pop_up_item:
                new AlertDialog.Builder(ImageExtDownloaderActivity.this)
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

        Intent intent = new Intent(this, ImageExtDownloaderActivity.class);
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