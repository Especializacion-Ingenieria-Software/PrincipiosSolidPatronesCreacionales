package org.example.punto2;

import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter

public class DOCX implements Document {

    public Title title;
    public Table table;
    public Style style;
    public List<Column> column;

    public DOCX(){}

    public DOCX(Title title, Table table, Style style, List<Column> column) {
        this.title = title;
        this.table = table;
        this.style = style;
        this.column = column;
    }

    @Override
    public void createNewFile() {
        System.out.println("Creando Archivo DOCX ");
    }


}
