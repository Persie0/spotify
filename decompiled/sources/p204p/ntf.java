package p204p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ntf {

    /* JADX INFO: renamed from: a */
    public static final LinkedHashSet f158059a;

    static {
        Set set = her0.f90494e;
        ArrayList arrayList = new ArrayList(i6f.m49804T(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(rm41.f200445l.m92785a(((her0) it.next()).f90500a));
        }
        ArrayList arrayListM43701O0 = g6f.m43701O0(qm41.f190109j.m95308i(), g6f.m43701O0(qm41.f190107h.m95308i(), g6f.m43701O0(qm41.f190103f.m95308i(), arrayList)));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it2 = arrayListM43701O0.iterator();
        while (it2.hasNext()) {
            linkedHashSet.add(uc5.m82743x((y400) it2.next()));
        }
        f158059a = linkedHashSet;
    }
}
