# Std Java Library
☕ A basic API of methods which are already defined in the standard Java API plus a few more.

## API Method Descriptions
### 1. StdOut
A collection of simple methods that print to the standard output.  

#### [1] method: print()
#### signature  
 ```java 
   static void print(String theString, int theInt, double theDouble, float theFloat)
 ```

<blockquote>
  overloaded, prints to standard output, no newline.   
</blockquote>

#### [2] method: println()
#### signature  
 ```java 
   static void println(String theString, int theInt, double theDouble, float theFloat)
 ```   

<blockquote>
  overloaded, prints to standard output, with newline. arguments are optional, in which case it prints an empty newline.
</blockquote>

#### [3] method: printf()
#### signature  
 ```java 
   static void printf(String format, String theString, int theInt, double theDouble, float theFloat)
   // required: format
 ```   

<blockquote>
  overloaded, prints to standard output, with formatting. the format string is required.
</blockquote>
