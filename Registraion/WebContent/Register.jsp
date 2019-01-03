<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
<script> 
function validate()
{ 
 var studentName = document.form.studentName.value;
 var studentDept = document.form.studentDept.value;
 var marks12th = document.form.marks12th.value; 
 var mobileNumber = document.form.mobileNumber.value;
 var percentage= document.form.percentage.value;
 
 if (studentName==null || studentName=="")
 { 
 alert("Name can't be blank"); 
 return false; 
 }
 else if (studentDept==null || studentDept=="")
 { 
 alert("Email can't be blank"); 
 return false; 
 }
 else if (marks12th==null || marks12th=="")
 { 
 alert("Marks can't be empty"); 
 return false;
 }
 else if (mobileNumber==null||mobileNumber=="")
 { 
 alert("Enter a valid mobile Number"); 
 return false; 
 }
 else if (percentage==null || percentage==""||percentage>100)
 { 
 alert("Enter a valid Percentage"); 
 return false; 
 }
}
</script> 
</head>
<body>

<center><h2>StudentRegistrationForm</h2></center>
<form name="form" action="RegisterServlet" method="post" onsubmit="return validate()">
<table align="center">
 <tr>
 <td>Student Name</td>
 <td><input type="text" name="studentName" /></td>
 </tr>
 <tr>
 <td>studentDept</td>
 <td><input type="text" name="studentDept" /></td>
 </tr>
 <tr>
 <td>marks12th</td>
 <td><input type="text" name="marks12th" /></td>
 </tr>
 <tr>
 <td>mobileNumber</td>
 <td><input type="text" name="mobileNumber" /></td>
 </tr>
 <tr>
 <td>percentage</td>
 <td><input type="text" name="percentage" /></td>
 </tr>
 <tr>
 <td><%=(request.getAttribute("errMessage") == null) ? ""
 : request.getAttribute("errMessage")%></td>
 </tr>
 <tr>
 <td></td>
 <td><input type="submit" value="Register"></input><input
 type="reset" value="Reset"></input></td>
 </tr>
</table>
</form>


</body>
</html>