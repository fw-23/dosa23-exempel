package org.example;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class FileUtils {

    /**
     * Läs objekt från fil
     *
     * @param fileName
     * @return
     */
    public static Object loadObject(String fileName) {
        Object returnObj = null;

        try {
            ObjectInputStream objInStream = new ObjectInputStream(new FileInputStream(fileName));

            returnObj = objInStream.readObject();

            objInStream.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return returnObj;
    }

    /**
     * Spara objekt som fil
     */
    public static void saveObject(Object objectToSave, String fileName) {
        try {
            FileOutputStream outStream = new FileOutputStream(fileName);
            ObjectOutputStream objStream = new ObjectOutputStream(outStream);

            objStream.writeObject(objectToSave);

            objStream.close();
            outStream.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    /**
     *  Läsa textfil
     */
    public static String readTextFile(String fileName) {
        StringBuilder returnString = new StringBuilder();

        try {
            FileInputStream inStream = new FileInputStream(fileName);
            InputStreamReader reader = new InputStreamReader(inStream, StandardCharsets.UTF_8);
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                returnString.append(line);
            }

            reader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return returnString.toString();
    }


    /**
     *  Skriva textfil
     */
    public static void writeTextFile(String text, String fileName) {

        try {
            FileOutputStream outStream = new FileOutputStream(fileName);
            OutputStreamWriter writer = new OutputStreamWriter(outStream, StandardCharsets.UTF_8);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);

            bufferedWriter.write(text);
            bufferedWriter.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            //throw new RuntimeException(e);
        } catch (IOException e) {
            e.printStackTrace();
            //throw new RuntimeException(e);
        }


    }

}
