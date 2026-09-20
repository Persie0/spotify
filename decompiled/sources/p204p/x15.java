package p204p;

import android.text.Editable;
import java.util.ArrayList;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;

/* JADX INFO: loaded from: classes3.dex */
public final class x15 implements ContentHandler {

    /* JADX INFO: renamed from: a */
    public final ContentHandler f257063a;

    /* JADX INFO: renamed from: b */
    public final Editable f257064b;

    /* JADX INFO: renamed from: c */
    public int f257065c;

    /* JADX INFO: renamed from: d */
    public fra f257066d;

    public x15(ContentHandler contentHandler, Editable editable) {
        this.f257063a = contentHandler;
        this.f257064b = editable;
    }

    /* JADX INFO: renamed from: a */
    public final void m89621a() {
        fra fraVar = this.f257066d;
        if (fraVar != null) {
            int i = fraVar.f72390c;
            Editable editable = this.f257064b;
            editable.setSpan(fraVar, i, editable.length(), 33);
        }
        this.f257066d = null;
    }

    @Override // org.xml.sax.ContentHandler
    public final void characters(char[] cArr, int i, int i2) throws SAXException {
        this.f257063a.characters(cArr, i, i2);
    }

    @Override // org.xml.sax.ContentHandler
    public final void endDocument() throws SAXException {
        this.f257063a.endDocument();
    }

    @Override // org.xml.sax.ContentHandler
    public final void endElement(String str, String str2, String str3) throws SAXException {
        if (str2 != null) {
            int iHashCode = str2.hashCode();
            if (iHashCode != -1555043537) {
                if (iHashCode != 3453) {
                    if (iHashCode == 3735 && str2.equals("ul")) {
                        m89621a();
                        this.f257065c--;
                        return;
                    }
                } else if (str2.equals("li")) {
                    m89621a();
                    return;
                }
            } else if (str2.equals("annotation")) {
                Editable editable = this.f257064b;
                Object[] spans = editable.getSpans(0, editable.length(), d25.class);
                ArrayList arrayList = new ArrayList();
                for (Object obj : spans) {
                    if (editable.getSpanFlags((d25) obj) == 17) {
                        arrayList.add(obj);
                    }
                }
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    d25 d25Var = (d25) arrayList.get(i);
                    int spanStart = editable.getSpanStart(d25Var);
                    int length = editable.length();
                    editable.removeSpan(d25Var);
                    if (spanStart != length) {
                        editable.setSpan(d25Var, spanStart, length, 33);
                    }
                }
                return;
            }
        }
        this.f257063a.endElement(str, str2, str3);
    }

    @Override // org.xml.sax.ContentHandler
    public final void endPrefixMapping(String str) throws SAXException {
        this.f257063a.endPrefixMapping(str);
    }

    @Override // org.xml.sax.ContentHandler
    public final void ignorableWhitespace(char[] cArr, int i, int i2) throws SAXException {
        this.f257063a.ignorableWhitespace(cArr, i, i2);
    }

    @Override // org.xml.sax.ContentHandler
    public final void processingInstruction(String str, String str2) throws SAXException {
        this.f257063a.processingInstruction(str, str2);
    }

    @Override // org.xml.sax.ContentHandler
    public final void setDocumentLocator(Locator locator) {
        this.f257063a.setDocumentLocator(locator);
    }

    @Override // org.xml.sax.ContentHandler
    public final void skippedEntity(String str) throws SAXException {
        this.f257063a.skippedEntity(str);
    }

    @Override // org.xml.sax.ContentHandler
    public final void startDocument() throws SAXException {
        this.f257063a.startDocument();
    }

    @Override // org.xml.sax.ContentHandler
    public final void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
        if (str2 != null) {
            int iHashCode = str2.hashCode();
            Editable editable = this.f257064b;
            if (iHashCode != -1555043537) {
                if (iHashCode != 3453) {
                    if (iHashCode == 3735 && str2.equals("ul")) {
                        m89621a();
                        this.f257065c++;
                        return;
                    }
                } else if (str2.equals("li")) {
                    m89621a();
                    this.f257066d = new fra(cra.f41244e, this.f257065c, editable.length());
                    return;
                }
            } else if (str2.equals("annotation")) {
                if (attributes != null) {
                    int length = attributes.getLength();
                    for (int i = 0; i < length; i++) {
                        String localName = attributes.getLocalName(i);
                        if (localName == null) {
                            localName = "";
                        }
                        String value = attributes.getValue(i);
                        String str4 = value != null ? value : "";
                        if (localName.length() > 0 && str4.length() > 0) {
                            int length2 = editable.length();
                            editable.setSpan(new d25(localName, str4), length2, length2, 17);
                        }
                    }
                    return;
                }
                return;
            }
        }
        this.f257063a.startElement(str, str2, str3, attributes);
    }

    @Override // org.xml.sax.ContentHandler
    public final void startPrefixMapping(String str, String str2) throws SAXException {
        this.f257063a.startPrefixMapping(str, str2);
    }
}
