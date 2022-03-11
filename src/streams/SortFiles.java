package streams;

import java.util.List;
import java.util.stream.Collectors;

public class SortFiles {
    public static void main(String[] args) {

        //Function function---it has methods (apply....)

        List<String> files = List.of("Student.txt", "Employees.csv", "Managers.xlsx", "Departments.txt");
        List<String> sortedFiles =
                files.stream()
                        .map(file -> file.substring(0, file.lastIndexOf(".")))
                        .sorted()
                        .collect(Collectors.toList());
        System.out.println(sortedFiles);
    }
}
