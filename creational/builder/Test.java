package builder;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static List<Sender> list = new ArrayList<Sender>();
	
	public static void main(String args[]){
		Builder builder = new Builder();
		list = builder.produceMailSender(10);
		for(Sender s :list){
			s.send();
		}
	}
}
