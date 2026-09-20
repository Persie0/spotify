package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class ewk0 {
    /* JADX INFO: renamed from: a */
    public static String m40145a() {
        Set set = dd41.f47702f;
        String strM35694A = r46.m74724S("offline-playable", "all").m35694A();
        return strM35694A == null ? "" : strM35694A;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m40146b(String str) {
        Set set = dd41.f47702f;
        if (r46.m74709B(str, gn80.CACHED_FILES, gn80.OFFLINE_BACKUP)) {
            return true;
        }
        he41 he41VarM30579c = bup0.f31192a.m30579c(str);
        xtp0 xtp0Var = he41VarM30579c instanceof xtp0 ? (xtp0) he41VarM30579c : null;
        return wj50.m88271j(xtp0Var != null ? xtp0Var.f265907a : null, "offline-playable") && xtp0Var.f265908b.equals("all");
    }
}
