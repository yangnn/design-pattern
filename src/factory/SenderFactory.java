package factory;

/**
 * 普通工厂模式，就是建立一个工厂类，对实现了同一接口的一些类进行实例的创建
 * @author zky
 *
 */
public class SenderFactory {

	/**
	 * 
	 * @param type
	 * @return
	 * zky
	 * 下午5:11:54
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
