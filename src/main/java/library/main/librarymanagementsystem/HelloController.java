package library.main.librarymanagementsystem;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import library.main.librarymanagementsystem.application.LibraryController;

import java.io.IOException;

public class HelloController {

    @FXML
    protected void onStartButtonClick() throws IOException {
        LibraryController.changeScene();
    }
}