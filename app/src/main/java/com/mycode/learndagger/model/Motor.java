package com.mycode.learndagger.model;

import android.util.Log;

public class Motor {
  private int rpm;
  
  public Motor() {
    this.rpm = 0;
  }
  
  int getRpm() {
    return rpm;
  }
  
  void accelerate(int value) {
    rpm += value;
    Log.e("----->",""+rpm);
  }
  
  void decelerate(int value) {
    rpm -= value;
  }
  
  void brake() {
    rpm = 0;
  }
}
