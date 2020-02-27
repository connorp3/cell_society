package cellsociety;

import java.awt.*;

import javafx.application.Application;
import javafx.stage.Stage;

public class Initializer extends Application {
    // convenience constants
    public static final String TITLE = "Game of Life Simulation";
    public static final Dimension DEFAULT_SIZE = new Dimension(500, 500);

    @Override
    public void start (Stage stage) {
        // create program specific components
        GOLModel model = new GOLModel();
        GOLView display = new GOLView(model);
        // give the window a title
        stage.setTitle(TITLE);
        // add our user interface components to Frame and show it
        stage.setScene(display.makeScene(DEFAULT_SIZE.width, DEFAULT_SIZE.height));
        stage.show();
        // start somewhere, less typing for debugging
        // display.showPage(DEFAULT_START_PAGE);
    }



    public static void main (String[] args) {
        launch(args);
    }
}

