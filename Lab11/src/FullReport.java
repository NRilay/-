import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class FullReport {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Ivanov Ivan", 1234.50),
                new Employee("Petrova Maria", 2345.75),
                new Employee("Sidorov Alex", 3456.00)
        };

        printFullReport(Locale.forLanguageTag("en-US"), employees);
        printFullReport(Locale.forLanguageTag("ru-RU"), employees);
    }

    public static void printFullReport(Locale locale, Employee[] employees) {
        ResourceBundle bundle = ResourceBundle.getBundle("report", locale);
        String title = bundle.getString("report.title");

        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(locale);

        double exchangeRate = 80;

        System.out.println(title);
        for (Employee emp : employees) {
            double salaryInLocalCurrency = emp.salary;

            if (locale.getCountry().equals("US")) {
                salaryInLocalCurrency = emp.salary / exchangeRate;
            }

            String formattedSalary = currencyFormat.format(salaryInLocalCurrency);
            System.out.printf("%-15s %10s%n", emp.fullname, formattedSalary);
        }
        System.out.println();
    }
}
