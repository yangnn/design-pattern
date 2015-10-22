package factory;

/**
 * ��ͨ����ģʽ�����ǽ���һ�������࣬��ʵ����ͬһ�ӿڵ�һЩ�����ʵ���Ĵ���
 * @author zky
 *
 */
public class SenderFactory {

	/**
	 * 
	 * @param type
	 * @return
	 * zky
	 * ����5:11:54
	 */
	public Sender produce(String type){
		if("mail".equals(type))
			return new MailSender();
		else if("sms".equals(type))
			return new SmsSender();
		else{
			System.out.println("please input right type");
			return null;
		}
	}
}
