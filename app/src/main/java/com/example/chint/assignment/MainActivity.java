package com.example.chint.assignment;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    EditText name;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = (EditText)findViewById(R.id.name);
        result = (TextView)findViewById(R.id.text);
        if(savedInstanceState != null){
            String a = savedInstanceState.getString("Result");
            result.setText(a);
        }

    }
    public void onClick(View v){

        String s = name.getText().toString();
        if(s!=null){
            name.setText("");
            result.append(s+"\n");
        }

    }
    public void onClearClicked(View v){
        result.setText("");
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putString("Result", result.getText().toString());
    }

  /*  @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        String a = savedInstanceState.getString("Result");
        result.setText(a);
    }*/
}
