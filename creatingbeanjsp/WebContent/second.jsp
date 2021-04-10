

<jsp:useBean id="u"  class="creatingbeanjsp.User" >  
  
Record:<br>  
<jsp:getProperty name="u" property="name" /><br>  
 <jsp:getProperty name="u" property="password" /><br>  
<jsp:getProperty name="u" property="email" /><br> 
</jsp:useBean>

