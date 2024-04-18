import com.opencsv.*;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main
{
    public File readFile(String filePath)
    {
        return new File(getClass().getResource(filePath).getPath());
    }

    public static void main(String[] args) {
        Main main = new Main();
        File file = main.readFile("foreign_names.csv");
        readDataFromCustomSeparator(file);
    }
    public static void readDataFromCustomSeparator(File file)
    {
        try {
            FileReader filereader = new FileReader(file);

            CSVParser parser = new CSVParserBuilder().withSeparator(';').build();

            CSVReader csvReader = new CSVReaderBuilder(filereader)
                    .withCSVParser(parser)
                    .build();

            // Read all data at once
            List<String[]> allData = csvReader.readAll();
            List<Person> persons = new ArrayList<Person>();

            int id;
            String name;
            char gender;
            Department dep;
            double salary;
            LocalDate DOB;
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            formatter = formatter.withLocale(Locale.getDefault());  // Locale specifies human language for translating, and cultural norms for lowercase/uppercase and abbreviations and such. Example: Locale.US or Locale.CANADA_FRENCH


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

            for(var person: persons)
            {
                System.out.println(person);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}


