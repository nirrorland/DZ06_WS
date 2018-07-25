package main.java.ru.raiffeisen.cources.atm.model.money;

public interface MoneyInterface {
    String addMoney(Money money);
    Money getMoney(double balanceLess);
    Money getMoneyWithoutLess();
}
