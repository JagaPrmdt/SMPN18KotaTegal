package com.example.smpn18kotategal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

public class Album4Activity extends AppCompatActivity implements ViewSwitcher.ViewFactory {

    Gallery gallery;
    ImageSwitcher imageSwitcher;
    Context context;
    int imageItem;
    Integer[] images = {
            R.drawable.hutri1, R.drawable.hutri2, R.drawable.hut1,
            R.drawable.hutri4, R.drawable.hut2, R.drawable.hut4,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album1);

        context = Album4Activity.this;

        Gallery gallery = findViewById(R.id.gallery);

        ImageSwitcher imageSwitcher = findViewById(R.id.imageSwitcher);
        imageSwitcher.setFactory(Album4Activity.this);
        imageSwitcher.setInAnimation(AnimationUtils.loadAnimation(Album4Activity.this, android.R.anim.fade_in));
        imageSwitcher.setOutAnimation(AnimationUtils.loadAnimation(Album4Activity.this, android.R.anim.fade_out));
        imageSwitcher.setAlpha(Float.parseFloat("50.0"));

        gallery.setAdapter(new ImageAdapter(this));

        gallery.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                imageItem = position;
                imageSwitcher.setImageResource(images[position]);

            }
        });

    }
    @Override
    public View makeView()  {
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(images[imageItem]);
        return imageView;
    }

    private class ImageAdapter extends BaseAdapter
    {
        Context context;
        ImageAdapter(Context context) {
            this.context = context;
        }

        public int getCount() {
            return images.length;
        }

        public Object getItem(int position) {
            return images[position];
        }

        public long getItemId(int position) {
            return position;
        }

        public View getView(int position, View convertView, ViewGroup parent) {
            ImageView imageView = new ImageView(this.context);
            imageView.setImageResource(images[position]);
            imageView.setLayoutParams(new Gallery.LayoutParams(200, 150));

            return imageView;
        }
    }



}