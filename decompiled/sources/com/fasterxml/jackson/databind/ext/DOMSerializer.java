package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import javax.xml.transform.TransformerFactory;
import org.w3c.dom.Node;

/* JADX INFO: loaded from: classes3.dex */
public class DOMSerializer extends StdSerializer<Node> {
    protected final TransformerFactory transformerFactory;

    public DOMSerializer() {
        super(Node.class);
        try {
            TransformerFactory transformerFactoryNewInstance = TransformerFactory.newInstance();
            this.transformerFactory = transformerFactoryNewInstance;
            transformerFactoryNewInstance.setFeature("http://javax.xml.XMLConstants/feature/secure-processing", true);
        } catch (Exception e) {
            throw new IllegalStateException("Could not instantiate `TransformerFactory`: " + e.getMessage(), e);
        }
    }
}
