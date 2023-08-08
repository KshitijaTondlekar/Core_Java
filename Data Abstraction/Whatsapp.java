public  abstract class Whatsapp extends SocialMedia {
	@Override
	public void sendMessage() {
		System.out.println("Send available in version 1");
	}
	@Override
	public void receiveMessage() {
		System.out.println("Receive available in version 2");
	}

}
