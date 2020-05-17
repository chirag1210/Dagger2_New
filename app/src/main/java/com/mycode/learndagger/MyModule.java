package com.mycode.learndagger;

import com.mycode.learndagger.model.Motor;
import com.mycode.learndagger.model.Vehicle;
import dagger.Module;
import dagger.Provides;

@Module
public class MyModule {
  
  @Provides
  public Motor provideMotor(){
    return new Motor();
  }
  
  
  @Provides
  Vehicle provideVehicle(){
    return new Vehicle(new Motor());
  }
}
