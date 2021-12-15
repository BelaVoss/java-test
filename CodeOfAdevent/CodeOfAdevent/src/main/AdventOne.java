package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AdventOne {

    public static void main(String[] args) throws IOException {

        AdventOne adventOne = new AdventOne();

        adventOne.stringAlsZahlen();

    }


    public void stringAlsZahlen() throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\bela.voss\\Desktop\\CodeOfAdevent\\CodeOfAdevent\\src\\main\\input.txt"));

        int[] zahlen = new int[2000];

        int counter = 0;

        for (int i = 0; i <2000; i++){

            zahlen[i]  = Integer.parseInt(br.readLine());
        }

        for (int j = 0; j < 2000 -1; j++){

            if (zahlen[j +1]  > zahlen[j]){

                counter ++;

            }
        }
        System.out.println(counter);
    }
}
