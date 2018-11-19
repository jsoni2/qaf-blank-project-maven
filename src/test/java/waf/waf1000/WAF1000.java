/**
 * 
 */
package waf.waf1000;

/**
 * @author janak.soni
 *
 */

class WFBaseTestPage {

	public void elementsToWaitFor() {
		// TODO Auto-generated method stub
		System.out.println("Base Class");
	}

}

class Page extends WFBaseTestPage {

	public void elementsToWaitFor() {
		// TODO Auto-generated method stub

		// To Fail:
		// Call Super
		// super.elementsToWaitFor();
		// To Pass:
		// Comment Super keyword statement
		
		System.out.println("Page Class");
	}
}

public class WAF1000 {

	/**
	 * @param args
	 * @throws ClassNotFoundException
	 * @throws IllegalAccessException
	 * @throws InstantiationException
	 */
	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		// TODO Auto-generated method stub

		// To Pass:
		WFBaseTestPage p1 = new Page();
		p1.elementsToWaitFor();
		System.out.println("---");

		// To Fail:
		WFBaseTestPage p2 = new WFBaseTestPage();
		p2.elementsToWaitFor();
		System.out.println("---");

		// To Pass:
		Page p3 = new Page();
		p3.elementsToWaitFor();
		System.out.println("---");

		// To Pass:
		Page p4 = (Page) Class.forName("waf1000.Page").newInstance();
		p4.elementsToWaitFor();
		System.out.println("---");

		// To Fail: Throws ClassCast Exception
		 Page p5 = (Page) new WFBaseTestPage();
		 p5.elementsToWaitFor();
		 System.out.println("---");

		// To make sure every instance of Page class override Base Page
		// Page class should not have super keyword in overriding method body.

	}

}
