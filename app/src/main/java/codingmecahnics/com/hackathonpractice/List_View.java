package codingmecahnics.com.hackathonpractice;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class List_View extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list__view);

        ListView listView = (ListView) findViewById(R.id.listView);
        ArrayAdapter adapter = new ArrayAdapter(List_View.this, android.R.layout.simple_list_item_1, countries);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        Toast.makeText(getApplicationContext(), "Position: "+ position + "Character: "+countries[position],
                                Toast.LENGTH_SHORT).show();
                    }
                }
        );
    }

    String [] countries = new String[]{
            "A", "B", "C","A", "B", "C","A", "B", "C","A", "B", "C", "A", "B", "C", "A", "B", "C"
    };

//    public void startLoginScreen(View v){
//        Intent intent = new Intent(this, LoginActivity.class);
//        startActivity(intent);
//    }


}
