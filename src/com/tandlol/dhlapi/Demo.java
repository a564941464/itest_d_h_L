package com.tandlol.dhlapi;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.dhl.xmlpi.shipVal.models.LabelImage;
import com.dhl.xmlpi.shipVal.models.OutputFormat;
import com.dhl.xmlpi.shipVal.models.ShipmentResponse;

public class Demo {

	public static void main(String[] args) throws JAXBException, IOException {

		String xmlFilePath = "TransformXMLtoPDF/ResponseXMLS/ShipmentResponse_2017_01_13_02_14_55_627.xml";
		JAXBContext jc;
		Unmarshaller u;
		ShipmentResponse shipmentResponse;
		jc = JAXBContext.newInstance("com.dhl.xmlpi.shipVal.models");
		u = jc.createUnmarshaller();
		u.setSchema(null);
		Object obj = u.unmarshal(new File(xmlFilePath));
		shipmentResponse = (ShipmentResponse) obj;

		if (shipmentResponse.getLabelImage() != null && shipmentResponse.getLabelImage().size() > 0) {
			LabelImage labelImage = shipmentResponse.getLabelImage().get(0);
			OutputFormat outputFormat = labelImage.getOutputFormat();
			byte[] outputImage = labelImage.getOutputImage();

			if (outputImage != null && outputFormat != null) {
				BufferedOutputStream bos = null;
				FileOutputStream fos = new FileOutputStream(new File("TransformXMLtoPDF/PDFReports/test.pdf"));
				bos = new BufferedOutputStream(fos);
				// To write byte array to file use, public void write(byte[] b)
				// method of BufferedOutputStream class.
				bos.write(outputImage);
				bos.flush();
				fos.close();
			}
		}
	}

}
