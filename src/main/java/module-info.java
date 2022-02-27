module library.main.librarymanagementsystem {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    opens library.main.librarymanagementsystem to javafx.fxml;
    exports library.main.librarymanagementsystem;
    exports library.main.librarymanagementsystem.application;
    opens library.main.librarymanagementsystem.application to javafx.fxml;
}