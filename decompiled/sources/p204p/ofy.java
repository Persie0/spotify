package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ofy implements qfy {

    /* JADX INFO: renamed from: a */
    public final float f164944a;

    /* JADX INFO: renamed from: b */
    public final aq70 f164945b;

    /* JADX INFO: renamed from: c */
    public final j4m0 f164946c;

    public ofy(float f, aq70 aq70Var, j4m0 j4m0Var) {
        this.f164944a = f;
        this.f164945b = aq70Var;
        this.f164946c = j4m0Var;
    }

    @Override // p204p.qfy
    /* JADX INFO: renamed from: a */
    public final f4m0 mo64364a() {
        return this.f164946c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ofy)) {
            return false;
        }
        ofy ofyVar = (ofy) obj;
        return ybs.m93301b(this.f164944a, ofyVar.f164944a) && this.f164945b == ofyVar.f164945b && this.f164946c.equals(ofyVar.f164946c);
    }

    @Override // p204p.qfy
    /* JADX INFO: renamed from: h */
    public final aq70 mo64365h() {
        return this.f164945b;
    }

    public final int hashCode() {
        return this.f164946c.hashCode() + ((this.f164945b.hashCode() + (Float.hashCode(this.f164944a) * 31)) * 31);
    }

    @Override // p204p.qfy
    /* JADX INFO: renamed from: i */
    public final float mo64366i() {
        return this.f164944a;
    }
}
