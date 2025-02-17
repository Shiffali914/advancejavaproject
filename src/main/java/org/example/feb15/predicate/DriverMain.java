package org.example.feb15.predicate;

public class DriverMain {

    public static void main(String[] args) {

        DriveTest ONdrivetest=new DriveTest();
        DriveTest BCdrivetest=new DriveTest();
        DriveTest QCdrivetest=new DriveTest();


      /*  DLValidate dlValidate=(dl)->dl.length()==15;

        driveTest.ValidateLicense(dlValidate,"H3425678789765");

                                  OR */

        ONdrivetest.ValidateLicense((dl)->dl.length()==15,"H34256787897665");
        BCdrivetest.ValidateLicense((dl)->dl.length()==16,"H3425678789765");
        QCdrivetest.ValidateLicense((dl)->dl.length()==14,"H3425678789716");



    }
}
