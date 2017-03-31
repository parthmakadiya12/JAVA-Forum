

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

@WebServlet(urlPatterns = {"/DB1"})
public class DB extends HttpServlet {
  String email,name,password,cpassword,country,DOB; 
            Date d = null; 
            int phone;
    PrintWriter out;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
         
        
            String p=request.getParameter("Phone");
            phone=Integer.parseInt(p);
            email=request.getParameter("Email");
            name=request.getParameter("Name");
            password=request.getParameter("pwd");
            cpassword=request.getParameter("cpwd");
            DOB=request.getParameter("DOB");
            country=request.getParameter("Country"); 
       try 
    {  
      String datestr=DOB;
      DateFormat formatter;       
      formatter = new SimpleDateFormat("MM/dd/yyyy");
      d = (Date)formatter.parse(datestr);  
    } 
    catch (Exception e)
    {}
        out = response.getWriter();
        try {
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Servlet4</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<body>");
            out.println("Name : " +name);
            out.println("PWD : '"+password+"'");
            out.println("DOB : " +d);
            out.println("Phone : " +phone);
            out.println("Counr : " +country);
            out.println("Email : '"+email+"'");
            out.println("</body>");
            out.println("</html>");
            connect(phone, email, name, password, cpassword, country, d);
        } finally {            
            out.close();
        }
    }
    protected  void  connect(int phone,String email,String name,String password,String cpassword,String country,Date d) 
    {    
         String url="jdbc:derby://localhost:1527/PM";
        String username="PM";
        String pwd="PM";
        try{   
            out.println("calll");
           Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/PM","PM","PM");
             String q="INSERT INTO PM.LOGIND (EMAIL, PASSWORD, PHONE, DOB, \"NAME\", COUNTRY) \n" +
"	VALUES (?,?,?,?,?,?)";
            PreparedStatement pst=con.prepareStatement(q);
            pst.setString(1, email);
            pst.setString(2,password);
            pst.setInt(3,phone);
            pst.setDate(4,d);
            pst.setString(5,name);              
            pst.setString(6,country);
               
            int i=pst.executeUpdate();
            if(i>0)
                out.print("You are successfully registered...reg");
        }
         catch ( SQLException err ) {
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
