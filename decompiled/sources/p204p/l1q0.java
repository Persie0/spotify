package p204p;

import android.text.Editable;
import android.text.Html;
import java.util.ArrayList;
import java.util.Locale;
import org.xml.sax.XMLReader;

/* JADX INFO: loaded from: classes9.dex */
public final class l1q0 implements Html.TagHandler {

    /* JADX INFO: renamed from: a */
    public final ArrayList f128770a = new ArrayList();

    /* JADX INFO: renamed from: a */
    public final void m57880a(boolean z, boolean z2, Editable editable) {
        ArrayList arrayList = this.f128770a;
        if (z) {
            arrayList.add(new k1q0(z2));
            return;
        }
        j6f.m52571c0(arrayList);
        if (arrayList.isEmpty()) {
            editable.append('\n');
        }
    }

    @Override // android.text.Html.TagHandler
    public final void handleTag(boolean z, String str, Editable editable, XMLReader xMLReader) {
        if (editable == null || str == null) {
            return;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        int iHashCode = lowerCase.hashCode();
        if (iHashCode != 1611508057) {
            if (iHashCode == 1611508153) {
                if (lowerCase.equals("custom-ol")) {
                    m57880a(z, true, editable);
                    return;
                }
                return;
            } else {
                if (iHashCode == 1611508339 && lowerCase.equals("custom-ul")) {
                    m57880a(z, false, editable);
                    return;
                }
                return;
            }
        }
        if (lowerCase.equals("custom-li") && z) {
            ArrayList arrayList = this.f128770a;
            if (arrayList.isEmpty()) {
                return;
            }
            if (editable.length() > 0 && wl51.m88461K0(editable) != '\n') {
                editable.append('\n');
            }
            int size = arrayList.size() - 1;
            for (int i = 0; i < size; i++) {
                editable.append('\t');
            }
            k1q0 k1q0Var = (k1q0) g6f.m43687A0(arrayList);
            if (!k1q0Var.f118413a) {
                editable.append("• ");
                return;
            }
            int i2 = k1q0Var.f118414b + 1;
            k1q0Var.f118414b = i2;
            editable.append((CharSequence) (i2 + ". "));
        }
    }
}
