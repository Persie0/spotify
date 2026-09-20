package p204p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public abstract class qwk0 {
    /* JADX INFO: renamed from: a */
    public static final ArrayList m74078a(List list) {
        ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new jwk0(m74079b((String) it.next())));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static final xaw m74079b(String str) {
        Object c6x0Var;
        try {
            c6x0Var = new gf41(str);
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        if (c6x0Var instanceof c6x0) {
            c6x0Var = null;
        }
        gf41 gf41Var = (gf41) c6x0Var;
        if (gf41Var == null) {
            gf41Var = new gf41("spotify:episode:invalid");
        }
        taw tawVar = new taw(1970, 1, 1, 0, 0);
        wzk wzkVar = new wzk();
        lau lauVar = lau.f131415a;
        return new xaw(gf41Var, "", "", null, wzkVar, lauVar, lauVar, lauVar, false, 1, false, false, "", 0L, tawVar, lauVar, "", "", "");
    }
}
