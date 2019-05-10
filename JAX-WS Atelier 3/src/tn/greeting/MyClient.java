package tn.greeting;

public class MyClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GreetingService proxy = new GreetingService();
		GreetingPortype service = proxy.getGreetingPort();
		System.out.println(service.greetingOperation());
		System.out.println(service.greetingToOperation("Yassine"));

	}

}
