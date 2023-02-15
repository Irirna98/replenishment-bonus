public class Main {
    public static void main(String[] args) {
        int account = 100;
        int deposit = 1200;
        int bonus;
        if (deposit > 1000) {
            bonus = deposit / 100;
        } else {
            bonus = 0;
        }
        int totalAmount = deposit + deposit + bonus;

        System.out.println(" Итоговая сумма счета: ");
        System.out.println(totalAmount);
        System.out.println(" P ");
        System.out.println(" бонус за пополение: ");
        System.out.println(bonus);
        System.out.println(" P ");

    }
}