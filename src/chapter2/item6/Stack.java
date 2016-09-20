package chapter2.item6;

import java.util.Arrays;

public class Stack<T> {
  
  private T[] elements;
  private int size = 0;
  private static final int DEFAULT_INITIAL_CAPACITY = 16;
  
  public Stack() {
    elements = (T[]) new Object[DEFAULT_INITIAL_CAPACITY];
  }
  
  public Stack(int capacity) {
    elements = (T[]) new Object[capacity];
  }
  
  public void push(T element) {
    ensureCapacity();
    elements[size++] = element;
  }
  
  public T pop() throws Exception {
    if (size == 0) {
      throw new Exception("Empty stack");
    }
    T element = elements[--size];
    elements[size] = null; // Eliminate obsolete reference
    return element;
  }
  
  private void ensureCapacity() {
    if (elements.length == size) {
      elements = Arrays.copyOf(elements, 2 * size);
    }
  }
}
