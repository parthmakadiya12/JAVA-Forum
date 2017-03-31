<%@ page import="java.sql.*" %>

<% Class.forName("org.apache.derby.jdbc.ClientDriver"); %>

<HTML>
    <HEAD>
        <TITLE>The Publishers Database Table </TITLE>
    </HEAD>

    <BODY>
        <H1>The Publishers Database Table </H1>

        <% 
            Connection connection = DriverManager.getConnection(
                "jdbc:derby://localhost:1527/PM", "PM", "PM");

            Statement statement = connection.createStatement() ;
            ResultSet resultset = statement.executeQuery("select * from EMPLOYEES") ; 
        %>

        <TABLE BORDER="1">
            <TR>
                <TH>ID</TH>
                <TH>Age</TH>
                <TH>Firs</TH>
                <TH>las</TH>
               
            </TR>
            <% while(resultset.next()){ %>
            <TR>
                <TD> <%= resultset.getString(1) %></td>
                <TD> <%= resultset.getString(2) %></TD>
                <TD> <%= resultset.getString(3) %></TD>
                <TD> <%= resultset.getString(4) %></TD>
               
            </TR>
            <% } %>
        </TABLE>
    </BODY>
</HTML>








