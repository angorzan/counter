package com.example.mycounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int _counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void inc(View view) {
        _counter++;
        updateCounterView();
    }
    public void dec(View view) {
        _counter--;
        updateCounterView();
    }
    public void zero(View view) {
        _counter=0;
        updateCounterView();
    }
    private void updateCounterView() {
        String counterString = String.valueOf(_counter);
        TextView tv = (TextView) findViewById(R.id.counter);
        tv.setText(counterString);
    }

    public void set(View view){
        EditText editText = (EditText) findViewById(R.id.newValue);
        int newValue = Integer.parseInt(editText.getText().toString());
        _counter = newValue;
        updateCounterView();
    }
}