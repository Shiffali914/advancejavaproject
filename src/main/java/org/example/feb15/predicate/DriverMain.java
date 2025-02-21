package org.example.feb15.predicate;

import java.util.function.Function;

public class DriverMain {

    public static void main(String[] args) {

        DriveTest ONdrivetest=new DriveTest();
        DriveTest BCdrivetest=new DriveTest();
        DriveTest QCdrivetest=new DriveTest();


      /*  DLValidate dlValidate=(dl)->dl.length()==15;

        driveTest.ValidateLicense(dlValidate,"H3425678789765");

                                  OR */

        Function<String,Boolean>function1=(dl)->dl.length()==15;
        Function<String,Boolean>function2=(dl)->dl.length()==16;
        Function<String,Boolean>function3=(dl)->dl.length()==14;

        ONdrivetest.ValidateLicense(function1,"H34256787897665");
        BCdrivetest.ValidateLicense(function2,"H3425678789765");
        QCdrivetest.ValidateLicense(function3,"H3425678789716");

    }
}
