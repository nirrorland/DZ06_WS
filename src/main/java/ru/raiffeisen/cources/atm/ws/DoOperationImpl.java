package main.java.ru.raiffeisen.cources.atm.ws;

import main.java.ru.raiffeisen.cources.atm.ATM;
import main.java.ru.raiffeisen.cources.atm.model.money.Money;
import main.java.ru.raiffeisen.cources.atm.model.score.Score;

import javax.jws.WebService;

@WebService(endpointInterface = "main.java.ru.raiffeisen.cources.atm.ws.IDoOperation")
public class DoOperationImpl implements  IDoOperation {
    private ATM atm;

    public DoOperationImpl(ATM atm) {
        this.atm = atm;
    }


    @Override
    public String addMoney(String accNumber, String money) {

        Integer accNum = Integer.parseInt(accNumber);
        Double sum = Double.parseDouble(money);
        Money sumToAdd = new Money(sum, "RUR");

        if (atm.getCurrentScore().getNumber() == accNum) {
           return atm.getCurrentScore().addMoney(sumToAdd);

        } else
            if (atm.getDebetScore().getNumber() == accNum) {
                return atm.getDebetScore().addMoney(sumToAdd);

            } else
                if (atm.getCreditScore().getNumber() == accNum) {
                    return atm.getCreditScore().addMoney(sumToAdd);

                } else {
                    return "Score not found";
                }

       // return "addMoney";
    }

    @Override
    public String getMoney(String accNumber, String money) {
        try {
            Integer accNum = Integer.parseInt(accNumber);
            Double sum = Double.parseDouble(money);
            Money sumToAdd = new Money(sum, "RUR");

            if (atm.getCurrentScore().getNumber() == accNum) {
                atm.getCurrentScore().getMoney(sum);
                return atm.getCurrentScore().getBalance().toString();

            } else if (atm.getDebetScore().getNumber() == accNum) {
                atm.getDebetScore().getMoney(sum);
                return atm.getDebetScore().getBalance().toString();

            } else if (atm.getCreditScore().getNumber() == accNum) {
                atm.getCreditScore().getMoney(sum);
                return atm.getCreditScore().getBalance().toString();

            } else {
                return "Score not found";
            }



        } catch (Exception e) {
            return e.getMessage();

        }

    }
}
