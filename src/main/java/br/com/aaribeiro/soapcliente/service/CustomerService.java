package br.com.aaribeiro.soapcliente.service;

import br.com.aaribeiro.soapcliente.client.CustomerClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

@Service
public class CustomerService {

    @Autowired
    WebServiceTemplate webServiceTemplate;

    public Object get(Integer id){
        return CustomerClient.get(id, webServiceTemplate);
    }
}
