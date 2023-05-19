# Std Java Library
☕ A basic API of methods which are already defined in the standard Java API plus a few more.

## Documentation

## [1] StdOut

A collection of simple methods that print to the standard output.  

#### [1] method: print()
 - > overloaded, prints to standard output, no newline.
 - #### signature  
   ```java 
     public static void print(String theString, int theInt, double theDouble, float theFloat)
   ```

#### [2] method: println()
 - > overloaded, prints to standard output, with newline. arguments are optional, in which case it prints an empty newline.
 - #### signature  
   ```java 
     public static void println(String theString, int theInt, double theDouble, float theFloat)
   ```   

#### [3] method: printf()
 - > overloaded, prints to standard output, with formatting. the format string is required.
 - #### signature  
   ```java 
     public static void printf(String format, String theString, int theInt, double theDouble, float theFloat)
     // required: format
   ```  

<br />

## [2] StdStats

A collection of simple statistical methods

#### [1] method: max()
  - > overloaded, returns the max item in an array.
  - #### signature  
    ```java 
      public static <Type> max(int[] theIntArray, double[] theDoubleArray, float[] theFloatArray)
      // <Type> is the array type
    ```  
    
 
#### [2] method: min()
  - > overloaded, returns the min item in an array.
  - #### signature  
    ```java 
      public static <Type> min(int[] theIntArray, double[] theDoubleArray, float[] theFloatArray)
      // <Type> is the array type
    ```   
    
#### [3] method: mean()
  - > overloaded, returns the average of all items in an array.
  - #### signature  
    ```java 
      public static <Type> mean(int[] theIntArray, double[] theDoubleArray, float[] theFloatArray)
      // <Type> is the array type, primarily double and float
    ```   
    
 #### [4] method: variance()
  - > overloaded, computes sample variance of all items in an array.
  - #### signature  
    ```java 
      public static <Type> variance(int[] theIntArray, double[] theDoubleArray, float[] theFloatArray)
      // <Type> is the array type, primarily double and float
    ```
    
    
 #### [5] method: stdDeviation()
  - > overloaded, computes standard deviation of the items in an array.
  - #### signature  
    ```java 
      public static double stdDeviation(int[] theIntArray, double[] theDoubleArray, float[] theFloatArray)
    ```
    
  #### [6] method: median()
  - > overloaded, computes median of an ordered array.
  - #### signature  
    ```java 
      public static <Type> median(int[] theIntArray, double[] theDoubleArray, float[] theFloatArray)
      // the array must be ordered
      // <Type> is the array type, primarily double and float
    ```
