module com.example.lab4_oop {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.lab4_oop to javafx.fxml;
    exports com.example.lab4_oop;
}