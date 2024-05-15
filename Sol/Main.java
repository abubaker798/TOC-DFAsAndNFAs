import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


public class Main {
    public static boolean problem1(String string){
        int[][] transition = {{0,1},{2,1},{2,2}};

        int currentState = 0, symbol;
        for (char ch : string.toCharArray()) {
            if(ch == 'a') {symbol = 0;} else {symbol = 1;}
            currentState = transition[currentState][symbol];
        }

        return (currentState == 0)||(currentState == 1);
    }

    public static boolean problem2(String string) {
        int[][] transition = {{0,3},{2,4},{4,3},{4,4}};

        int currentState = 0, symbol;
        for (char ch : string.toCharArray()) {
            if(ch == '0') {symbol = 0;} else {symbol = 1;}
            currentState = transition[currentState][symbol];
        }

        return (currentState == 3);
    }
    public static boolean problem3(String string) {
        int[][] transition = {{1, 0},{0, 1}};
        int currentState = 0, symbol;
        for (char ch : string.toCharArray()) {
            if(ch == 'y') {symbol = 1;} else {symbol = 0;}
            currentState = transition[currentState][symbol];
        }

        return (currentState == 1);
    }
    public static boolean problem4(String string){
        int[][] transition = {{1, 3},{1, 2},{1, 2},{4, 3}, {4, 3}};
        int currentState = 0, symbol;
        for (char ch : string.toCharArray()) {
            if(ch == 'a') {symbol = 1;} else {symbol = 0;}
            currentState = transition[currentState][symbol];
        }

        return (currentState == 1 || currentState == 3);
    }
    public static boolean problem5(String string) {
        int[][] transition = {{0, 1},{2, 3},{0, 1},{2, 3}};
        int currentState = 0, symbol;
        for (char ch : string.toCharArray()) {
            if(ch == '1') {symbol = 1;} else {symbol = 0;}
            currentState = transition[currentState][symbol];
        }
        return (currentState == 0);
    }
    public static boolean problem6(String string){
        int[][] transition = {{4, 1},{4, 2},{4, 3},{4, 4}, {4, 4}};
        int currentState = 0, symbol;
        for (char ch : string.toCharArray()) {
            if(ch == '1') {symbol = 1;} else {symbol = 0;}
            currentState = transition[currentState][symbol];
        }
        return (currentState == 0 || currentState == 4);
    }
    public static boolean problem7(String string){
        int[][] transition = {{1,2},{0,1},{2,0}};
        int currentState = 0, symbol;
        for (char ch : string.toCharArray()) {
            if(ch == '1') {symbol = 1;} else {symbol = 0;}
            currentState = transition[currentState][symbol];
        }

        return (currentState == 0 || currentState == 2);
    }
    public static boolean problem8(String string){
        int[][] transition = {{0, 1}, {0, 2}, {3, 2}, {3, 4}, {0, 4}};
        int currentState = 0, symbol = 0;
        for (char ch : string.toCharArray()) {
            if(ch == '0') {symbol = 0;} else {symbol = 1;}
            currentState = transition[currentState][symbol];
        }
        return currentState == 4;
    }
    public static boolean problem9(String string){
        int[][] transition = {{1,0},{2,0},{2,2}};
        int currentState = 0, symbol;
        for (char ch : string.toCharArray()) {
            if(ch == '1') {symbol = 1;} else {symbol = 0;}
            currentState = transition[currentState][symbol];
        }

        return (currentState == 0);
    }
    public static boolean problem10(String string){
        //int[][][] transition = {{{q0}, {q0, q1}}, {{q0}, {q1}}};
        int[][] transition = {{1,0},{2,0},{2,2}};
        int currentState = 0, symbol;
        for (char ch : string.toCharArray()) {
            if(ch == '1') {symbol = 1;} else {symbol = 0;}
            currentState = transition[currentState][symbol];
        }
        return (currentState == 0);
    }

    public static void main(String[] args) throws IOException {
        File inputFile = new File("input.txt");
        FileWriter outputFile = new FileWriter("output.txt");
        Scanner myReader = new Scanner(inputFile);

        //===========> problem 1 <==============
        System.out.println("===========> problem 1 <==============");
        String data = myReader.nextLine();
        outputFile.write(data + "\n");

        while (myReader.hasNextLine()) {
            data = myReader.nextLine();
            if (Objects.equals(data, "end")){outputFile.write("x\n");break;}
            if(problem1(data)){outputFile.write("True\n"); System.out.println(true);}
            else {outputFile.write("False\n");  System.out.println(false);}
        }

        //===========> problem 2 <==============
        System.out.println("===========> problem 2 <==============");
        data = myReader.nextLine();
        data = myReader.nextLine();
        outputFile.write(data + "\n");

        while (myReader.hasNextLine()) {
            data = myReader.nextLine();
            if (Objects.equals(data, "end")){outputFile.write("x\n");break;}
            if(problem2(data)){outputFile.write("True\n"); System.out.println(true);}
            else {outputFile.write("False\n");  System.out.println(false);}
        }

        //===========> problem 3 <==============
        System.out.println("===========> problem 3 <==============");
        data = myReader.nextLine();
        data = myReader.nextLine();
        outputFile.write(data + "\n");

        while (myReader.hasNextLine()) {
            data = myReader.nextLine();
            if (Objects.equals(data, "end")){outputFile.write("x\n");break;}
            if(problem3(data)){outputFile.write("True\n"); System.out.println(true);}
            else {outputFile.write("False\n");  System.out.println(false);}
        }

        //===========> problem 4 <==============
        System.out.println("===========> problem 4 <==============");
        data = myReader.nextLine();
        data = myReader.nextLine();
        outputFile.write(data + "\n");

        while (myReader.hasNextLine()) {
            data = myReader.nextLine();
            if (Objects.equals(data, "end")){outputFile.write("x\n");break;}
            if(problem4(data)){outputFile.write("True\n"); System.out.println(true);}
            else {outputFile.write("False\n");  System.out.println(false);}
        }

        //===========> problem 5 <==============
        System.out.println("===========> problem 5 <==============");
        data = myReader.nextLine();
        data = myReader.nextLine();
        outputFile.write(data + "\n");

        while (myReader.hasNextLine()) {
            data = myReader.nextLine();
            if (Objects.equals(data, "end")){outputFile.write("x\n");break;}
            if(problem5(data)){outputFile.write("True\n"); System.out.println(true);}
            else {outputFile.write("False\n");  System.out.println(false);}
        }

        //===========> problem 6 <==============
        System.out.println("===========> problem 6 <==============");
        data = myReader.nextLine();
        data = myReader.nextLine();
        outputFile.write(data + "\n");

        while (myReader.hasNextLine()) {
            data = myReader.nextLine();
            if (Objects.equals(data, "end")){outputFile.write("x\n");break;}
            if(problem6(data)){outputFile.write("True\n"); System.out.println(true);}
            else {outputFile.write("False\n");  System.out.println(false);}
        }

        //===========> problem 7 <==============
        System.out.println("===========> problem 7 <==============");
        data = myReader.nextLine();
        data = myReader.nextLine();
        outputFile.write(data + "\n");

        while (myReader.hasNextLine()) {
            data = myReader.nextLine();
            if (Objects.equals(data, "end")){outputFile.write("x\n");break;}
            if(problem7(data)){outputFile.write("True\n"); System.out.println(true);}
            else {outputFile.write("False\n");  System.out.println(false);}
        }

        //===========> problem 8 <==============
        System.out.println("===========> problem 8 <==============");
        data = myReader.nextLine();
        data = myReader.nextLine();
        outputFile.write(data + "\n");

        while (myReader.hasNextLine()) {
            data = myReader.nextLine();
            if (Objects.equals(data, "end")){outputFile.write("x\n");break;}
            if(problem8(data)){outputFile.write("True\n"); System.out.println(true);}
            else {outputFile.write("False\n");  System.out.println(false);}
        }

        //===========> problem 9 <==============
        System.out.println("===========> problem 9 <==============");
        data = myReader.nextLine();
        data = myReader.nextLine();
        outputFile.write(data + "\n");

        while (myReader.hasNextLine()) {
            data = myReader.nextLine();
            if (Objects.equals(data, "end")){outputFile.write("x\n");break;}
            if(problem9(data)){outputFile.write("True\n"); System.out.println(true);}
            else {outputFile.write("False\n");  System.out.println(false);}
        }

        //===========> problem 10 <==============
        System.out.println("===========> problem 10 <==============");
        data = myReader.nextLine();data = myReader.nextLine();
        outputFile.write(data + "\n");

        while (myReader.hasNextLine()) {
            data = myReader.nextLine();
            if (Objects.equals(data, "End")){outputFile.write("x\n");break;}
            if(problem10(data)){outputFile.write("True\n"); System.out.println(true);}
            else {outputFile.write("False\n");  System.out.println(false);}
        }

        myReader.close();
        outputFile.close();
    }
}