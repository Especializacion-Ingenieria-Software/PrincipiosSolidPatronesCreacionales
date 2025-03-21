package org.example.Punto2;

import java.util.List;

public class XMLBuilder implements DocumentBuilder{
    private XML result;
    private Title title;
    private Table table;
    private Style style;
    private List<Column> column;


    public void reset (){
        this.result = new XML(title, table, style, column);
    }


    @Override
    public void setTitle(Title title) {
        this.title = title;
    }

    @Override
    public void setTable(Table table) {
        this.table = table;

    }

    @Override
    public void setStyle(Style style) {
        this.style = style;
    }

    @Override
    public void setColumn(List<Column> column) {
        this.column = column;
    }

    public XML getResult() {
        return result;
    }
}
