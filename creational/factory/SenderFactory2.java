package factory;

/**
 * �����������ģʽ���Ƕ���ͨ��������ģʽ�ĸĽ�������ͨ��������ģʽ�У�������ݵ��ַ�������������ȷ�������󣬶������������ģʽ���ṩ��������������ֱ𴴽�����
 * @author zky
 *
 */
public class SenderFactory2 {

	public Sender produceMail(){
		return new MailSender();
	}
	
	public Sender produceSms(){
		return new SmsSender();
	}
}
