package hu.ziron.PlayReserve.Controller;

import hu.ziron.PlayReserve.Dao.PlayFieldDao;
import hu.ziron.PlayReserve.Model.PlayField;
import hu.ziron.PlayReserve.Session.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tamas on 2015.04.24..
 */
@Controller
@SessionAttributes
public class PageController {
    @Autowired
    @Qualifier("playFieldDaoImplTest")
    PlayFieldDao playFieldDao;
    @Autowired
    UserDetails userDetails;

    @RequestMapping("/")
    public String returnHome(Model model) {
        model.addAttribute("PlayField", new PlayField());

        return "home";
    }

    @RequestMapping(value = "/readReservation", method = RequestMethod.GET)
    public
    @ResponseBody
    ArrayList<PlayField>

    getPlayFields() {
        ArrayList<PlayField> playFields = (ArrayList<PlayField>) playFieldDao.getAllPlayField();
        return playFields;
    }

    @RequestMapping(value = "/saveChanges", method = RequestMethod.POST)
    public void saveChanges(@ModelAttribute("PlayField") PlayField playField, BindingResult bindingResult) {

    }
}
