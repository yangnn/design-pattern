package abstractFactory;

import builder.Sender;
import builder.SmsSender;

public class SmsFactoryProvider implements Provider{

	@Override
	public Sender produce() {
		// TODO Auto-generated method stub
		return new SmsSender();
	}

}
