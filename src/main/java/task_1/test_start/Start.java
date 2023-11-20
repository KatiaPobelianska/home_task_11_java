package task_1.test_start;



import lombok.Getter;
import lombok.Setter;

public class Start {
    public static void main(String[] args) {
        TestPojo pojo = new TestPojo();
        pojo.setMyField(12);
        System.out.println(pojo.getMyField());
    }
    public static class TestPojo{
        @Getter
        @Setter
        private int myField;
    }
}
