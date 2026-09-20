package p204p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class rt31 {

    /* JADX INFO: renamed from: b */
    public static final rt31 f202487b = new rt31(nau.f152117a);

    /* JADX INFO: renamed from: a */
    public final Object f202488a;

    public rt31(Map map) {
        this.f202488a = map;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: a */
    public final Set m76364a() {
        ArrayList arrayListM49805U = i6f.m49805U(this.f202488a.values());
        ArrayList arrayList = new ArrayList(i6f.m49804T(arrayListM49805U, 10));
        Iterator it = arrayListM49805U.iterator();
        while (it.hasNext()) {
            arrayList.add(((nvo0) it.next()).f158934a);
        }
        return g6f.m43736n1(arrayList);
    }
}
