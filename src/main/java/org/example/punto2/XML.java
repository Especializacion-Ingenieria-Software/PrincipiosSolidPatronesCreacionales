package org.example.punto2;

import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter

public class XML implements Document {

    public Title title;
    public Table table;
    public Style style;
    public List<Column> column;

    public XML(){}

    public XML(Title title, Table table, Style style, List<Column> column) {
        this.title = title;
        this.table = table;
        this.style = style;
        this.column = column;
    }

    @Override
    public void createNewFile() {

        System.out.println("Creando Archivo XML ");
    }


}
