//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        IndexBMI service = new IndexBMI();
        int x = service.bmi(98, 1.87); // Введите свой вес weight =...кг; Введите свой рост height=...м.)
        System.out.println("Ваш индекс BMI = " + x);


    }
}
