package task_2.main;

import task_2.commandLineParser.CommandLineParser;
import task_2.invalidCommandLineExeption.InvalidCommandLineException;

/*Задание 2.
Напишите тесты к классу CommandLineParser (см. домашнее задание по теме «Исключения»).
Тесты должны проверять работу публичных методов и выбрасываемые исключения.
При наличии условных конструкций в методе должны проверяться все ветки.*/
public class Main {
    public static void main(String[] args) {
        try {
            CommandLineParser parser = new CommandLineParser(args);
            boolean ascending = parser.isAscending();
            String dataType = parser.getDataType();
            String outputFileName = parser.getOutputFileName();
            String[] inputFiles = parser.getInputFiles();

            // Пример обработки и вывода полученных данных:
            System.out.println("Сортировка: " + (ascending ? "по возрастанию" : "по убыванию"));
            System.out.println("Тип данных: " + dataType);
            System.out.println("Имя выходного файла: " + outputFileName);
            System.out.println("Входные файлы:");
            for (String inputFile : inputFiles) {
                System.out.println(inputFile);
            }
        } catch (InvalidCommandLineException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }

    }
}
