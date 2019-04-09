package java112.project3;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

/**
 * @author Eric Knapp
 * class BlackJackServlet
 *
 */
@WebServlet(
    name = "blackJack",
    urlPatterns = { "/blackJack" }
)
public class BlackJackServlet extends HttpServlet {

    /**
     *  Handles HTTP GET requests.
     *
     *@param  request                   the HttpServletRequest object
     *@param  response                   the HttpServletResponse object
     *@exception  ServletException  if there is a Servlet failure
     *@exception  IOException       if there is an IO failure
     */
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // TODO get the game state from the GET

        BlackJackBean theBean = new BlackJackBean();

        request.setAttribute("blackJackBean", theBean);

        String url = "/blackjack.jsp";

        RequestDispatcher dispatcher
                = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);


    }

}
