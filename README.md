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





 


