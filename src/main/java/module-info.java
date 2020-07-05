module QuizMaster {
    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.graphics;
    requires java.sql;
    requires mysql.connector.java;
    requires lightcouch;
    requires gson;
    requires java.desktop;

    opens view to javafx.graphics, javafx.fxml;
    opens controller to javafx.fxml;
    opens model to gson;
}