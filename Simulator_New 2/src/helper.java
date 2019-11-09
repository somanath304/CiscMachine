/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author somanathjoglekar
 */
import java.util.*;
public class helper {
    /*
    public static void main(String[] args) {
        helperFunc help = new helperFunc();
        //help.decToBinary(1);
        System.out.println(Arrays.toString(help.decToBinary(1)));
        //System.out.println(1/2024);
        System.out.println(help.binaryToDec("10101"));
    }
    */
    public int[] decToBinary(int num) {
        int binary[] = new int[6];
        int binary2[] = new int[6];
        int i = 0;
        while(num > 0){
            binary[i++] = num % 2;
            num = num / 2;
        }
        int k = binary.length - 1;
        for(int j = 0; j < 6; j++) {

            binary2[j] = binary[k];
            k--;
        }

        return binary2;
    }
    public int binaryToDec(String str) {
        int num = Integer.parseInt(str,2);
        return num;
    }

}

