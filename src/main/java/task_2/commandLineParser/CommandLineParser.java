package task_2.commandLineParser;

import task_2.invalidCommandLineExeption.InvalidCommandLineException;
/*Напишите тесты к классу CommandLineParser (см. домашнее задание по теме «Исключения»).
Тесты должны проверять работу публичных методов и выбрасываемые исключения. При наличии условных конструкций в методе должны проверяться все ветки.

*/
public class CommandLineParser {
    private boolean ascending = true;
    private String dataType = null;
    private String outputFileName = null;
    private String[] inputFiles = null;

    public CommandLineParser(String[] args) {
        parseCommandLine(args);
    }

    private void parseCommandLine(String[] args) {
        if (args.length < 3) {
            throw new InvalidCommandLineException("Недостаточно аргументов командной строки.");
        }

        for (int i = 0; i < args.length; i++) {
            String arg = args[i];

            if (arg.equals("-a")) {
                ascending = true;
            } else if (arg.equals("-d")) {
                ascending = false;
            } else if (arg.equals("-s") || arg.equals("-i")) {
                dataType = arg;
            } else if (outputFileName == null) {
                outputFileName = arg;
            } else {
                int numInputFiles = args.length - i;
                inputFiles = new String[numInputFiles];
                System.arraycopy(args, i, inputFiles, 0, numInputFiles);
                break;
            }
        }

        if (dataType == null || outputFileName == null || inputFiles == null) {
            throw new InvalidCommandLineException("Неправильный формат аргументов командной строки.");
        }
    }

    public boolean isAscending() {
        return ascending;
    }

    public String getDataType() {
        return dataType;
    }

    public String getOutputFileName() {
        return outputFileName;
    }

    public String[] getInputFiles() {
        return inputFiles;
    }
}
