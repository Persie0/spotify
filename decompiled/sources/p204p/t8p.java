package p204p;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class t8p {

    /* JADX INFO: renamed from: a */
    public final er70 f218118a;

    public t8p(er70 er70Var) {
        this.f218118a = er70Var;
    }

    /* JADX INFO: renamed from: a */
    public final v78 m80264a(h5r h5rVar) {
        Iterable iterable = (Iterable) this.f218118a.get();
        ArrayList arrayList = new ArrayList(i6f.m49804T(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((h5k) it.next()).mo46690a(h5rVar));
        }
        return new v78((fiz[]) g6f.m43728j1(arrayList).toArray(new fiz[0]), 4);
    }
}
