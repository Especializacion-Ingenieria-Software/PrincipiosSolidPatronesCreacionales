package org.example.punto2;


import java.util.ArrayList;

public class XMLCreator extends DocumentCreator {

    private DocumentDirector documentDirector;


    public XMLCreator(DocumentDirector documentDirector) {
        this.documentDirector = documentDirector;
    }



    @Override
    public Document createDocument(){
        System.out.println("Retornando nuevo documento XML");
        return new XML(new Title(), new Table(), new Style(),new ArrayList<>() ) ;
    }

    @Override
    public void exportPDF() {

    }


}
