package com.example.vince.merco_benzcarconfigurator;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import java.io.InputStream;
import android.os.AsyncTask;
import android.app.Activity;
import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import static android.app.Notification.EXTRA_NOTIFICATION_ID;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView tv_hw = (TextView)findViewById(R.id.text_view1);
        tv_hw.setText("Mercedes benz Car Configurator");
        tv_hw.getText();
        ObjectAnimator Heightanimation = ObjectAnimator.ofInt(tv_hw, "height", 0, 100);
        Heightanimation.setDuration(2000);
        ObjectAnimator AlphaAnimation = ObjectAnimator.ofFloat(tv_hw, "alpha", 0f, 1f);
        AlphaAnimation.setDuration(2000);
        AnimatorSet animator = new AnimatorSet();
        animator.play(Heightanimation).with(AlphaAnimation);
        animator.start();

    }

    public void Merco_Image(View view) {
        startActivity(new Intent(this, merco_image.class));
    }

    public void sendNotification(View view){
        //startActivity(new Intent(this, MainActivity.class));
        Intent intent = new Intent(this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, 0);

        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(this)
                .setSmallIcon(R.mipmap.mercedes_benz_icon)
                .setContentTitle("My Notification")
                .setContentText("Hello World")
                .setPriority(Notification.PRIORITY_DEFAULT)
                .setContentIntent(pendingIntent)
                .setAutoCancel(true);

        NotificationManager mNotificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        mNotificationManager.notify(001,mBuilder.build());

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
                Toast.makeText(MainActivity.this, "Toast", Toast.LENGTH_SHORT).show();
                break;

            case R.id.Pop_up_item:
                new AlertDialog.Builder(MainActivity.this)
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

        /*Intent intent = new Intent(this, MainActivity.class);
        PendingIntent pIntent = PendingIntent.getActivity(this, (int) System.currentTimeMillis(), intent, 0);


        Notification noti = new Notification.Builder(this)
                .setContentTitle("Bienvenue dans MercoBenzCarConfigurator")
                .setContentText("Bienvenue")
                .setSmallIcon(R.drawable.mercedes_benz_logo_transparent_png)
                .setContentIntent(pIntent)
                .addAction(R.drawable.mercedes_benz_logo_transparent_png, "Call", pIntent)
                .addAction(R.drawable.mercedes_benz_logo_transparent_png, "More", pIntent)
                .addAction(R.drawable.mercedes_benz_logo_transparent_png, "And more", pIntent).build();
        NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        noti.flags |= Notification.FLAG_AUTO_CANCEL;

        notificationManager.notify(0, noti);*/

        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(MainActivity.this)
                .setSmallIcon(android.R.drawable.ic_dialog_info)
                .setContentTitle("Notification title")
                .setContentText("Content text");

        // Obtain NotificationManager system service in order to show the notification
        NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        notificationManager.notify(0, mBuilder.build());


    }
}