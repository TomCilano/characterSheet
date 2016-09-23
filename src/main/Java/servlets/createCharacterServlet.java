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
public class CreateCharacterServlet extends HttpServlet {

    //You should use doGet() when you want to intercept on HTTP GET requests.
    // You should use doPost() when you want to intercept on HTTP POST requests.

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Here I can get the parameters for the data variables I declared in the classes in data.character/stats
        //First declare a new variable, to make it easy it can be the same as the ones defined in the classes

        String name = req.getParameter("name");
        String race = req.getParameter("race");
        String type = req.getParameter("type");
        String Id = req.getParameter("id");

        // use session to save the session
        HttpSession session = req.getSession();
        List<character> characterList = (List<character>) session.getAttribute("thecharacterList");

        character foundCharacter = null;

       //checks if the list is populated
        if (characterList == null){
            characterList = new ArrayList<character>();
        }

        //iterates through the list checking for Ids
        for (character t : characterList) {
            if (t.getId() == Long.parseLong(Id)) {
                foundCharacter = t;
            }

        }

        //check if the list is empty
        if (foundCharacter == null) {
            //make a new character and stats object

            /////something is wrong
            character myCharacter = new character(name, race, type, Long.parseLong(Id));
            characterList.add(myCharacter);
        }
        else {
            // otherwise this is an update, so do update on object
            foundCharacter.setName(name);
            foundCharacter.setRace(race);
            foundCharacter.setType(type);
        }
        // now im going save the list
        session.setAttribute("thecharacterList", characterList);

        //this should be the result page
        RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/index.jsp");
        dispatcher.forward(req, resp);

    }

        @Override
        protected void doGet (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
        {
            RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/index.jsp");
            dispatcher.forward(req, resp);
        }


}