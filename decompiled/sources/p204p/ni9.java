package p204p;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ni9 {

    /* JADX INFO: renamed from: a */
    public static final Object f154207a = kkc0.m56695h0(new pqm0(xc8.f260119a, 1), new pqm0(xc8.f260120b, 2), new pqm0(xc8.f260121c, 4), new pqm0(xc8.f260122d, 4), new pqm0(xc8.f260123e, 8), new pqm0(xc8.f260124f, 4));

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: a */
    public static int m64565a(Set set) {
        Iterator it = set.iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            Integer num = (Integer) f154207a.get(((oc8) it.next()).getUuid());
            if (num != null) {
                iIntValue |= num.intValue();
            }
        }
        return iIntValue;
    }
}
