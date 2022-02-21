public class Main {
    public static void main(String[] args) {
        int ticketAmount = 150; // Стоимость билета
        int numberOfRubles = 20; // Количество рублей за 1 милю
        int bonus = ticketAmount / numberOfRubles; // Количество бонусных миль
        System.out.println(" Всего бонусных миль:" + (bonus));
    }
}
