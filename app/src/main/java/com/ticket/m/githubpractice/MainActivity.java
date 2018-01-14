package com.ticket.m.githubpractice;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    private Button vishal,ankush,dad,mummy,amma;
    private ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vishal = findViewById(R.id.myPic);
        ankush = findViewById(R.id.ankushPic);
        dad=findViewById(R.id.Dad);
        mummy=findViewById(R.id.Mummy);
        amma=findViewById(R.id.Amma);
        image = findViewById(R.id.image);
        dad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                File DadImage=new File("/storage/emulated/0/DCIM/Restored/20170510_134933.jpg");
                if(DadImage.exists())
                {
                    Bitmap DadImageBitmap=BitmapFactory.decodeFile(DadImage.getAbsolutePath());
                    image.setVisibility(View.VISIBLE);
                    image.setImageBitmap(DadImageBitmap);
                }
            }
        });
        mummy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                File MummyImage=new File("/storage/emulated/0/DCIM/Restored/20170814_100513.jpg");
                if(MummyImage.exists())
                {
                    Bitmap MummyImageBitmap=BitmapFactory.decodeFile(MummyImage.getAbsolutePath());
                    image.setVisibility(View.VISIBLE);
                    image.setImageBitmap(MummyImageBitmap);
                }
            }
        });
        amma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                File AmmaImage=new File("/storage/86D4-07E8/GBWhatsApp Old/Media/Media/GBWhatsApp Images/IMG-20171120-WA0006.jpg");
                if(AmmaImage.exists())
                {
                    Bitmap AmmaImageBitmap=BitmapFactory.decodeFile(AmmaImage.getAbsolutePath());
                    image.setVisibility(View.VISIBLE);
                    image.setImageBitmap(AmmaImageBitmap);
                }
            }
        });
        vishal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                File VishalImage= new File("/storage/86D4-07E8/IMG_20171212_211700_497.jpg");
                if(VishalImage.exists())
                {
                    Bitmap VishalImageBitmap= BitmapFactory.decodeFile(VishalImage.getAbsolutePath());
                    image.setVisibility(View.VISIBLE);
                    image.setImageBitmap(VishalImageBitmap);
                }
            }
        });
        ankush.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                File AnkushImage=new File("/storage/86D4-07E8/DCIM/Camera/20171210_101357.jpg");
                if (AnkushImage.exists())
                {
                    Bitmap AnkushImageBitmap=BitmapFactory.decodeFile(AnkushImage.getAbsolutePath());
                    image.setVisibility(View.VISIBLE);
                    image.setImageBitmap(AnkushImageBitmap);
                }
            }
        });
    }






}

