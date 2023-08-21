package hdnguyendev.fpt_project.sb1;

import org.springframework.stereotype.Component;

@Component
public class Bikini implements Outfit{
    @Override
    public void wear() {
        System.out.println("Wearing Bikini");
    }
}
