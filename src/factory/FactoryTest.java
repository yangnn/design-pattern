package factory;

public class FactoryTest {

	public static void main(String args[]){
		/**
		 * ��ͨ����ģʽ
		 */
		SenderFactory factory = new SenderFactory();
		Sender sender = factory.produce("mail");
		sender.send();
		
		
		/**
		 * �����������ģʽ
		 */
		SenderFactory2 factory2 = new SenderFactory2();
		Sender sender2 = factory2.produceMail();
		sender2.send();
		
		
		/**
		 * ��̬��������ģʽ
		 */
		Sender sender3 = SenderFactory3.produceMail();
		sender3.send();
	}
}
