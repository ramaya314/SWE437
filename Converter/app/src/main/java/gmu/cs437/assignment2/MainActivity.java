package gmu.cs437.assignment2;
// MainActivity.java
// Android app using ConstraintLayout

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private EditText inputEditText;
    private TextView resultTextView;
    private Spinner unitSpinner, accuracySpinner;
    private Button clearButton, swapButton;

    private List<Conversion> conversions;
    private int accuracy = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputEditText = findViewById(R.id.inputEditText);
        resultTextView = findViewById(R.id.resultTextView);
        unitSpinner = findViewById(R.id.unitSpinner);
        accuracySpinner = findViewById(R.id.accuracySpinner);
        clearButton = findViewById(R.id.clearButton);
        swapButton = findViewById(R.id.swapButton);

        conversions = Converter.getProgramConversions();
        ArrayAdapter<Conversion> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, conversions);
        unitSpinner.setAdapter(adapter);

        ArrayAdapter<Integer> roundingAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, new Integer[]{0, 1, 2, 3, 4});
        accuracySpinner.setAdapter(roundingAdapter);

        inputEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                performConversion();
            }
            @Override
            public void afterTextChanged(Editable s) {}
        });

        unitSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                performConversion();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {}
        });

        accuracySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                accuracy = (int) parent.getItemAtPosition(position);
                performConversion();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {}
        });

        clearButton.setOnClickListener(v -> {
            inputEditText.setText("");
            resultTextView.setText("Result:");
        });

        swapButton.setOnClickListener(v -> {
            updateSpinner();
            performConversion();
        });
    }

    private void updateSpinner() {
        //get selected conversion
        int position = unitSpinner.getSelectedItemPosition();
        Conversion selected = conversions.get(position);
        //swap it
        conversions.set(position, selected.GetSwap());
        //update it
        ((ArrayAdapter<Conversion>) unitSpinner.getAdapter()).notifyDataSetChanged();
        unitSpinner.setSelection(position);
    }

    private void performConversion() {
        String input = inputEditText.getText().toString();
        if (!input.isEmpty()) {
            float value = Float.parseFloat(input);
            Conversion selectedConversion = (Conversion) unitSpinner.getSelectedItem();
            //conversion should always be the correct operation, the swap has already happened
            float result = selectedConversion.conversion.apply(value);
            resultTextView.setText("Result: " + String.format("%." + accuracy + "f", result));
        }
    }
}
