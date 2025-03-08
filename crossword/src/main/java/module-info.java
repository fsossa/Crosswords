module fulbert.hasanatou.crosswords {
    requires javafx.controls;
    requires javafx.fxml;

    opens fulbert.hasanatou.crosswords to javafx.fxml;
    exports fulbert.hasanatou.crosswords;
}
