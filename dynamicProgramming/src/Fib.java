/*
 * Write a method fib that takes in a number argument, n, and returns the n-th number of the Fibonacci sequence.

The 0-th number of the sequence is 0.

The 1-st number of the sequence is 1.

To generate further numbers of the sequence, calculate the sum of previous two numbers.

Solve this recursively.

Test 0
Source.fib(0); // -> 0

Test 1
Source.fib(1); // -> 1

Test 2
Source.fib(2); // -> 1

Test 3
Source.fib(3); // -> 2

Test 4
Source.fib(4); // -> 3

Test 5
Source.fib(5); // -> 5

Test 6
Source.fib(35); // -> 9227465

Test 7
Source.fib(46); // -> 1836311903



 */

import java.util.HashMap;
class Source {
  public static int fib(int n) {
    return fib(n, new HashMap<>());
  }

  public static int fib(int n, HashMap <Integer, Integer> memo) {
    if(n == 0 || n == 1){
      return n;
    }

    if(memo.containsKey(n)){
      return memo.get(n);
    }

    int result = fib(n-1, memo) + fib(n-2, memo);
    memo.put(n, result);

    return result;
  }

  

  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  }
}
