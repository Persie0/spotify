package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class nfy implements qfy {

    /* JADX INFO: renamed from: a */
    public final float f153436a;

    /* JADX INFO: renamed from: b */
    public final aq70 f153437b;

    /* JADX INFO: renamed from: c */
    public final j4m0 f153438c;

    public nfy(float f, aq70 aq70Var, j4m0 j4m0Var) {
        this.f153436a = f;
        this.f153437b = aq70Var;
        this.f153438c = j4m0Var;
    }

    @Override // p204p.qfy
    /* JADX INFO: renamed from: a */
    public final f4m0 mo64364a() {
        return this.f153438c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nfy)) {
            return false;
        }
        nfy nfyVar = (nfy) obj;
        return ybs.m93301b(this.f153436a, nfyVar.f153436a) && this.f153437b == nfyVar.f153437b && this.f153438c.equals(nfyVar.f153438c);
    }

    @Override // p204p.qfy
    /* JADX INFO: renamed from: h */
    public final aq70 mo64365h() {
        return this.f153437b;
    }

    public final int hashCode() {
        return this.f153438c.hashCode() + ((this.f153437b.hashCode() + (Float.hashCode(this.f153436a) * 31)) * 31);
    }

    @Override // p204p.qfy
    /* JADX INFO: renamed from: i */
    public final float mo64366i() {
        return this.f153436a;
    }
}
