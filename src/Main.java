public class Main {
    public static void main(String[] args) {

        int clienBalance = 100;
        int operation = 1415;

        if (operation > 1000) {
            int bonus = (operation) / 100;
            System.out.println( "Вам зачислено " + bonus + " бонусов.");
        } else {
        }

        int totalBalance = clienBalance + operation;
        System.out.println("Ваш счет составляет " + totalBalance + " руб.");
    }
}