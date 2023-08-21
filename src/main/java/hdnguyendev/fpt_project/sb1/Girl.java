package hdnguyendev.fpt_project.sb1;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class Girl {
    @Autowired
    public Outfit outfit;

    public Girl(Outfit outfit) {
        this.outfit = outfit;
    }


}
