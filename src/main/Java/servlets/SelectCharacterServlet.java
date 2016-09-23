package servlets;

import data.character;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tom on 9/22/16.
 */

public class SelectCharacterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet (req, resp);
    }
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //find the id submitted
        //get that character object and place it into the request
        //forward on
        // get id of desired one to delete
        String selectThisId = req.getParameter("id");
        long selectid = Long.parseLong(selectThisId);

        // get session list
        List<character> characterList = (List<character>) req.getSession().getAttribute("thecharacterList");


        if (characterList == null){
            characterList = new ArrayList<>();
        }

        // remove from list
        character foundCharacter = null;
        for(character x:characterList){
            if(x.getId() == selectid){
                //point character at variable
                foundCharacter = x;
                break;
            }
        }
        //put into request
        req.setAttribute("selectedcharacter", foundCharacter);
        // forward to page
        RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/index.jsp");
        dispatcher.forward(req,resp);

    }


}
