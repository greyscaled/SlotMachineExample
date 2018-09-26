package mediumjavafxmvcexample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

/**
 * FXML Controller class for SlotMachineTab.fxml
 */
public class SlotMachineTabController {
    /**
     * SlotMachine Model
     */
    private final SlotMachine sm;
    
    /**
     * displays selected route
     */
    @FXML
    private Text txtSelectedRoute;
    
    /**
     * selects Route 1
     */
    @FXML
    private Button btnRoute1;
    
    /**
     * selects Route 2
     */
    @FXML
    private Button btnRoute2;
    
    public SlotMachineTabController(SlotMachine sm) {
        this.sm = sm;
    }
    
    @FXML
    private void initialize() {
        // bind selected route Text
        sm.selectedRouteProperty().addListener((obs, oldRoute, newRoute) -> {
            if ("".equals(newRoute)) {
                txtSelectedRoute.setText("NONE");
            } else {
                txtSelectedRoute.setText(newRoute);
            }
        });
        
        // bind Route1, Route2 button handlers
        btnRoute1.setOnAction(e -> sm.setSelectedRoute(SlotMachine.ROUTES.ROUTE1));
        btnRoute2.setOnAction(e -> sm.setSelectedRoute(SlotMachine.ROUTES.ROUTE2));
    }
}
