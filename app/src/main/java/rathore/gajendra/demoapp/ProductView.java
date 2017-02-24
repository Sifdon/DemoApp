package rathore.gajendra.demoapp;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ProductView extends AppCompatActivity {

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;
    private ImageView wishlistImg;
    private LinearLayout size6;
    private LinearLayout size7;
    private LinearLayout size8;
    private LinearLayout size9;
    private LinearLayout size10;
    private LinearLayout size11;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_view);
        wishlistImg=(ImageView)findViewById(R.id.product_wishlist);
        size6=(LinearLayout)findViewById(R.id.size6);
        size7=(LinearLayout)findViewById(R.id.size7);
        size8=(LinearLayout)findViewById(R.id.size8);
        size9=(LinearLayout)findViewById(R.id.size9);
        size10=(LinearLayout)findViewById(R.id.size10);
        size11=(LinearLayout)findViewById(R.id.size11);
        final TextView tvnew=(TextView)findViewById(R.id.myid);

        size6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                size6.setBackgroundResource(R.drawable.ic_circle2);
                size7.setBackgroundResource(R.drawable.ic_cirle);
                size8.setBackgroundResource(R.drawable.ic_cirle);
                size9.setBackgroundResource(R.drawable.ic_cirle);
                size10.setBackgroundResource(R.drawable.ic_cirle);
                size11.setBackgroundResource(R.drawable.ic_cirle);
            }
        });

        size7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                size7.setBackgroundResource(R.drawable.ic_circle2);
                size6.setBackgroundResource(R.drawable.ic_cirle);
                size8.setBackgroundResource(R.drawable.ic_cirle);
                size9.setBackgroundResource(R.drawable.ic_cirle);
                size10.setBackgroundResource(R.drawable.ic_cirle);
                size11.setBackgroundResource(R.drawable.ic_cirle);
            }
        });

        size8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                size8.setBackgroundResource(R.drawable.ic_circle2);
                size7.setBackgroundResource(R.drawable.ic_cirle);
                size6.setBackgroundResource(R.drawable.ic_cirle);
                size9.setBackgroundResource(R.drawable.ic_cirle);
                size10.setBackgroundResource(R.drawable.ic_cirle);
                size11.setBackgroundResource(R.drawable.ic_cirle);
            }
        });

        size9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                size9.setBackgroundResource(R.drawable.ic_circle2);
                size7.setBackgroundResource(R.drawable.ic_cirle);
                size8.setBackgroundResource(R.drawable.ic_cirle);
                size6.setBackgroundResource(R.drawable.ic_cirle);
                size10.setBackgroundResource(R.drawable.ic_cirle);
                size11.setBackgroundResource(R.drawable.ic_cirle);
            }
        });

        size10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                size10.setBackgroundResource(R.drawable.ic_circle2);
                size7.setBackgroundResource(R.drawable.ic_cirle);
                size8.setBackgroundResource(R.drawable.ic_cirle);
                size9.setBackgroundResource(R.drawable.ic_cirle);
                size6.setBackgroundResource(R.drawable.ic_cirle);
                size11.setBackgroundResource(R.drawable.ic_cirle);
            }
        });

        size11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                size11.setBackgroundResource(R.drawable.ic_circle2);
                size7.setBackgroundResource(R.drawable.ic_cirle);
                size8.setBackgroundResource(R.drawable.ic_cirle);
                size9.setBackgroundResource(R.drawable.ic_cirle);
                size10.setBackgroundResource(R.drawable.ic_cirle);
                size6.setBackgroundResource(R.drawable.ic_cirle);
            }
        });

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_product_view, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private static final String ARG_SECTION_NUMBER = "section_number";

        public PlaceholderFragment() {
        }

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static PlaceholderFragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_product_view, container, false);
            ImageView imageView = (ImageView) rootView.findViewById(R.id.section_label);

            if(getArguments().getInt(ARG_SECTION_NUMBER)==1){
                imageView.setImageResource(R.drawable.sone);

            }
            if(getArguments().getInt(ARG_SECTION_NUMBER)==2){
                imageView.setImageResource(R.drawable.stwo);
            }
            if(getArguments().getInt(ARG_SECTION_NUMBER)==3){
                imageView.setImageResource(R.drawable.sthree);
            }
            if(getArguments().getInt(ARG_SECTION_NUMBER)==4){
                imageView.setImageResource(R.drawable.sfour);
            }
            if(getArguments().getInt(ARG_SECTION_NUMBER)==5){
                imageView.setImageResource(R.drawable.sfive);
            }
            return rootView;
        }
    }

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class below).
            return PlaceholderFragment.newInstance(position + 1);
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 5;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "SECTION 1";
                case 1:
                    return "SECTION 2";
                case 2:
                    return "SECTION 3";
                case 3:
                    return "SECTION 4";
                case 4:
                    return "SECTION 5";
            }
            return null;
        }
    }
}
