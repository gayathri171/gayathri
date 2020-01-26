class MobilePhone{
	void unLock(){
		System.out.println("unlock th mobile..");
	}
	void dialNumber(){
		System.out.println("dial a number to make a call..");
	}
	void sendSms(){
		System.out.println("send sms..");
	}
	void receiveCall(){
		System.out.println("receive a call to communicate..");
	}
}
class BasicSet extends MobilePhone{
	void unLock(){
		System.out.println("unlock the mobile by press * button..");
	}
	void sendSms(){
		System.out.println("send sms by press message key...");
	}
}
class SmartPhone extends MobilePhone{
	void unLock(){
		System.out.println("unlock the mobile through swipe the screen..");
	}
	void sendSms(){
		System.out.println("send sms by using message aplication.. ");
	}
}
class Tester{
	public static void main(String[] args){
	System.out.println("main method started..");
	new MobilePhone().unLock();
	new MobilePhone().sendSms();
	new MobilePhone().receiveCall();
	System.out.println("------");
	new BasicSet().unLock();
	new BasicSet().sendSms();
	System.out.println("------");
	new SmartPhone().unLock();
	new SmartPhone().sendSms();
	System.out.println("main method ended..");
	}
}