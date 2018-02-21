package com.example.aditya.design_3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.oguzdev.circularfloatingactionmenu.library.FloatingActionButton;
import com.oguzdev.circularfloatingactionmenu.library.FloatingActionMenu;
import com.oguzdev.circularfloatingactionmenu.library.SubActionButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create an icon
        ImageView icon = new ImageView(this);
        icon.setImageResource(R.drawable.txt);

        FloatingActionButton actionButton = new FloatingActionButton.Builder(this);
                .setContentView(icon)
                .build();
        SubActionButton.Builder itemBuilder = new SubActionButton.Builder(this);
        // repeat many times:
        ImageView itemIcon1 = new ImageView(this);
        itemIcon1.setImageResource(R.drawable.gmail);

        ImageView itemIcon2 = new ImageView(this);
        itemIcon2.setImageResource(R.drawable.you);

        ImageView itemIcon3 = new ImageView(this);
        itemIcon3.setImageResource(R.drawable.insta);

        ImageView itemIcon4 = new ImageView(this);
        itemIcon3.setImageResource(R.mipmap.ic_launcher);

        ImageView itemIcon5 = new ImageView(this);
        itemIcon3.setImageResource(R.mipmap.ic_launcher);

        SubActionButton button1 = itemBuilder.setContentView(itemIcon1).build();
        SubActionButton button2 = itemBuilder.setContentView(itemIcon2).build();
        SubActionButton button3 = itemBuilder.setContentView(itemIcon3).build();
        SubActionButton button4 = itemBuilder.setContentView(itemIcon4).build();
        SubActionButton button5 = itemBuilder.setContentView(itemIcon5).build();

        //attach the sub buttons to the main button
        FloatingActionMenu actionMenu = new FloatingActionMenu.Builder(this)
                .addSubActionView(button1)
                .addSubActionView(button2)
                .addSubActionView(button3)
                .addSubActionView(button4)
                .addSubActionView(button5)
                .attachTo(actionButton)
                .build();
        itemIcon1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ip = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(ip);
            }
        });



    }

}