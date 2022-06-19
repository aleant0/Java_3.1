public class Main {
    public static void main(String[] args) {

        int cost = 1020; // стоимость билета
        int mileBonus = 20; //кол-во рублей за 1 бонусную милю

        int miles = cost / mileBonus;
        System.out.println("Бонусных миль зачислено: " + miles);
    }
}
