package com.mycode.learndagger.model;

import javax.inject.Inject;

public class Vehicle {
  private Motor motor;
  
  @Inject
  public Vehicle(Motor motor) {
    this.motor = motor;
  }
  
  public void increaseSpeed(int value) {
    motor.accelerate(value);
  }
  
  public void decreaseSpeed(int value) {
    motor.decelerate(value);
  }
  
  void stop() {
    motor.brake();
  }
  
  int getSpeed() {
    return motor.getRpm();
  }
}