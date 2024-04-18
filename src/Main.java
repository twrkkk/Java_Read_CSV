import com.opencsv.*;
import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * The Main class contains methods for reading data from a CSV file with a custom separator and processing it.
 */
public class Main {
    /**
     * Reads a file from the given file path.
     *
     * @param filePath the path to the file to be read
     * @return the File object representing the file at the given path
     */
    public File readFile(String filePath) {
        return new File(getClass().getResource(filePath).getPath());
    }

    /**
     * The main method of the program. Reads data from a CSV file with custom separator and processes it.
     *
     * @param args command-line arguments (not used in this program)
     */
    public static void main(String[] args) {
        Main main = new Main();
        File file = main.readFile("foreign_names.csv");
        readDataFromCustomSeparator(file);
    }

    /**
     * Reads data from a CSV file with a custom separator and processes it to create Person objects.
     *
     * @param file the CSV file to be read
     */
    public static void readDataFromCustomSeparator(File file) {
        try {
            FileReader filereader = new FileReader(file);

            CSVParser parser = new CSVParserBuilder().withSeparator(';').build();

            CSVReader csvReader = new CSVReaderBuilder(filereader)
                    .withCSVParser(parser)
                    .build();

            // Read all data at once
            List<String[]> allData = csvReader.readAll();
            List<Person> persons = new ArrayList<>();

            int id;
            String name;
            char gender;
            Department dep;
            double salary;
            LocalDate DOB;
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            formatter = formatter.withLocale(Locale.getDefault());

            for (int i = 1; i < allData.size(); i++) {
                String[] row = allData.get(i);
                id = Integer.parseInt(row[0]);
                name = row[1];
                gender = row[2].charAt(0);
                dep = new Department(row[4]);
                salary = Double.parseDouble(row[5]);
                DOB = LocalDate.parse(row[3], formatter);

                persons.add(new Person(id, name, gender, dep, salary, DOB));
            }

            for (Person person : persons) {
                System.out.println(person);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
