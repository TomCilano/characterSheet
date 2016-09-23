package servlets;

import data.character;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by Tom on 9/22/16.
 */
public class DeleteCharacterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        // get id of desired one to delete
        String deleteThisId = req.getParameter("delete");
        long deleteId = Long.parseLong(deleteThisId);

        // get the session list
        List<character> thecharacterList = (List<character>) req.getSession().getAttribute("thecharacterList");
        // remove from list
        for (character m : thecharacterList)
        {
            if (m.getId() == deleteId)
            {
                thecharacterList.remove(m);
                break;
            }
        }

        // forward to create page
        RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/index.jsp");
        dispatcher.forward(req, resp);
    }
}
