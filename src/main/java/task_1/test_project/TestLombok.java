package task_1.test_project;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TestLombok {
    private int id;
    private String name;
    @Setter(AccessLevel.PROTECTED)
    private String surname;
}
