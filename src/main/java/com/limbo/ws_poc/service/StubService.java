package com.limbo.ws_poc.service;

import com.limbo.ws_poc.calc.Calculator;
import com.limbo.ws_poc.calc.CalculatorSoap;
import org.springframework.stereotype.Service;

import javax.xml.namespace.QName;
import java.net.URL;

@Service
public class StubService {
    private static final QName SERVICE_NAME = new QName("http://tempuri.org/", "Calculator");

    public CalculatorSoap soap(){
        URL wsdlURL = Calculator.WSDL_LOCATION;
        Calculator ss = new Calculator(wsdlURL, SERVICE_NAME);
        return ss.getCalculatorSoap();
    }
}
