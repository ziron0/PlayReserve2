<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
Hello World!
<html>
public String street;
public String number;
public String district;
public String city;
public String name;
public String postCode;
<body>
<form:form modelAttribute="PlayField">
    <form:input type="text" path="street"/>
    <form:input type="text" path="number"/>
    <form:input type="text" path="district"/>
    <form:input type="text" path="city"/>
    <form:input type="text" path="name"/>
    <form:input type="text" path="postCode"/>

</form:form>

</body>
</html>