package servlets;

import data.character;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tom on 9/21/16.
 */
public class createCharacterServlet extends HttpServlet {

    //You should use doGet() when you want to intercept on HTTP GET requests.
    // You should use doPost() when you want to intercept on HTTP POST requests.
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        // Here I can get the parameters for the data variables I declared in the classes in data.character/stats
        //First declare a new variable, to make it easy it can be the same as the ones defined in the classes

        String name = req.getParameter("name");
        String race = req.getParameter("race");
        String type = req.getParameter("type");
        //This one if from a separate class, don't know if this will work.
        String str = req.getParameter("Id");

        // use session to save the session
        HttpSession session = req.getSession();
        List<character> characterList = (List<character>) session.getAttribute("theCharacterList");

        //check if the list is empty
        if (characterList == null)
        {
            characterList = new ArrayList<>();
        }

        //make a new character and stats object

        character myCharacter = new character(name, race, type);
        characterList.add(myCharacter);


                // now im going save the list
        session.setAttribute("characterList", characterList);




    }
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("");
        dispatcher.forward(req,resp);
    }

}
