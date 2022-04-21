package collection;

import java.util.List;

/**
 * You should complete the function in this class
 * <p>
 * Feel free to define any method and / or class you want
 */
class CollectionTest {
  // Additional method to compute the power of a given number
  public static Double power(int i, int n){
    Double res=  1.0;
    //return none if i<0 or n<0
    if(i<0 || n<0)
      return (0.0);
    //return 1 if n==0
    if(n==0){
      return (1.0);
    }
    //if i>=0 && n>0
    for(int j=0; j<n; j++){
      res=res*i;
    }
    return res;
  }

  /**
   * operation : x -> ((x * 2) + 3) ^ 5
   */
  public static List<Double> compute1(List<Integer> input) {
    List<Double> res= new LinkedList<Double>();
    for(int i=0; i<input.size(); i++){
      //we do the operation : x -> ((x * 2) + 3) ^ 5 for each Integer in the List input
      res.add(power(input.get(i)*2+3, 5));
    }
    return res;
  }

  /**
   * operation : abc -> AbcAbc
   */
  public static List<String> compute2(List<String> input) {
    String res_string;
    List<String> res_list = new LinkedList<String>();
    for (int i = 0; i < input.size(); i++) {
      //We do it for each String in input
      String str=input.get(i);
      //Transforme the first letter to a capital one
      res_string=""+Character.toUpperCase(str.charAt(0));
      //loop to append the capital letter of the String and the other chars
      for(int j=1; j<str.length();j++){
        res_string=res_string+str.charAt(j);
      }
      //At the end we append the resulted string to have the result above
      res_string=res_string+res_string;
      //We add it to the resulting List
      res_list.add(res_string);
    }
    return res_list;
  }

}
