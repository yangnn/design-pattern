package abstractFactory;

import builder.Sender;

public class Test {

	public static void main(String args[]){
		Provider provider = new MainFactoryProvider();
		Sender sender = provider.produce();
		sender.send();
	}
}
