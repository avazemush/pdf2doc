import java.io.IOException;

/**
 * 
 */

/**
 * @author jwS
 *
 */
public class PdfToDoc {
	 public static void main(String[] args) {
		PDFBox pdfBox = new PDFBox();
		try {
			pdfBox.pdfToDoc("C:\\Users\\cr\\Desktop\\20161028中关村创客小镇官方简介(2).pdf");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
