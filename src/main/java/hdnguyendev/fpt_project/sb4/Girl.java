package hdnguyendev.fpt_project.sb4;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@ToString
public class Girl {
    private String name;

    public Girl(String name) {
        this.name = name;
    }
}
