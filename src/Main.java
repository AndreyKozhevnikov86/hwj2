public class Main {
    public static void main(String[] args) {
        int check = 300;
        int popolnenie = 50;
        int bonus = popolnenie / 100;
        int itogchek2 = popolnenie + check;
        int itogcheck1 = check + popolnenie + bonus;

        if (popolnenie >= 1000) {
            System.out.println("Итоговая сумма на счету клиента составит:" + itogcheck1);
            System.out.println("Бонус составит:" + bonus);
        } else {
            System.out.println("Итоговая сумма на счету клиента составит:" + itogchek2);
            System.out.println("Бонуса нет");
        }
    }
}