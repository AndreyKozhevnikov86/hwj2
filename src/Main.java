public class Main {
    public static void main(String[] args) {
        int check = 300;
        int amaunt = 2300;
        int bonus = amaunt / 100;
        int total2 = amaunt + check;
        int total1 = check + amaunt + bonus;

        if (amaunt >= 1000) {
            System.out.println("Итоговая сумма на счету клиента составит:" + total1);
            System.out.println("Бонус составит:" + bonus);
        } else {
            System.out.println("Итоговая сумма на счету клиента составит:" + total2);
            System.out.println("Бонуса нет");
        }
        
    }
}