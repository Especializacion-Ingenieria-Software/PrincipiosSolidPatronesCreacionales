package org.example.Punto2;

import java.util.List;


public interface DocumentBuilder {
    public void setTitle(Title title);
    public void setTable(Table table);
    public void setStyle(Style style);
    public void setColumn(List<Column> column);
}
