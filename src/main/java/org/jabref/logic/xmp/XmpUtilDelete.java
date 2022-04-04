package org.jabref.logic.xmp;

public class XmpUtilDelete {

    public static void PdfXmpDelete(String path, int deleteMode, XmpFuncMeta newPDF){
        if(isPdf(path) == true){
            RemoveMetadata(deleteMode, newPDF);
        }
    }

    public static String RemoveMetadata(int opcode, XmpFuncMeta pdfMeta){
        if(opcode == 1){
            pdfMeta.setAuthor(null);
            return pdfMeta.getAuthor();
        }else if(opcode == 2){
            pdfMeta.setTitle(null);
            return pdfMeta.getTitle();
        }else if(opcode == 3){
            pdfMeta.setSubject(null);
            return pdfMeta.getSubject();
        }else if(opcode == 4){
            pdfMeta.setDate(null);
            return pdfMeta.getDate();
        }
        else return "invalid input";
    }

    public static boolean isPdf(String path) {
        if(path.endsWith(".pdf")){
           return true;
       }
       else return false;
    }


}
