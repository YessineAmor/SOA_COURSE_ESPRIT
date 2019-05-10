package webservices;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(name = "greetingPortype", portName = "greetingPort", serviceName = "greetingService", targetNamespace = "http://greeting.tn")
public class HelloWS {

	@WebMethod(operationName = "greetingOperation")
	@WebResult(name = "greeting")
	public String sayHello() {
		return "hello from Jax-ws";
	}

	@WebMethod(operationName = "greetingToOperation")
	@WebResult(name = "greetingTo")
	public String sayHelloTo(String nom) {
		return "hello" + nom;
	}

}
