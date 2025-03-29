package org.example.punto2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
    String selectedFormat = "DOCX";  // también puedes probar con "XLSX" o "XML"

    DocumentBuilder builder;
    DocumentCreator creator;

    switch (selectedFormat) {
        case "DOCX":
            builder = new DOCXBuildeer();
            break;

        case "XLSX":
            builder = new XLSXBuilder();
            break;

        case "XML":
            builder = new XMLBuilder();
            System.out.println();
            break;

        default:
            throw new IllegalArgumentException("Formato no soportado: " + selectedFormat);
    }

    DocumentDirector director = new DocumentDirector(builder);

    //Ejemplo simple de construcción de un documento de cualquier tipo de formato

    Title title = new Title("Arial", 14, "Titulo del documento");
    Style style = new Style("Azul", "Arial2" );
    Table table = new Table(10, 10);
    List<Column> columns = new ArrayList<>();
    columns.add(new Column("Nombre"));
    columns.add(new Column("Apellido"));
    columns.add(new Column("Edad"));

    // Usando builder

    builder.setTitle(title);
    builder.setStyle(style);
    builder.setTable(table);
    builder.setColumn(columns);

    //Resultado
        System.out.println("Ver la instancia del tipo de documento" + builder.getClass().getSimpleName());

        Document document;

        if (builder instanceof DOCXBuildeer) {
            ((DOCXBuildeer) builder).reset();
            document = ((DOCXBuildeer) builder).getResult();
            creator = new DOCXCreator(director);

        } else if (builder instanceof XLSXBuilder) {
            ((XLSXBuilder) builder).reset();
            document = ((XLSXBuilder) builder).getResult();
            creator = new XLSXCreator(director);

        } else if (builder instanceof XMLBuilder) {
            ((XMLBuilder) builder).reset();
            document = ((XMLBuilder) builder).getResult();
            creator = new XMLCreator(director);

        } else {
            throw new IllegalStateException("Builder desconocido");
        }

        // Creamos y exportamos documento
        document.createNewFile();
        creator.exportPDF();

    }
}
