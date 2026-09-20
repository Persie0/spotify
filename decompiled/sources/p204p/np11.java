package p204p;

import android.os.Bundle;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public abstract class np11 {

    /* JADX INFO: renamed from: a */
    public static final Set f156849a = Collections.singleton(new uoc1(xoc1.f264045a6.f243453a));

    /* JADX INFO: renamed from: a */
    public static final boolean m65280a(String str) {
        Set set = f156849a;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (((uoc1) it.next()).m83613a(wl51.m88485i1(str, '?'))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static final void m65281b(Bundle bundle, o611 o611Var) {
        String string;
        if (bundle == null || (string = bundle.getString("bottom_sheet_uri")) == null) {
            return;
        }
        if (!m65280a(string)) {
            string = null;
        }
        if (string != null) {
            o611Var.invoke(string);
        }
    }
}
