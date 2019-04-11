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
    name = "blackjack",
    urlPatterns = { "/blackjack" }
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
        BlackJackBean theBean;

        // get the game state from query string
        if (request.getQueryString() != null) {
            String playerHit = request.getParameter("playerHit");
            String playerHand = request.getParameter("playerHand");
            String dealerHand = request.getParameter("dealerHand");
            theBean = new BlackJackBean(dealerHand, playerHand);
            if (playerHit != null) {
                theBean.nextTurn(true);
            } else {
                theBean.nextTurn(false);
            }
        } else {
            theBean = new BlackJackBean();
        }



        String url="/blackjack.jsp";

        request.setAttribute("blackJackBean", theBean);



        RequestDispatcher dispatcher
                = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);


    }

}
