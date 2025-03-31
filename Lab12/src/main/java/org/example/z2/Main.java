package org.example.z2;

public class Main {
    public static void main(String[] args) {
        Tester tester1 = new Tester("John");
        Tester tester2 = new Tester("John", "Doe");
        Tester tester3 = new Tester("John", "Doe", 5, "Advanced", 5000.0);

        tester1.showDetails();
        tester2.showDetails(true);
        tester3.showDetails(true, true);

        Tester.staticMethod();
    }
}
