package com.company;

public class Main {
    public static String scroll(String word){
        char first = word.charAt(0);
        String replaced = word.substring(1)+first;
        return replaced;
    }

    public static String convertName(String name){
        String x = name.substring(0,name.indexOf(","));
        String y = name.substring(name.indexOf(",")+1);
        String z = y.trim() +" "+ x.trim();
        return z;
    }

    public static String negative(String neg){
        neg = neg.replaceAll("0","2");
        neg = neg.replaceAll("1","0");
        neg = neg.replaceAll("2","1");
        return neg;
    }

    public static String convertDate(String dateStr){
        String x = dateStr.substring(0,2);
        String y = dateStr.substring(3,5);
        dateStr = y+"-"+x+"-"+ dateStr.substring(6);
        return dateStr;
    }

    public static String convertDate2(String date){
        String x = date.substring(0,2);
        String y = date.substring(3,5);
        if(date.length()<10){
        }
        return date = y+"-"+x+"-"+ date.substring(6);
    }

    public static boolean startsWith(String str, String prefix){
        if(str.startsWith(prefix)){
            return true;
        } else
            return false;
    }

    public static boolean endsWith(String str, String suffix){
        if(str.endsWith(suffix)){
            return true;
        }else
            return false;
    }

    public static String removeTag(String s, String tag){
        String begin = "<"+tag+">";
        String end = "</"+tag+">";
        if( begin.length() == end.length()){
            String x = s.replace(begin, "");
        }
        return "";
    }

    public static void main(String[] args) {
        System.out.println(scroll("Hello World"));

        System.out.println(convertName(" Reubenstein, Lori Renee     "));

        System.out.println(negative("0010111001"));

        System.out.println("04/20/2020 becomes"+convertDate("04/20/2020"));

        System.out.println("\nstartsWith");
        System.out.println(startsWith("architecture", "arch"));
        System.out.println(startsWith("architecture", "a"));
        System.out.println(startsWith("arch", "architecture"));
        System.out.println(startsWith("architecture", "rch"));
        System.out.println(startsWith("architecture", "architecture"));

        System.out.println("\nendsWith");
        System.out.println(endsWith("astronomy", "nomy"));
        System.out.println(endsWith("astronomy", "y"));
        System.out.println(endsWith("astronomy", "nom"));
        System.out.println(endsWith("nomy", "astronomy"));
        System.out.println(endsWith("astronomy", "astronomy"));
    }
}

