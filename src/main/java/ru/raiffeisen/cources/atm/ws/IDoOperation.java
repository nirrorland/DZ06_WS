package main.java.ru.raiffeisen.cources.atm.ws;

import main.java.ru.raiffeisen.cources.atm.model.money.Money;
import main.java.ru.raiffeisen.cources.atm.model.score.Score;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface IDoOperation {
    @WebMethod String addMoney(String accNumber, String money);

    @WebMethod String getMoney(String accNumber, String money);

}
