public class Main {
    public static void main(String[] args) {
        BMIService service = new BMIService();

        int bodyMassIndex = service.calculate(1.70 , 58.4 ); //рост height указывается в метрах

        System.out.println("Ваш Индекс Массы Тела: " + bodyMassIndex);

    }
}
