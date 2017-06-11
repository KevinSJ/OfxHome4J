package ofxHome4J;

public class Application {

	public static void main(String[] args) {
		Client cl = new Client();
		cl.start();
		OfxClient client = OfxClient.builder().withOfxVersion("1.02").build();
	}

}
