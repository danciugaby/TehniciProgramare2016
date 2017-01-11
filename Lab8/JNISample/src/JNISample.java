/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package jnisample;

/**
 *
 * @author gabi
 */
public class JNISample {
static {
      System.loadLibrary("Hello"); // Load native library at runtime
                                   
   }
 
   // Declare a native method sayHello() that receives nothing and returns void
   private native void sayHello();
 
   // Test Driver
   public static void main(String[] args) {
      new JNISample().sayHello();  // invoke the native method
   }
    
}
