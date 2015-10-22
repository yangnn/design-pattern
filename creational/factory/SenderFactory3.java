package factory;


/**
 * ��̬��������ģʽ��������Ķ����������ģʽ��ķ�����Ϊ��̬�ģ�����Ҫ����ʵ����ֱ�ӵ��ü��ɡ�
 * @author zky
 *
 */
public class SenderFactory3 {

	public static Sender produceMail(){
		return new MailSender();
	}
	
	public static Sender produceSms(){
		return new SmsSender();
	}
}
