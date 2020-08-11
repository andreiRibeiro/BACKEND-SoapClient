package br.com.aaribeiro.soapcliente.controller;

import br.com.aaribeiro.soapcliente.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/soap-client")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Object get(@PathVariable("id") Integer id) throws Exception {
        return customerService.get(id);
    }
}
