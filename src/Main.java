public class Main {
    public static void main(String[] args) {

        int clienBalance = 100;
        int operation = 1415;
        int limitForBonus = 1000;

        if (operation > limitForBonus) {

            int bonus = (operation - limitForBonus) / 100;
            int totalBalance = clienBalance + operation + bonus;

            System.out.println("Ваш счет составляет " + totalBalance + ". Вам зачислено " + bonus + " бонусов.");
        } else {

            int totalBalance = clienBalance + operation;

            System.out.println("Ваш счет составляет " + totalBalance + ". Вам зачислено 0 бонусов.");
        }
    }
}