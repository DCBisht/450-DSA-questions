package Strings;

public class Strings4 {
    
}

/*
 * 
 * 
 * /*
 * The String pool cannot be possible if String is not immutable in Java. A lot of heap space is saved by JRE.
 *  The same string variable can be referred to by more than one string variable in the pool. 
 * String interning can also not be possible if the String would not be immutable.
If we don’t make the String immutable, it will pose a serious security threat to the application. 

For example, database usernames, passwords are passed as strings to receive database connections.
 The socket programming host and port descriptions are also passed as strings. The String is immutable,
  so its value cannot be changed. If the String doesn’t remain immutable, any hacker can cause a security
   issue in the application by changing the reference value.
The String is safe for multithreading because of its immutableness. Different threads can access a single 
“String instance”. It removes the synchronization for thread safety because we make strings 
thread-safe implicitly.
 */
 