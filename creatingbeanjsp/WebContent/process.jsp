<jsp:useBean id="u" scope="request" class="creatingbeanjsp.User" >  
<jsp:setProperty property="*" name="u" />  
Record:<br>  
<jsp:getProperty name="u" property="name" /><br>  
 <jsp:getProperty name="u" property="password" /><br>  
<jsp:getProperty name="u" property="email" /><br> 
</jsp:useBean>



<a href="second.jsp">Second</a>
  