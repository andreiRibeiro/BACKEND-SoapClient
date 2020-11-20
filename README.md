# Soap-client
Microserviço responsável por integrar informações Rest com web-service SOAP

Este projeto simula um cliente utilizando uma API Rest para consultar dados em um web-service SOAP.

Nesta integração este microserviço converte os dados enviados via requisição (request) em objeto SOAP para o web-service https://github.com/andreiRibeiro/soap-server que irá processar esta requisição SOAP e devolver a este microserviço (response) os dados solicitados.

1) Eh possível via API solictar dados de um cliente.

![](src/imagens/soapClientConsulta.png)

2) O sistema realiza o parse dos objetos através dos schemas fornecidos pelo web-service via WSDL.

![](src/imagens/soapClientWsdl.png)

3) O sistema adiciona em seu objeto SOAP de envio, usuario e senha (securityPolicy) solicitados pelo web-service.

![](src/imagens/soapClientSecurity.png)

4) Caso usuário e/ou senha do microserviço estejam inválidos.

![](src/imagens/soapClientPasswd.png)


