package codingmecahnics.com.hackathonpractice;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SeconderyActiviry extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondery);


        Button Login_button = (Button)findViewById(R.id.Login_button);
        Login_button.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        TextView tv_user = (TextView)findViewById(R.id.Name_textField);
                        TextView tv_pw = (TextView)findViewById(R.id.pwtextfield);
                        TextView tv = (TextView) findViewById(R.id.displaytextView);

                        tv.setText(tv_user.getText().length() ==0 || tv_pw.getText().length() == 0 ? "Fill inputs you dick head!" : "you did it, "+tv_user.getText()+ ", you filthy piece of shit!");
                    }
                }
        );

        Login_button.setOnLongClickListener(
                new Button.OnLongClickListener(){
                    public boolean onLongClick(View v){
                        TextView tv = (TextView) findViewById(R.id.displaytextView);
                        tv.setText("You twat! why you pressing so long.");
                        return true;
                    }
                }
        );
    }




    @Override
    protected void onPause() {
        super.onPause();
    }

    public void somefunction(View view){
        Log.d("TESTRUN", "Somefunction ran");
        Toast.makeText(this, "You did it", Toast.LENGTH_SHORT).show();
    }

}
