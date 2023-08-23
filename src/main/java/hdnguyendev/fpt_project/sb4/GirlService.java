package hdnguyendev.fpt_project.sb4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Time;
import java.util.Date;
import java.util.Random;

@Service
public class GirlService {
    @Autowired
    GirlRepository girlRepository;

    public Girl getRandomGirl() {
        String name = randomGirlName();
        return girlRepository.getGirlByName(name);
    }

    private String randomGirlName() {
        return "Girl name random" ;
    }


}
