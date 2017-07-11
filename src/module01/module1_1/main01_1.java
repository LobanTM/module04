package module01.module1_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by tetya on 11.07.2017.
 */
public class main01_1 {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter Your name");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        System.out.println("Hello, " + name);
    }
}
