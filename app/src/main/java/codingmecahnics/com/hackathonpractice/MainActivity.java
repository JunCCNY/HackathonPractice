package codingmecahnics.com.hackathonpractice;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickButton(View v){
        TextView text1 =(TextView) findViewById(R.id.textView2);
        text1.setText("Don't click me");
    }
}
