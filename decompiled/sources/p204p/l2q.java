package p204p;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class l2q implements m8d0 {

    /* JADX INFO: renamed from: a */
    public final i4t0 f129065a;

    /* JADX INFO: renamed from: b */
    public final Set f129066b;

    public l2q(i4t0 i4t0Var, Set set) {
        this.f129065a = i4t0Var;
        this.f129066b = set;
    }

    @Override // p204p.m8d0
    /* JADX INFO: renamed from: a */
    public final boolean mo48695a(roa roaVar) {
        C2245p6 c2245p6 = new C2245p6(roaVar, 12);
        Set set = this.f129066b;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (((Boolean) c2245p6.invoke(it.next())).booleanValue()) {
                    return false;
                }
            }
        }
        return roaVar.m76042l();
    }

    @Override // p204p.m8d0
    /* JADX INFO: renamed from: b */
    public final l8d0 mo48696b() {
        return (l8d0) this.f129065a.get();
    }
}
