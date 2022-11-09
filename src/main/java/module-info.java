module ctest {
	requires javafx.base;
    requires javafx.fxml;
    requires javafx.controls;
	requires transitive javafx.graphics;
    opens com.ctest to javafx.graphics;
    exports com.ctest;
}