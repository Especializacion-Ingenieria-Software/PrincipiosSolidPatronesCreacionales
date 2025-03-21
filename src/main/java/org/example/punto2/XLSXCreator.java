package org.example.punto2;


import java.util.ArrayList;

public class XLSXCreator  extends DocumentCreator {

    private DocumentDirector documentDirector;


    public XLSXCreator(DocumentDirector documentDirector) {
        this.documentDirector = documentDirector;
    }



    @Override
    public Document createDocument(){
        System.out.println("Retornando nuevo documento XLSX");
        return new XLSX(new Title(), new Table(), new Style(),new ArrayList<>() ) ;
    }

    @Override
    public void exportPDF() {

    }


}
