package rizvi.ognl;

import ognl.Ognl;
import ognl.OgnlException;

/**
 * Hello world!
 *
 */
public class OgnlClient {
	public static void main(String[] args) throws OgnlException {
		RootObjectImpl root = new RootObjectImpl();
		root.setName("Amir");

		Object ret0 = getOGNLValue("name", root);
		System.out.println("Return-value: " + ret0);

		Object ret = getOGNLValue("welcome(name)", root);
		System.out.println("Return-value: " + ret);

		Object ret2 = getOGNLValue("sum(10,20)", root);
		System.out.println("Return-value: " + ret2);

		Object ret3 = getOGNLValue("welcome('name')", root);
		System.out.println("Return-value: " + ret3);
	}

	public static Object getOGNLValue(String formula, Object root) {
		Object ret = null;
		try {
			ret = Ognl.getValue(formula, root);
		} catch (OgnlException e) {
			System.err.println("something-went-wrong: " + e);
			;
		}

		return ret;
	}

}
