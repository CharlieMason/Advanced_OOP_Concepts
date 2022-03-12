import com.github.cliftonlabs.json_simple.JsonObject;
import com.github.cliftonlabs.json_simple.Jsoner;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task {
    public static void main(String[] args){
        Task t = new Task();
        JsonObject doc = t.readJson("./resources/restaurant-data.json");
        Database db = new Database(doc);
        System.out.println(db.getRestaurant("Hometown BBQ"));
        System.out.println(db.getAvgReviews("Casa Enrique"));
    }
    public String readFile(String filename) {
        String contents = "";
        try (BufferedReader bufRdr = new BufferedReader(new FileReader(filename))){
            String line = null;
            // read file line by line
            while ((line = bufRdr.readLine()) != null)
                contents += line;
            // close the file reader
            bufRdr.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(-1);
        }
        // return the content of the file
        return contents;
    }

    public JsonObject readJson(String filename){
        String contents = readFile(filename);
        return Jsoner.deserialize(contents, new JsonObject());
    }
}