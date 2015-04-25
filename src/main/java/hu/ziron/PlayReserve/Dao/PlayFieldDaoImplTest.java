package hu.ziron.PlayReserve.Dao;

import hu.ziron.PlayReserve.Model.PlayField;
import hu.ziron.PlayReserve.Model.PlayFieldBuilder;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tamas on 2015.04.25..
 */
@Component
public class PlayFieldDaoImplTest implements PlayFieldDao {
    @Override
    public List<PlayField> getAllPlayField() {
        PlayField playField = new PlayFieldBuilder().setCity("Budapest").setDistrict("3").setName("BlaBla").setPostCode("1035").createPlayField();
        PlayField playField2 = new PlayFieldBuilder().setCity("Budapest").setDistrict("3").setName("BlaBla2").setPostCode("1035").createPlayField();
        PlayField playField3 = new PlayFieldBuilder().setCity("Budapest").setDistrict("3").setName("BlaBla3").setPostCode("1035").createPlayField();
        List<PlayField> playFields = new ArrayList<>();
        playFields.add(playField);
        playFields.add(playField2);
        playFields.add(playField3);
        playFields.add(null);
        return playFields;
    }
}
