import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.io.IOException;

public class CensusCSVAnalyzerTest {

    public static void main(String[] args) {
        String csvFilePath = "IndianStatesCensus.csv"; // Replace with the path to your CSV file
        int expectedRecordCount = 29; // Replace with the expected number of records

        try {
            FileReader fileReader = new FileReader("C:\\Users\\Tejshree\\Desktop");
            CSVParser csvParser = new CSVParser(fileReader, CSVFormat.DEFAULT.withHeader());

            int recordCount = 0;

            for (CSVRecord csvRecord : csvParser) {
                // Process the data if needed
                // ...

                // Increment the record count
                recordCount++;
            }

            if (recordCount == expectedRecordCount) {
                System.out.println("Happy Test Case: Number of records matches the expected count.");
            } else {
                System.out.println("Number of records does not match the expected count.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

