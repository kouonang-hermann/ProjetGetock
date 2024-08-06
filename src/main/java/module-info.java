module main.Getock{

    requires javafx.controls;
    requires javafx.fxml;

    opens Controllers to javafx.Controllers;

    exports Controllers;
}