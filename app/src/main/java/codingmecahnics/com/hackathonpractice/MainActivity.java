package codingmecahnics.com.hackathonpractice;

import android.content.Intent;
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
        text1.setText("Don't click me, i forbid you, added by indrajit");
    }

    public void clickInjitbutton(View view) {
        Intent intent = new Intent(this, SeconderyActiviry.class);
        startActivity(intent);
    }

    public void gotologinscreen(View v){
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }


//    public void sendMessage(View view) {
//        Intent intent = new Intent(this, DisplayMessageActivity.class);
//        EditText editText = (EditText) findViewById(R.id.edit_message);
//        String message = editText.getText().toString();
//        intent.putExtra(EXTRA_MESSAGE, message);
//        startActivity(intent);
//    }
}
