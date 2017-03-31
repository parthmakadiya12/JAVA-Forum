

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import java.sql.*;

@WebServlet(urlPatterns = {"/DB2"})
public class DB2 extends HttpServlet {
  String email,password; 
             PrintWriter out;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
         
           
            email=request.getParameter("Email");           
            password=request.getParameter("Password");
           
     
        out = response.getWriter();
        try {
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Servlet4</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<body>");            
            out.println("PWD : " + password);
            out.println("Email : " +email);
            out.println("</body>");
            out.println("</html>");
            connect( email, password,request,response);
        } finally {            
            out.close();
        }
    }
    protected  void  connect(String email,String password,HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {    
         String url="jdbc:derby://localhost:1527/PM";
        String username="PM";
        String pwd="PM";
        try{   
            out.println("calll");
           Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/PM","PM","PM");
            // String q="SELECT PASSWORD, EMAIL FROM PM.LOGIND WHERE EMAIL='"+email+"'";
            //Statement s=con.createStatement();
            //SELECT LTRIM(RTRIM(PASSWORD, EMAIL)) FROM LOGIND WHERE EMAIL=?;
            PreparedStatement st=con.prepareStatement("SELECT RTRIM(EMAIL),RTRIM(PASSWORD) FROM LOGIND WHERE EMAIL=?;");
            st.setString(1, email);
            out.println("_________________1___________________");
           ResultSet rs=st.executeQuery();
            //ResultSet rs=s.executeQuery(q);
            rs.next();
                   String em= rs.getString("EMAIL");
                   String pw= rs.getString("PASSWORD");
                   out.println("<br/>db usr em  '"+em+"'");
                   out.println("<br/>db pwd pw '"+pw+"'");
                   out.println("<br/>inpu usr email  '"+email+"'");
                   out.println("<br/>inpu pwd password  '"+password+"'");
           
            if(email.equals(em+" "))
                {
                    out.println("<p>You are</p>");
                    if(password.equals(pw+" "))
                        {
                                out.print("<p>You are successfully registered...reg</p>");     
                                //RequestDispatcher rd=
                        }
               }
                
                
        }
         catch ( SQLException err ) {
             out.println(err);
        }
        catch(ClassNotFoundException e)
        {
            out.println(e.getMessage());
        }
       
          
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
}
