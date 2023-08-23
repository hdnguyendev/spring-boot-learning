package hdnguyendev.fpt_project.sb1;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
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

    @PostConstruct
    public void postConstruct() {
        System.out.println("\t>> Đối tượng Girl sau khi khởi tạo xong sẽ chạy hàm này!");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("\t>> Đối tượng Girl trước khi bị destroy sẽ chạy hàm này!");
    }
}
/*
* Quá trình inject Bean theo cách sau:
* 1. Nếu class không có hàm constructor/setter => sử dụng java reflection
* 2. nếu có hàm constructor => inject bean bởi tham số của hàm
* 3. nếu có hàm setter => inject bean vào bởi tham số của hàm
*
*
* */


