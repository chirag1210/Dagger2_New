package com.mycode.learndagger;
import dagger.Component;

@Component(modules = {MyModule.class})
public interface MyComponent {
  
  void inject(MainActivity mainActivity);
}
