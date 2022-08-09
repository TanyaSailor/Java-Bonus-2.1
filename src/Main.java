public class Main {

    public static void main(String[] args) {

        int priceTicket = 2360; // стоимость билета
        int mili = 20; // кол-во рублей для 1-ой бонусной мили
        int bonus = priceTicket / mili;
        System.out.println("Бонус за покупку билета:" + bonus);

    }
}
