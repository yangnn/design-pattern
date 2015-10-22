package factory;

public class FactoryTest {

	public static void main(String args[]){
		/**
		 * 普通工厂模式
		 */
		SenderFactory factory = new SenderFactory();
		Sender sender = factory.produce("mail");
		sender.send();
		
		
		/**
		 * 多个工厂方法模式
		 */
		SenderFactory2 factory2 = new SenderFactory2();
		Sender sender2 = factory2.produceMail();
		sender2.send();
		
		
		/**
		 * 静态工厂方法模式
		 */
		Sender sender3 = SenderFactory3.produceMail();
		sender3.send();
	}
}
