public class MouseDriver {
public static void main (String args[]) {
	Mouse1 m1 =new Mouse1();
	m1.connected();
	m1.mouseColor();
	
	
	Mouse2 m2 = new Mouse2();
	m2.mouseColor();
	m2.connected();
	m2.leftClick();
	m2.rightClick();
	
	Mouse3 m3 = new Mouse3();
	m3.connected();
	m3.leftClick();
	m3.rightClick();
	m3.scrollDown();
	m3.scrollUp();
	m3.mouseColor();
	
	
}
}
