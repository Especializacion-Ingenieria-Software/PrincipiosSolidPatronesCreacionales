package org.example.Punto2;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class DocumentDirector  {

    public DocumentBuilder builder;


    public DocumentDirector(DocumentBuilder builder) {
        this.builder = builder;
    };

    public void buildXLSX(){
        builder.setTitle(new Title("ArialXLSX", 10,"TituloXLSX" ));
        builder.setStyle(new Style("RojoXLSX", "fontXLSX"));
        builder.setTable(new Table(20, 20));
        List<Column> columns = new ArrayList<Column>();
        Column column = new Column("Column XLSX");
        columns.add(column);
        builder.setColumn(columns);
    };


    public void buildXML(){
        builder.setTitle(new Title("ArialXML", 10,"TituloXML" ));
        builder.setStyle(new Style("RojoXML", "fontXMML"));
        builder.setTable(new Table(20, 20));
        List<Column> columns = new ArrayList<Column>();
        Column column = new Column("Column XML");
        columns.add(column);
        builder.setColumn(columns);
    };


    public void buildDOCX(){
        builder.setTitle(new Title("ArialDOCX", 10,"TituloDOCX" ));
        builder.setStyle(new Style("RojoDOCX", "fontDOCX"));
        builder.setTable(new Table(20, 20));
        List<Column> columns = new ArrayList<Column>();
        Column column = new Column("Column DOCX");
        columns.add(column);
        builder.setColumn(columns);
    };


}
