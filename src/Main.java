import data.GeneratorListData;
import handlers.*;

import logger.Logger;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите количество генерируемых списков: ");
        int n = input();

        for (int i = 0; i < n; i++) {
            System.out.println("Введите тип списка " + (i+1) + "\n1 - список чисел, 2 - список строк");
            int type = inputT();

            if (type == 1){
                System.out.println("Введите количество генерируемых чисел: ");
                int qInt = input();

                System.out.println("Введите минимальный диапазон числа: ");
                int min = inputLength();
                System.out.println("Введите максимальный диапазон числа: ");
                int max = inputLength();
                if (max<min){
                    System.out.println("Ошибка! Максимальный диапазон меньше минимального. Повторите ввод");
                    max = input();
                }
                GeneratorListData dataInt = new GeneratorListData(type,qInt,min,max,0);

                System.out.println("Для второго обработчика укажите, какие числа вы хотите удалить" +
                        "\n1 - четные, 2 - нечетные ");
                int del = inputT();

                IntegerMathHandler hand1 = new IntegerMathHandler(dataInt);
                IntegerDelHandler hand2 = new IntegerDelHandler(dataInt,del);

            } else if (type == 2) {
                System.out.println("Введите количество строк: ");
                int qStr = input();
                System.out.println("Введите максимальное число слов в строке: ");
                int qWord = input();
                System.out.println("Введите минимальную длину слова: ");
                int min = input();

                System.out.println("Введите максимальную длину слова: ");
                int max = input();
                if (max<min){
                    System.out.println("Ошибка! Максимальный диапазон меньше минимального. Повторите ввод");
                    max = input();
                }
                GeneratorListData dataStr = new GeneratorListData(type,qWord,min,max,qStr);

                StringConcatenatHandler hand1 = new StringConcatenatHandler(dataStr);
                StringCountHandler hand2 = new StringCountHandler(dataStr);

            }
        }


        Logger.logInfo();

    }



    static int input() {                            //проверка на ввод положительных чисел
        Scanner scanner = new Scanner(System.in);
        int value = 0;
        if(scanner.hasNextInt()){
            value = scanner.nextInt();
            if (value>0)
                return value;
            else {
                System.out.println("Вы ввели значение меньше положительного, вводите заново: ");
                return input();}
        }else{
            System.out.println("Вы ввели значение не соответствующее типу, вводите заново: ");
            return input();
        }
    }

    static int inputLength() {                            //проверка на ввод длины чисел
        Scanner scanner = new Scanner(System.in);
        int value = 0;
        if(scanner.hasNextInt()){
            value = scanner.nextInt();
            return value;
        }else{
            System.out.println("Вы ввели значение не соответствующее типу, вводите заново: ");
            return inputLength();
        }
    }

    static int inputT() {                            //проверка на ввод выбора - 1 или 2
        Scanner scanner = new Scanner(System.in);
        int value = 0;
        if(scanner.hasNextInt()){
            value = scanner.nextInt();
            if (value==1 || value==2)
                return value;
            else {
                System.out.println("Ошибка, введите 1 или 2!!! : ");
                return inputT();}
        }else{
            System.out.println("Вы ввели значение не соответствующее типу, вводите заново: ");
            return inputT();
        }
    }
}