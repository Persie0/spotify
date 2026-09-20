package p204p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes2.dex */
public final class vnc extends ffz0 {

    /* JADX INFO: renamed from: e */
    public final bqa f243037e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AtomicReferenceArray f243038f;

    public vnc(long j, vnc vncVar, bqa bqaVar, int i) {
        super(j, vncVar, i);
        this.f243037e = bqaVar;
        this.f243038f = new AtomicReferenceArray(dqa.f51912b * 2);
    }

    @Override // p204p.ffz0
    /* JADX INFO: renamed from: g */
    public final int mo41558g() {
        return dqa.f51912b;
    }

    @Override // p204p.ffz0
    /* JADX INFO: renamed from: h */
    public final void mo41559h(int i, juk jukVar) {
        bqa bqaVar;
        int i2 = dqa.f51912b;
        boolean z = i >= i2;
        if (z) {
            i -= i2;
        }
        this.f243038f.get(i * 2);
        while (true) {
            Object objM86034l = m86034l(i);
            boolean z2 = objM86034l instanceof d7d1;
            bqaVar = this.f243037e;
            if (z2 || (objM86034l instanceof e7d1)) {
                if (m86033k(i, objM86034l, z ? dqa.f51920j : dqa.f51921k)) {
                    m86036n(i, null);
                    m86035m(i, !z);
                    if (z) {
                        wj50.m88279p(bqaVar);
                        return;
                    }
                    return;
                }
            } else {
                if (objM86034l == dqa.f51920j || objM86034l == dqa.f51921k) {
                    break;
                }
                if (objM86034l != dqa.f51917g && objM86034l != dqa.f51916f) {
                    if (objM86034l != dqa.f51919i && objM86034l != dqa.f51914d && objM86034l != dqa.f51922l) {
                        throw new IllegalStateException(s571.m77249h(objM86034l, "unexpected state: "));
                    }
                    return;
                }
            }
        }
        m86036n(i, null);
        if (z) {
            wj50.m88279p(bqaVar);
        }
    }

    /* JADX INFO: renamed from: k */
    public final boolean m86033k(int i, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i2 = (i * 2) + 1;
        do {
            atomicReferenceArray = this.f243038f;
            if (atomicReferenceArray.compareAndSet(i2, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i2) == obj);
        return false;
    }

    /* JADX INFO: renamed from: l */
    public final Object m86034l(int i) {
        return this.f243038f.get((i * 2) + 1);
    }

    /* JADX INFO: renamed from: m */
    public final void m86035m(int i, boolean z) {
        if (z) {
            bqa bqaVar = this.f243037e;
            wj50.m88279p(bqaVar);
            bqaVar.m30227T((this.f69124c * ((long) dqa.f51912b)) + ((long) i));
        }
        m41560i();
    }

    /* JADX INFO: renamed from: n */
    public final void m86036n(int i, Object obj) {
        this.f243038f.set(i * 2, obj);
    }

    /* JADX INFO: renamed from: o */
    public final void m86037o(int i, Object obj) {
        this.f243038f.set((i * 2) + 1, obj);
    }
}
