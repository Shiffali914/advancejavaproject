package org.example.feb15.predicate;

import java.util.function.Function;

public class DriveTest {

  /*  public void ValidateLicense(Predicate<String> predicate, String dln)

    * predicate is functional interface which accept one argument that is <T> and returns a boolean result.
     and inbuilt function boolean Test(T t) T is Data type and t is input argument

    {
        if(predicate.test(dln)){
            System.out.println("driver license is validated");
        }
        else{
            System.out.println("driver license is not validated");
        }
    }
    */

                    // OR we can solve with the help of function interface also

    public void ValidateLicense(Function<String,Boolean>function,String dln) {
        if (function.apply(dln)) {
            System.out.println("driver license is validate");
        } else {
            System.out.println("driver license is not validate");
        }
    }
}
