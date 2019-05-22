opensymphony-ognl
------------------
This can be use to getvalue from bindObject which is also called root.<br>
you just need to provide formula/expression and bind object.<br>


Syntax:<br>
formula = propertyName/methodName <br>

Example<br>

<br> formaula = name            &nbsp&nbsp&nbsp>---retun the value of name property 
<br> formula ="welcome(name)"   &nbsp&nbsp&nbsp>---in this case ognl call getName() and put the value as method argument.
<br> formula ="welcome('name')" &nbsp&nbsp&nbsp>---in this case "name" value will be pass to method welcome.
<br> formula ="sum(10,20)"



Real code example:
------------------
    
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
     

