package edu.cnm.deepdive.romannumberconverter;

import static java.lang.Integer.parseInt;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

  Button bt_convertToRoman, bt_convertToNumber;
  EditText et_number, et_romanInput;
  TextView tv_romanOutput, tv_numberOutput;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    bt_convertToNumber = findViewById(R.id.bt_convertToNumber);
    bt_convertToRoman = findViewById(R.id.bt_convertToRoman);
    et_number = findViewById(R.id.et_number);
    et_romanInput = findViewById(R.id.et_romanInput);
    tv_numberOutput = findViewById(R.id.tv_numberOutput);
    tv_romanOutput = findViewById(R.id.tv_romanOutput);

    bt_convertToNumber.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View v) {
        NumberConverter nc2 = new NumberConverter();

        String romanInput;
        int theNumber;

        romanInput = et_romanInput.getText().toString();
        theNumber =  nc2.toNumber(romanInput);
        tv_numberOutput.setText(String.valueOf(theNumber));



      }
    });

    bt_convertToRoman.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View v) {
        NumberConverter nc = new NumberConverter();

        int theNumber;// the input from the user.
        String theRoman; // String to send back to the user;

        theNumber = parseInt(et_number.getText().toString());

        theRoman = nc.toRoman(theNumber);
        tv_romanOutput.setText(theRoman);
      }
    });
  }
}