package main.java.ru.raiffeisen.cources.atm;

import main.java.ru.raiffeisen.cources.atm.model.score.DumpType;
import main.java.ru.raiffeisen.cources.atm.ws.WebService;

public class MainWS {

    public static void main(String[] args) {
	    ATM atm = new ATM();

        WebService.startEndPoint(atm);
    }
}
