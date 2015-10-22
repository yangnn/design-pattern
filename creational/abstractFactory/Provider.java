package abstractFactory;

import builder.Sender;

public interface Provider {

	public Sender produce();
}
