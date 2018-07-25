package main.java.ru.raiffeisen.cources.atm.ws;

import main.java.ru.raiffeisen.cources.atm.ATM;

import javax.xml.ws.Endpoint;
public class WebService {
    public static void startEndPoint(ATM atm) {
        Endpoint.publish("http://localhost:9999/ws/do",
                new DoOperationImpl(atm));
    }
}
