package utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class CSV {

    //This fuction will read data from CSV file and return as a list
    public static List<String[]> read (String file) throws FileNotFoundException {
        List<String[]> data = new LinkedList<String[]>();
        String dataRaw;
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));

            while ((dataRaw = br.readLine()) != null) {
                String[] dataRecords = dataRaw.split(",");
                data.add(dataRecords);

            }
        } catch (FileNotFoundException e) {
            System.out.println("COULD NOT FIND FILE");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("COULD NOT READ FILE");
            e.printStackTrace();
        }
        return data;
    }
}
