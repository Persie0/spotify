package p204p;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes8.dex */
public final class zh50 extends edg1 {

    /* JADX INFO: renamed from: c */
    public final hgx0 f282810c;

    /* JADX INFO: renamed from: d */
    public final WeakReference f282811d;

    /* JADX INFO: renamed from: e */
    public final q381 f282812e;

    public zh50(hgx0 hgx0Var, WeakReference weakReference, q381 q381Var) {
        this.f282810c = hgx0Var;
        this.f282811d = weakReference;
        this.f282812e = q381Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zh50)) {
            return false;
        }
        zh50 zh50Var = (zh50) obj;
        return this.f282810c.equals(zh50Var.f282810c) && this.f282811d.equals(zh50Var.f282811d) && wj50.m88271j(this.f282812e, zh50Var.f282812e);
    }

    @Override // p204p.edg1
    /* JADX INFO: renamed from: f */
    public final WeakReference mo26059f() {
        return this.f282811d;
    }

    @Override // p204p.edg1
    /* JADX INFO: renamed from: g */
    public final q381 mo26060g() {
        return this.f282812e;
    }

    @Override // p204p.edg1
    /* JADX INFO: renamed from: h */
    public final ker0 mo26061h() {
        return ker0.DEFAULT;
    }

    public final int hashCode() {
        int iHashCode = (this.f282811d.hashCode() + (this.f282810c.hashCode() * 31)) * 31;
        q381 q381Var = this.f282812e;
        return ker0.DEFAULT.hashCode() + ((iHashCode + (q381Var == null ? 0 : q381Var.hashCode())) * 31);
    }
}
