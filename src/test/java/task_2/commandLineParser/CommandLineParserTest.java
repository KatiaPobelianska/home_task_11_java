package task_2.commandLineParser;

import org.junit.Test;


import static org.junit.Assert.*;

class CommandLineParserTest {

    @Test
    public void testValidInput(){
        String[] args = {"-a", "-s", "integer", "output.txt", "input1.txt", "input2.txt"};
        CommandLineParser parser = new CommandLineParser(args);

        assertTrue(parser.isAscending());
        assertEquals("integer", parser.getDataType());
        assertEquals("output.txt", parser.getOutputFileName());
        assertArrayEquals(new String[]{"input1.txt", "input2.txt"}, parser.getInputFiles());

    }

}