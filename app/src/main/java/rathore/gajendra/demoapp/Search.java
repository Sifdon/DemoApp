package rathore.gajendra.demoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Arrays;

import static rathore.gajendra.demoapp.R.attr.iconifiedByDefault;

public class Search extends AppCompatActivity {

    ArrayAdapter<String> adapter;
    SearchView searchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        ListView listView = (ListView) findViewById(R.id.product_search);
        ArrayList<String> Product_List = new ArrayList<>();
        Product_List.addAll(Arrays.asList(getResources().getStringArray(R.array.ProductsList)));


        adapter = new ArrayAdapter<>(Search.this, android.R.layout.simple_list_item_1, Product_List);
        listView.setAdapter(adapter);
    }


    // SEAECH VIEW CODES
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.search_bar, menu);
        MenuItem item = menu.findItem(R.id.searchView);


        searchView = (SearchView) item.getActionView();

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {


                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {

                adapter.getFilter().filter(newText);
                return false;
            }
        });

        return super.onCreateOptionsMenu(menu);
    }

    //end

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}
