<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
	<title>Student Registration Form</title>
</head>

<body>
	<form:form action="processForm" modelAttribute="student">
	
	First name: <form:input path="firstName" />
	
	<br><br>
	
	Last name: <form:input path="lastName" />
	
	<br><br>
	Country:
	
<!--
	<form:select path="country" >
		<form:option value="France" label="France" />
		<form:option value="Brazil" label="Brazil" />
		<form:option value="Taiwan No.1" label="Taiwan" />
	</form:select> 

	<form:select path="country" >
		<form:options items="${student.countryOptions}" />
	</form:select>
-->

	<form:select path="country" >
		<form:options items="${theCountryOptions}" />
	</form:select>
	
	<br><br>
	
	Favorite Language:

<!--
	<form:radiobutton path="favoriteLanguage" value="Java" />Java 
	<form:radiobutton path="favoriteLanguage" value="Python" />Python 
	<form:radiobutton path="favoriteLanguage" value="PHP" />PHP 
	<form:radiobutton path="favoriteLanguage" value="Ruby" />Ruby 
-->

	<form:radiobuttons path="favoriteLanguage" items="${student.favoriteLanguageOptions}" />
	
	<br><br>
	
	Operating Systems: 
	<form:checkbox path="operatingSystems" value="Linux" />Linux 
	<form:checkbox path="operatingSystems" value="Mac OS" />Mac OS 
	<form:checkbox path="operatingSystems" value="MS Windows" />MS Windows
	
	<br><br>
	
	<input type="submit" value="Submit" />
		
	</form:form>

</body>

</html>