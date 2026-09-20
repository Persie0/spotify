package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class pfy implements qfy {

    /* JADX INFO: renamed from: a */
    public final float f177156a;

    /* JADX INFO: renamed from: b */
    public final aq70 f177157b;

    /* JADX INFO: renamed from: c */
    public final j4m0 f177158c;

    public pfy(float f, aq70 aq70Var, j4m0 j4m0Var) {
        this.f177156a = f;
        this.f177157b = aq70Var;
        this.f177158c = j4m0Var;
    }

    @Override // p204p.qfy
    /* JADX INFO: renamed from: a */
    public final f4m0 mo64364a() {
        return this.f177158c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pfy)) {
            return false;
        }
        pfy pfyVar = (pfy) obj;
        return ybs.m93301b(this.f177156a, pfyVar.f177156a) && this.f177157b == pfyVar.f177157b && this.f177158c.equals(pfyVar.f177158c);
    }

    @Override // p204p.qfy
    /* JADX INFO: renamed from: h */
    public final aq70 mo64365h() {
        return this.f177157b;
    }

    public final int hashCode() {
        return this.f177158c.hashCode() + ((this.f177157b.hashCode() + (Float.hashCode(this.f177156a) * 31)) * 31);
    }

    @Override // p204p.qfy
    /* JADX INFO: renamed from: i */
    public final float mo64366i() {
        return this.f177156a;
    }
}
