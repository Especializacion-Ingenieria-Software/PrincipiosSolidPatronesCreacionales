package org.example.Punto2;


import java.util.ArrayList;

public class DOCXCreator extends DocumentCreator {

    private DocumentDirector documentDirector;


    public DOCXCreator(DocumentDirector documentDirector) {
        this.documentDirector = documentDirector;
    }



    @Override
    public Document createDocument(){
        System.out.println("Retornando nuevo documento DOCX");
        return new DOCX(new Title(), new Table(), new Style(),new ArrayList<>() ) ;
    }

    @Override
    public void exportPDF() {

    }


}
