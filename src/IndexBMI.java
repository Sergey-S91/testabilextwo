public class IndexBMI {

    public int bmi(int weight, double height) {

        double result;
        result = (weight / (height * height));
        return (int) result;

    }
}
