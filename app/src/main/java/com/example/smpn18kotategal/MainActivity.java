package com.example.smpn18kotategal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    public class MainActivity extends AppCompatActivity {

        private SliderPagerAdapter mAdapter;
        private SliderIndicator mIndicator;

        private BannerSlider bannerSlider;
        private LinearLayout mLinearLayout;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            bannerSlider = findViewById(R.id.sliderView);
            mLinearLayout = findViewById(R.id.pagesContainer);
            setupSlider();
        }
        private void klik1{
            Intent intent
        }
    }

        private void setupSlider() {
            bannerSlider.setDurationScroll(800);
            List<Fragment> fragments = new ArrayList<>();

            //link image
            fragments.add(FragmentSlider.newInstance("https://ecs7.tokopedia.net/img/banner/2020/4/19/85531617/85531617_17b56894-2608-4509-a4f4-ad86aa5d3b62.jpg"));
            fragments.add(FragmentSlider.newInstance("https://ecs7.tokopedia.net/img/banner/2020/4/19/85531617/85531617_7da28e4c-a14f-4c10-8fec-845578f7d748.jpg"));
            fragments.add(FragmentSlider.newInstance("https://ecs7.tokopedia.net/img/banner/2020/4/18/85531617/85531617_87a351f9-b040-4d90-99f4-3f3e846cd7ef.jpg"));
            fragments.add(FragmentSlider.newInstance("https://ecs7.tokopedia.net/img/banner/2020/4/20/85531617/85531617_03e76141-3faf-45b3-8bcd-fc0962836db3.jpg"));

            mAdapter = new SliderPagerAdapter(getSupportFragmentManager(), fragments);
            bannerSlider.setAdapter(mAdapter);
            mIndicator = new SliderIndicator(this, mLinearLayout, bannerSlider, R.drawable.indicator_circle);
            mIndicator.setPageCount(fragments.size());
            mIndicator.show();
        }
    }
