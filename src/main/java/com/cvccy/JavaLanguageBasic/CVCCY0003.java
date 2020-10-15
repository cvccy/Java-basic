package com.cvccy.JavaLanguageBasic;

/**
 * @auther CVCCY
 * @data 2020.02.29
 * @QID CVCCY0003
 * @discription Error:(17, 17) java: 可能尚未初始化变量k
 */

public class CVCCY0003 {
    public static void main(String[] args) {
        int i, j, k;
        i = 100;
        while (i > 0) {
            j = i * 2;
            System.out.println(" The value of j is " + j);
//            k = k + 1;
            i--;
        }
    }
}
