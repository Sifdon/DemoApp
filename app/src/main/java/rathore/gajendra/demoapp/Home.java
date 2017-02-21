package rathore.gajendra.demoapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;



public class Home extends AppCompatActivity  {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;
    ImageView img;
    DrawerLayout drawer;
    TextView lv;
    ImageView notification;
    ImageView cart;
    ImageView wishlist;
    ImageView offers;
    ImageView home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        notification=(ImageView)findViewById(R.id.notification);
        cart=(ImageView)findViewById(R.id.cart);
        wishlist=(ImageView)findViewById(R.id.wishlist);
        offers=(ImageView)findViewById(R.id.offers);
        home=(ImageView)findViewById(R.id.home);

        notification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Home.this,listitems.class);
                intent.putExtra("open_now","notification");
                startActivity(intent);
            }
        });
        offers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Home.this,listitems.class);
                intent.putExtra("open_now","offers");
                startActivity(intent);
            }
        });
        wishlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Home.this,listitems.class);
                intent.putExtra("open_now","wishlist");
                startActivity(intent);
            }
        });
        cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Home.this,ProductView.class);
                intent.putExtra("open_now","cart");
                startActivity(intent);
            }
        });





        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();

        // on Click Search view on the Home page.

        lv= (TextView)findViewById(R.id.searchBar);

        lv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a= new Intent(Home.this,Search.class);
                startActivity(a);
            }
        });

        //end

        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView leftNavigationView = (NavigationView) findViewById(R.id.nav_left_view);
        leftNavigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                // Handle Left navigation view item clicks here.
                int id = item.getItemId();

                if (id == R.id.nav_Casual) {




                } else if (id == R.id.nav_sports) {
                    Toast.makeText(Home.this, "Left Drawer - Gallery", Toast.LENGTH_SHORT).show();
                } else if (id == R.id.nav_formal) {
                    Toast.makeText(Home.this, "Left Drawer - Slideshow", Toast.LENGTH_SHORT).show();
                } else if (id == R.id.nav_loafers) {
                    Toast.makeText(Home.this, "Left Drawer - Tools", Toast.LENGTH_SHORT).show();
                } else if (id == R.id.nav_flips) {
                    Toast.makeText(Home.this, "Left Drawer - Share", Toast.LENGTH_SHORT).show();
                } else if (id == R.id.nav_watch ) {
                    Toast.makeText(Home.this, "Left Drawer - Send", Toast.LENGTH_SHORT).show();
                }

                drawer.closeDrawer(GravityCompat.START);
                return true;
            }
        });

        NavigationView rightNavigationView = (NavigationView) findViewById(R.id.nav_right_view);
        rightNavigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                // Handle Right navigation view item clicks here.
                int id = item.getItemId();

                if (id == R.id.nav_settings) {
                    Toast.makeText(Home.this, "Right Drawer - Settings", Toast.LENGTH_SHORT).show();
                } else if (id == R.id.nav_logout) {
                    Toast.makeText(Home.this, "Right Drawer - Logout", Toast.LENGTH_SHORT).show();
                } else if (id == R.id.nav_help) {
                    Toast.makeText(Home.this, "Right Drawer - Help", Toast.LENGTH_SHORT).show();
                } else if (id == R.id.nav_about) {
                    Toast.makeText(Home.this, "Right Drawer - About", Toast.LENGTH_SHORT).show();
                }

                drawer.closeDrawer(GravityCompat.END); /*Important Line*/
                return true;
            }
        });


        img=(ImageView)findViewById(R.id.img1);

        new Handler().postDelayed(new Runnable() {

            /*
             * Showing splash screen with a timer. This will be useful when you
             * want to show case your app logo / company
             */

            @Override
            public void run() {
                img.setImageResource(R.drawable.shoe2);
            }
        }, 5000);
        new Handler().postDelayed(new Runnable() {

            /*
             * Showing splash screen with a timer. This will be useful when you
             * want to show case your app logo / company
             */

            @Override
            public void run() {
                img.setImageResource(R.drawable.shoe3);
            }
        }, 10000);
        new Handler().postDelayed(new Runnable() {

            /*
             * Showing splash screen with a timer. This will be useful when you
             * want to show case your app logo / company
             */

            @Override
            public void run() {
                img.setImageResource(R.drawable.shoe4);
            }
        }, 15000);
        new Handler().postDelayed(new Runnable() {

            /*
             * Showing splash screen with a timer. This will be useful when you
             * want to show case your app logo / company
             */

            @Override
            public void run() {
                img.setImageResource(R.drawable.shoe5);
            }
        }, 20000);
        new Handler().postDelayed(new Runnable() {

            /*
             * Showing splash screen with a timer. This will be useful when you
             * want to show case your app logo / company
             */

            @Override
            public void run() {
                img.setImageResource(R.drawable.shoe6);
            }
        }, 25000);
        new Handler().postDelayed(new Runnable() {

            /*
             * Showing splash screen with a timer. This will be useful when you
             * want to show case your app logo / company
             */

            @Override
            public void run() {
                img.setImageResource(R.drawable.shoe7);
            }
        }, 30000);
        new Handler().postDelayed(new Runnable() {

            /*
             * Showing splash screen with a timer. This will be useful when you
             * want to show case your app logo / company
             */

            @Override
            public void run() {
                img.setImageResource(R.drawable.shoe8);
            }
        }, 35000);
        new Handler().postDelayed(new Runnable() {

            /*
             * Showing splash screen with a timer. This will be useful when you
             * want to show case your app logo / company
             */

            @Override
            public void run() {
                img.setImageResource(R.drawable.shoe9);
            }
        }, 40000);
    }



    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else if (drawer.isDrawerOpen(GravityCompat.END)) {  /*Closes the Appropriate Drawer*/
            drawer.closeDrawer(GravityCompat.END);
        } else {
            super.onBackPressed();
            System.exit(0);
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_openRight) {
            drawer.openDrawer(GravityCompat.END);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }





    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("Home Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }


}
