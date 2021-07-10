/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Muhamad Yamin
 */
public class Reader {

    public static String readFile(String fileName) {
        String sourceText = "";
        File directory = new File(fileName);
        String dirName = directory.getAbsolutePath();
        try {
            File sourceFile = new File((dirName));
            Scanner sourceReader = new Scanner(sourceFile);
            Integer lIndex = 0;
            while(sourceReader.hasNextLine()) {
                sourceText += (lIndex != 0 ? "\n": "") + sourceReader.nextLine();
                lIndex++;
            }
        } catch(IOException e) {
            System.out.println("file tidak diketemukan atau terbaca");
            e.printStackTrace();
        }

        return sourceText;
    }
}
