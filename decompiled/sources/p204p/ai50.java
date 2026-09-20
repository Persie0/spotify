package p204p;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes8.dex */
public final class ai50 extends edg1 {

    /* JADX INFO: renamed from: c */
    public final fd21 f15888c;

    /* JADX INFO: renamed from: d */
    public final WeakReference f15889d;

    /* JADX INFO: renamed from: e */
    public final q381 f15890e;

    /* JADX INFO: renamed from: f */
    public final ker0 f15891f;

    public ai50(fd21 fd21Var, WeakReference weakReference, q381 q381Var, ker0 ker0Var) {
        this.f15888c = fd21Var;
        this.f15889d = weakReference;
        this.f15890e = q381Var;
        this.f15891f = ker0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ai50)) {
            return false;
        }
        ai50 ai50Var = (ai50) obj;
        return wj50.m88271j(this.f15888c, ai50Var.f15888c) && wj50.m88271j(this.f15889d, ai50Var.f15889d) && wj50.m88271j(this.f15890e, ai50Var.f15890e) && this.f15891f == ai50Var.f15891f;
    }

    @Override // p204p.edg1
    /* JADX INFO: renamed from: f */
    public final WeakReference mo26059f() {
        return this.f15889d;
    }

    @Override // p204p.edg1
    /* JADX INFO: renamed from: g */
    public final q381 mo26060g() {
        return this.f15890e;
    }

    @Override // p204p.edg1
    /* JADX INFO: renamed from: h */
    public final ker0 mo26061h() {
        return this.f15891f;
    }

    public final int hashCode() {
        int iHashCode = (this.f15889d.hashCode() + (this.f15888c.hashCode() * 31)) * 31;
        q381 q381Var = this.f15890e;
        return this.f15891f.hashCode() + ((iHashCode + (q381Var == null ? 0 : q381Var.hashCode())) * 31);
    }
}
