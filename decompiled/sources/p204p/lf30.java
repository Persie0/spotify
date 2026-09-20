package p204p;

import android.text.Editable;
import android.text.Html;
import org.xml.sax.XMLReader;

/* JADX INFO: loaded from: classes.dex */
public final class lf30 implements Html.TagHandler {
    @Override // android.text.Html.TagHandler
    public final void handleTag(boolean z, String str, Editable editable, XMLReader xMLReader) {
        if (xMLReader == null || editable == null || !z || !wj50.m88271j(str, "ContentHandlerReplacementTag")) {
            return;
        }
        xMLReader.setContentHandler(new x15(xMLReader.getContentHandler(), editable));
    }
}
