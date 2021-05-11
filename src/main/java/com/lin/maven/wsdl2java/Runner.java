package com.lin.maven.wsdl2java;
import com.sun.xml.ws.runtime.config.ObjectFactory;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URI;

public class Runner {

    public static void main(String[] args) throws MalformedURLException {
        final String endpoint="https://www.dataaccess.com/webservicesserver/numberconversion.wso";
        final URL url=URI.create(endpoint).toURL();
        final NumberConversion service= new NumberConversion(url);
        final  NumberConversionSoapType port= service.getPort(NumberConversionSoapType.class);
        System.out.println("15.99--> "+port.numberToDollars(BigDecimal.valueOf(15.99)));
        System.out.println("27--> "+port.numberToWords(BigInteger.valueOf(27)));



    }
}
