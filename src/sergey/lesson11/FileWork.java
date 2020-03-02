package sergey.lesson11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class FileWork {
    //chekced (copile)
    //unchekced (rine Time)
    public static void main(String[] args) throws FileNotFoundException {
//        String separator = File.separator;
//        String path = "C:"+separator+"Users"+separator+"naymc"+separator +"OneDrive"+separator+"Рабочий стол"+separator+"file.txt";
        String fileName = "fileSergey";
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);

        String strFile = scanner.nextLine();
        String[] numbersString = strFile.trim().split(" ");
        int[] numbers = new int[numbersString.length];
//        int couner=0;
        for (int i = 0; i <numbersString.length ; i++) {
            numbers[i] = Integer.parseInt(numbersString[i]);
        }
        System.out.println(Arrays.toString(numbers));


        PrintWriter printWriter = new PrintWriter(file);
        for (int i = 0; i < numbers.length; i++) {
            printWriter.print(numbers[i]*2);
            printWriter.print(" ");
        }
//        printWriter.println("45 6 7 9");
//        printWriter.println("15 16 17 19");
//        for (int i = 0; i < numbers.length ; i++) {
//            System.out.print(numbers[i]+" ");
//        }

        printWriter.close();

    }
}
