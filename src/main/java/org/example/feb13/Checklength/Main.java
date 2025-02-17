package org.example.feb13.Checklength;

public class Main {
    public static void main(String[] args) {
        CheckString check = (s) -> {
            if(s.length()%2==0){
                return true;
        }
            else {
                return false;
            }
    };
        System.out.println(check.docheck("welcome"));
    }
}
