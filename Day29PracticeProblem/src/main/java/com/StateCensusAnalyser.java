package com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

 class CSVStateCensus {

    private String filePath;

    public CSVStateCensus(String filePath) {
        this.filePath = filePath;
    }

    public Iterator<String> getCensusDataIterator() throws IOException {
        final BufferedReader br = new BufferedReader(new FileReader("C:/Users/Tejshree/Desktop"));
        return new Iterator<String>()
        {
            private String currentLine = br.readLine();

            @Override
            public boolean hasNext() {
                return currentLine != null;
            }

            @Override
            public String next() {
                String data = currentLine;
                try {
                    currentLine = br.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return data;
            }


        };
    }
}
public class StateCensusAnalyser {

    public static void main(String[] args) {
        try {
            CSVStateCensus censusData = new CSVStateCensus("IndianStatesCensus.csv");
            Iterator<String> iterator = censusData.getCensusDataIterator();

            while (iterator.hasNext()) {
                String line = iterator.next();
                // Process the data as needed
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
