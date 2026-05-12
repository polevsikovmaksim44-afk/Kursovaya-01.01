module ru.zelmex.saleapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires jakarta.persistence;
    requires org.hibernate.orm.core;
    requires java.naming;
    requires java.desktop;
    requires org.hibernate.validator;
    requires org.postgresql.jdbc;
    requires jakarta.validation;
    opens ru.zelmex.saleapp to javafx.fxml;
    opens ru.zelmex.saleapp.model to org.hibernate.orm.core, javafx.base;
    exports ru.zelmex.saleapp;
    exports ru.zelmex.saleapp.controller;
    opens ru.zelmex.saleapp.controller to javafx.fxml;
    opens ru.zelmex.saleapp.util to org.hibernate.orm.core;
}