package abstractFactory;

import builder.MailSender;
import builder.Sender;

public class MainFactoryProvider implements Provider{

	@Override
	public Sender produce() {
		// TODO Auto-generated method stub
		return new MailSender();
	}

}
