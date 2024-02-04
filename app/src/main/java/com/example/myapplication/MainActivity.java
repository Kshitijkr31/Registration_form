package com.example.myapplication;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import androidx.core.view.WindowCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import com.example.myapplication.databinding.ActivityMainBinding;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CheckBox myCheckBox = findViewById(R.id.myCheckBox);

        // Set a listener to handle checkbox state changes
        myCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // Remove the listener temporarily to avoid triggering the listener again
                myCheckBox.setOnCheckedChangeListener(null);

                if (isChecked) {
                    // Do something when the checkbox is checked
                    showToast("Checkbox is checked");

                    // Set the checkbox state to checked programmatically
                    myCheckBox.setChecked(true);
                } else {
                    // Do something when the checkbox is unchecked
                    showToast("Checkbox is unchecked");

                    // You can leave this part empty, or handle unchecked state if needed
                }

                // Add the listener back
                myCheckBox.setOnCheckedChangeListener(this);
            }
        });

        EditText username = findViewById(R.id.username);

        Button regbtn = findViewById(R.id.signupbtn);
        regbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Student Registered Successfully", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
