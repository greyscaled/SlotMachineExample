package mediumjavafxmvcexample;

import javafx.beans.property.SimpleStringProperty;

/**
 * Class representing a transit ticket vending machine. This is an example and
 * only demonstrates a single property: selecting a transit route.
 */
public final class SlotMachine {

    /**
     * ROUTES that tickets can be issued for
     */
    public static enum ROUTES {
        /**
         * Route 1 - DavidParnasAlley
         */
        ROUTE1,
        /**
         * Route 2 - KnuthVille
         */
        ROUTE2
    }

    /**
     * currently selected route for which tickets are to be issued
     */
    private final SimpleStringProperty selectedRoute = new SimpleStringProperty();

    /**
     * Constructor.
     */
    public SlotMachine() {
        setSelectedRoute("");
    }

    /**
     * Returns selected route property itself
     *
     * @return selectedRoute property
     */
    public SimpleStringProperty selectedRouteProperty() {
        return selectedRoute;
    }

    /**
     * Returns currently selected route
     *
     * @return selected route
     */
    public String getSelectedRoute() {
        return selectedRoute.get();
    }

    /**
     * Selected route to purchase tickets for
     *
     * @param route The route
     */
    public void setSelectedRoute(ROUTES route) {
        setSelectedRoute(route.toString());
    }

    /**
     * Selected route to purchase tickets for
     *
     * @param route the route
     */
    private void setSelectedRoute(String route) {
        selectedRoute.set(route);
    }
}
