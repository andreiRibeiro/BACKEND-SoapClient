package br.com.aaribeiro.soapcliente.client;

import br.com.aaribeiro.soapcliente.wsdl.GetCustomerDetailRequest;
import br.com.aaribeiro.soapcliente.wsdl.GetCustomerDetailResponse;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.soap.client.SoapFaultClientException;

public class CustomerClient {

    public static Object get(Integer id, WebServiceTemplate webServiceTemplate){
        String retorno = "";
        GetCustomerDetailRequest request = new GetCustomerDetailRequest();
        request.setId(id);

        try {
            GetCustomerDetailResponse response = (GetCustomerDetailResponse) webServiceTemplate.marshalSendAndReceive(request);
            retorno = response.getCustomerDetail().getNome();
        } catch (SoapFaultClientException e){
            retorno = "Ocorreu um erro no processamento.. " + " MESSAGE: " + e.getFaultStringOrReason();
        }
        return retorno;
    }
}
