package org.jabref.logic.xmp;



import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

public class XmpUtilDeleteTest {
    private String path = new String("src/test/resources/pdfs/example.pdf");



    //Verifica se o arquivo recebido é do tipo PDF
    @Test
    void testIsPDF(){
        boolean result = XmpUtilDelete.isPdf(path);
        assertEquals(true, result);
    }

    @Test
    void testChangeMetadata() {
        XmpFuncMeta newMetadata = new XmpFuncMeta("Title", "Author", "Subject", "Today Time");
        String result = XmpUtilDelete.RemoveMetadata(1, newMetadata);
        assertEquals(null, result);
    }

}
