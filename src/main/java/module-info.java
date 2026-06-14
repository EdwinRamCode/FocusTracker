module com.edwinramos.focustracker {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.edwinramos.focustracker to javafx.fxml;
    exports com.edwinramos.focustracker;
}