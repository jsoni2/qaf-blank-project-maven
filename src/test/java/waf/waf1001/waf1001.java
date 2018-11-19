package waf.waf1001;

public class waf1001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestPage tp1 = new TestPage();
		System.out.println(tp1 instanceof BaseTestPage);
		System.out.println(tp1.getClass().getSuperclass() == BaseTestPage.class);
		
		TestCase tc1 = new TestCase();
		System.out.println(tc1 instanceof BaseTestCase);
		System.out.println(tc1.getClass().getSuperclass() == BaseTestCase.class);
	}

}
