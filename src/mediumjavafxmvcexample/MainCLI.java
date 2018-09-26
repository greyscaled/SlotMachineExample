package mediumjavafxmvcexample;

import java.util.Scanner;
import java.util.regex.Pattern;
import mediumjavafxmvcexample.SlotMachine.ROUTES;

public class MainCLI {
    private final SlotMachine smOne;
    private final SlotMachine smTwo;
    
    private final Pattern commands = Pattern.compile(
        "^machine (1|2) select route (1|2)$"
    );
    
    private final Pattern quitCommands = Pattern.compile(
        "^(quit|exit|kill|stop)$"
    );
    
    public MainCLI(SlotMachine one, SlotMachine two) {
        smOne = one;
        smTwo = two;
    }
    
    public void runCommandLine() {
        System.out.println("Welcome. Type in a command with the following syntax:\n"
            + "\tmachine [1 2] select route [1 2]"
            + "\n type one of [quit exit kill stop] to exit"
        );
        try (Scanner in = new Scanner(System.in)) {
            while (true) {
                // cleanse input
                String input = in
                        .nextLine()
                        .trim()
                        .toLowerCase();
                if (commands.matcher(input).matches()) {
                    processCommand(input);
                    dumpState();
                } else if (quitCommands.matcher(input).matches()) {
                    System.exit(0);
                } else {
                    System.out.println("Command not recognize");
                }
            }
        }
    }

    private void processCommand(String input) {
        // tokenize each word of the command
        String[] tokens = input.split(" ");
        
        // use reference to proper slot machine based of fof input token
        SlotMachine sm;
        if ("1".equals(tokens[1])) {
            sm = smOne;
        } else {
            sm = smTwo;
        }
        
        switch (tokens[2]) {
            case "select":
                // determine which route was requested
                ROUTES route;
                if ("1".equals(tokens[4])) {
                    route = SlotMachine.ROUTES.ROUTE1;
                } else {
                    route = SlotMachine.ROUTES.ROUTE2;
                }
                sm.setSelectedRoute(route);
                break;
            default:
                System.out.println("Problem processing command. Try again");
        }
    }

    private void dumpState() {
        String msg = "Current State: \n"
                + "machine 1:\t" + smOne.getSelectedRoute()
                + "\nmachine 2:\t" + smTwo.getSelectedRoute();
        System.out.println(msg);
    }
}
