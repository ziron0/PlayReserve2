package hu.ziron.PlayReserve.Session;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 * Created by Tamas on 2015.04.25..
 */
@Component
@SessionAttributes
public class UserDetails {

    private String name;
    private String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
