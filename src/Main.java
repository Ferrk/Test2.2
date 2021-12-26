public class Main {
    public static void main(String[] args) {
        int currentAccount;
        currentAccount = 100; // Текущий счет клиента
        int depositAmount = 100; // Сумма пополнения счета
        int oneBonus = 100;  // бонус за каждые 100р
        int bonus;
        int sum;
        if (depositAmount >= 1000) {
            bonus = depositAmount / oneBonus;
            sum = currentAccount + depositAmount + bonus;
        } else {
            sum = currentAccount + depositAmount;
            bonus = 0;
        }

        System.out.println("На Вашем счете: " + sum + " рублей");
        System.out.println("Ваш бонус " + bonus + " рублей");
    }
}


