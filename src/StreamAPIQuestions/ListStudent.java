package StreamAPIQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ListStudent {

    private String name;
    private String className;
    private Long percentage;
    private String gender;

    public ListStudent(String name, String className, Long percentage, String gender) {
        this.name = name;
        this.className = className;
        this.percentage = percentage;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getClassName() {
        return className;
    }

    public Long getPercentage() {
        return percentage;
    }

    public String getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void setPercentage(Long percentage) {
        this.percentage = percentage;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "HavingMoreThen60{" +
                "name='" + name + '\'' +
                ", className='" + className + '\'' +
                ", percentage=" + percentage +
                ", gender='" + gender + '\'' +
                '}';
    }

    public static void main(String[] args) {

        List<ListStudent> list = Arrays.asList(
          new ListStudent("Anita","Fifth",60L,"Female"),
                new ListStudent("Ramesh","Sixth",58L,"Male"),
                new ListStudent("Rani","Fifth",90L,"Female"),
                new ListStudent("Shubham","Tenth",62L,"Male"),
                new ListStudent("Sneha","Fifth",68L,"Female")
        );

        Stream<ListStudent> result = list.stream()
                .filter(student -> student.getClassName().equals("Fifth") && student.getPercentage() > 60 && student.getGender().equals("Female"));

        result.forEach(System.out::println);
    }
}
