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

    // Define a the init() method and declare outputString variable inside the function
    // Print - "Initializing the web servlet" in the terminal when servlet get initialized.
    /*
     * Code goes here
     */

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // Set the contentType to ("text/html")
        // Create an instance of PrintWriter with the name out and write the response
        // Print - "Inside doGet function for writing response" in the terminal when localhost:8080/home is request is made from the browser
        /*
        * Code goes here
        */
        out.println(outputString);
    }


    // Define a the destroy() method and Print - "Destroying the servlet component when the server shuts down"
    // in the terminal when servlet shuts down.
    /*
    *   Code goes here
    */
}
