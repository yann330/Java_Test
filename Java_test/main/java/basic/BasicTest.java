package basic;

import io.vavr.control.Option;

/**
 * For this basic test, you should not use any library. e.g. you should not use Math.pow for power method
 */
public class BasicTest {

  /**
   * return i ^ n for positive Integer, None otherwise
   * alse return None in case of errors
   */
  public static Option<Integer> power(Integer i, Integer n) {
    Integer res= 1;
    //return none if i<0 or n<0
    if(i<0 || n<0)
      return Option.none();
    //return 1 if n==0
    if(n==0){
      return Option.of(1);
    }
    //if i>=0 && n>0
    for(int j=0; j<n; j++){
      res=res*i;
    }
    return Option.of(res);
  }
}
