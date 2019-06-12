package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }
  

	/**
	 * Método que saluda
	 *
	 * @param someone
	 * @return String
	 */
  public String greet(String someone) {
    return String.format("Hello, %s!", someone);
  }
}
