package mediumjavafxmvcexample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.stage.Stage;

/**
 * Main class. Sets up a JavaFX scene and runs a System.in/out thread.
 */
public class MediumExample extends Application {
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Ticket Vending Machines");
        primaryStage.setResizable(false);
        
        // instantiate 2 SlotMachine models
        SlotMachine smOne = new SlotMachine();
        SlotMachine smTwo = new SlotMachine();
        
        // setup UI Controllers with respective SlotMachines
        SlotMachineTabController smOneController = new SlotMachineTabController(smOne);
        SlotMachineTabController smTwoController = new SlotMachineTabController(smTwo);
        
        // create root element (TabPane)
        TabPane root = new TabPane();
        
        // create tab1, tab2 bound to respective controllers using fxml template
        FXMLLoader loader = new FXMLLoader(getClass().getResource("SlotMachineTab.fxml"));
        
        Tab tab1 = new Tab();
        tab1.setText("Machine 1");
        loader.setController(smOneController);
        tab1.setContent(loader.load());
        root.getTabs().add(tab1);
        
        Tab tab2 = new Tab();
        tab2.setText("Machine 2");
        loader = new FXMLLoader(getClass().getResource("SlotMachineTab.fxml"));
        loader.setController(smTwoController);
        tab2.setContent(loader.load());
        root.getTabs().add(tab2);
        
        // show the initial scene
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
        
        // start a CLI thread
        MainCLI cli = new MainCLI(smOne, smTwo);
        Thread cliThread = new Thread(cli::runCommandLine);
        cliThread.setDaemon(true);
        cliThread.start();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
