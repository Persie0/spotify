package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ljh implements xmj {

    /* JADX INFO: renamed from: a */
    public final ry8 f134087a;

    /* JADX INFO: renamed from: b */
    public final Object f134088b;

    /* JADX INFO: renamed from: c */
    public final i040 f134089c;

    public ljh(ry8 ry8Var, Object obj, i040 i040Var) {
        this.f134087a = ry8Var;
        this.f134088b = obj;
        this.f134089c = i040Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ljh)) {
            return false;
        }
        ljh ljhVar = (ljh) obj;
        return wj50.m88271j(this.f134087a, ljhVar.f134087a) && wj50.m88271j(this.f134088b, ljhVar.f134088b) && this.f134089c.equals(ljhVar.f134089c);
    }

    @Override // p204p.xmj
    public final Object getId() {
        return this.f134088b;
    }

    public final int hashCode() {
        return this.f134089c.hashCode() + dq60.m36604d(this.f134087a.hashCode() * 31, 31, this.f134088b);
    }
}
