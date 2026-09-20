package p204p;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ve90 {

    /* JADX INFO: renamed from: a */
    public static final List f240652a = h6f.m46715L(a340.f11861b, a340.f11860a, a340.f11862c, a340.f11863d);

    /* JADX INFO: renamed from: a */
    public static final String m85298a(erc1 erc1Var) {
        String str;
        rfz rfzVar;
        Iterator it = f240652a.iterator();
        do {
            str = null;
            if (!it.hasNext()) {
                break;
            }
            z240 z240VarM60640a = erc1Var.f62079a.m60640a((a340) it.next());
            if (z240VarM60640a != null && (rfzVar = z240VarM60640a.f278475a) != null) {
                str = rfzVar.f198763a;
            }
        } while (str == null);
        return str;
    }
}
