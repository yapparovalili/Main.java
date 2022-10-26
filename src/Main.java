public class Main {
    public static void main(String[] args) {

        int airfare = 15000; // стоимость билета
        int ruble = 20; // количество рублей для одной бонусной мили


        System.out.println("Количество начисленных миль за купленный билет:");
        System.out.println((airfare / ruble) + " миль");

    }
}