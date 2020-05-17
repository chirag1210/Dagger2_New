package com.mycode.learndagger;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.mycode.learndagger.model.Motor;
import com.mycode.learndagger.model.Vehicle;
import dagger.Provides;
import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
  
  @Inject
  Vehicle vehicle;
  
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    
    MyComponent myComponent=DaggerMyComponent.builder().build();
    myComponent.inject(this);
    
    vehicle.increaseSpeed(10);
  }
}
