package org.example.Punto2;

import java.util.List;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter

public class XLSX implements Document {

    public Title title;
    public Table table;
    public Style style;
    public List<Column> column;

    public XLSX(){}

    public XLSX(Title title, Table table, Style style, List<Column> column) {
        this.title = title;
        this.table = table;
        this.style = style;
        this.column = column;
    }

    @Override
    public void createNewFile() {
        System.out.println("Creando Archivo XLSX ");
    }


}
