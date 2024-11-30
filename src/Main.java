public class Main {
    public static void main(String[] args) {

        //Определение начального баланса
        int initialBalance = 100;

        //Определение суммы зачисленной на баланс
        int depositAmount = 1100;

        //Определение суммы, находящейся на счету
        int newBalance = depositAmount + initialBalance;

        //Опреление бонуса, который клиент получает за внесение суммы равной или более 1000 руб.
        int bonusAmount = (depositAmount / 100 );

//      Вывод информации с новым балансом, если сумма платежа менее 1000 рублей
//      if (depositAmount < 1000) {
//            System.out.println("На Вашем счету сейчас: " + newBalance + " рублей.");}
//
//      Вывод информации с новым балансом, если сумма платежа равна или более 1000 руб.
//      else if (depositAmount >= 1000) {
//          System.out.println("На Вашем счету сейчас: " + (newBalance + bonusAmount) + " рублей.");}


        System.out.println (depositAmount <= 1000?
                           ("На Вашем счету сейчас: " + newBalance + " рублей."):
                           ("На Вашем счету сейчас: " + (newBalance + bonusAmount) + " рублей."));


    }
}