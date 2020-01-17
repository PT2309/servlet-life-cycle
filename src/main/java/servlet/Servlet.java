package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/home")
public class Servlet extends HttpServlet {

    private String outputString;

    public void init() throws ServletException {

        outputString = "Lifecycle of servlet.Servlet";
        System.out.println("Initializing the web servlet");
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        System.out.println("Inside doGet function for writing response");
        out.println(outputString);
    }

    public void destroy(){

        System.out.println("Destroying the servlet component when the server shuts down");
    }
}
