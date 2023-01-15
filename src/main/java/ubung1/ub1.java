package ubung1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ub1 {

        public static void main(String[] args) {
            try {
                File inputFile = new File("lander.txt");
                Scanner scanner = new Scanner(inputFile);
                PrintWriter writer = new PrintWriter("lulu.txt");

                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    String[] data = line.split("\\s+");
                    String name = data[0];
                    String continent = data[1];
                    Long area = Long.parseLong(data[2]);
                    Long population = Long.parseLong(data[3]);
                    String capital = data[4];

                    if (name.startsWith("M") && area > 10000) {
                        writer.println(name + ";" + continent + ";" + area + ";" + population + ";" + capital);
                    }
                }
                scanner.close();
                writer.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();

            }
        }
    }


