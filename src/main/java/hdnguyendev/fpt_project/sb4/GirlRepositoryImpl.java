package hdnguyendev.fpt_project.sb4;

import org.springframework.stereotype.Repository;

@Repository
public class GirlRepositoryImpl implements GirlRepository{
    @Override
    public Girl getGirlByName(String name) {
        return new Girl(name);
    }
}
