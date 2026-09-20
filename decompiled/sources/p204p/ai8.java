package p204p;

import java.util.ArrayList;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ai8 {

    /* JADX INFO: renamed from: a */
    public static final Map f15906a;

    static {
        ArrayList arrayList = new ArrayList();
        C2042k7 c2042k7 = new C2042k7(h2a1.f86942e, 0);
        while (c2042k7.hasNext()) {
            h2a1 h2a1Var = (h2a1) c2042k7.next();
            UUID uuidM46485a = h2a1Var.m46485a();
            pqm0 pqm0Var = uuidM46485a != null ? new pqm0(uuidM46485a, h2a1Var) : null;
            if (pqm0Var != null) {
                arrayList.add(pqm0Var);
            }
        }
        f15906a = kkc0.m56705r0(arrayList);
    }
}
