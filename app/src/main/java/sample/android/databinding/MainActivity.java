package sample.android.databinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import sample.android.databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding activityMainBinding;
    SampleModel model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        activityMainBinding = DataBindingUtil
                .setContentView(this, R.layout.activity_main);
        model = new SampleModel("Aman", "shandilya.aman@gmail.com", true);
        activityMainBinding.setModel(model);
        activityMainBinding.setActivity(this);
    }

    public void onButtonClick(boolean status) {
        model.setOnline(status);
    }

}
