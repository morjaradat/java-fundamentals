
/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;

import java.awt.image.BufferedImage;
import java.net.URI;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;
import java.io.*;

public class App {

    public static void main(String[] args) throws IOException {
//        System.out.println("hello mmmmmmmmmm");
        JavaScript_Linter();

    }
    public static void JavaScript_Linter(){
        try {
            BufferedReader br = new BufferedReader(new FileReader("linter/app/src/main/resources/gates.js"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("linter/app/src/main/resources/gatesFix.txt"));

            String s;
            boolean notContainSpecialCharacter;
            for (int i = 0; (s = br.readLine()) != null; i++) {
                notContainSpecialCharacter=true;
                if (!s.endsWith(";")) {
                    if (!s.endsWith("{")) {
                        if (!s.endsWith("}")) {
                            if (!s.contains("if")) {
                                if (!s.contains("else")) {
                                    bw.write(s + ";\n");
                                    notContainSpecialCharacter=false;
                                    System.out.println("The semicolon is missing in line : "+ i);
                                }
                            }
                        }
                    }
                }
                if (notContainSpecialCharacter){
                    bw.write(s +"\n");
                }

            }

            br.close();
            bw.close();

        } catch (Exception ex) {
            System.out.println("Error");
        }
    }
}
