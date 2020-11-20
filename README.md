# Soap-client
Microserviço responsável por integrar informações Rest com web-service SOAP

1) Este projeto simula um cliente utilizando uma API Rest para consultar dados em um web-service SOAP.
![](src/imagens/soapClientConsulta.png)

2) O sistema realiza o parse dos objetos através dos schemas fornecidos pelo web-service via WSDL.
![](src/imagens/soapClientWsdl.png)

3) O sistema adiciona em seu objeto SOAP de envio, usuario e senha (securityPolicy) através de um XwsSecurityInterceptor.
![](src/imagens/soapClientSecurity.png)

4) Caso usuário e/ou senha do microserviço estejam inválidos
![](src/imagens/soapClientPasswd.png)


