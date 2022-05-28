package sg.edu.rp.c346.id21017005.democheckboxexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnCheck;
    TextView tvShow;
    CheckBox cbEnabled;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCheck = findViewById(R.id.buttonCheck);
        tvShow = findViewById(R.id.textView);
        cbEnabled = findViewById(R.id.checkBoxDiscount);

        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cbEnabled.isChecked()){
                    tvShow.setText("The discount is given.");
                }
                else{
                    tvShow.setText("The discount is not given");
                }
            }
        });
        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "Button Click", Toast.LENGTH_LONG);
                toast.show();
            }
        });


    }




}