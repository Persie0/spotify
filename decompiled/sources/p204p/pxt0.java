package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class pxt0 {

    /* JADX INFO: renamed from: a */
    public final lua1 f183225a;

    /* JADX INFO: renamed from: b */
    public final c0u0 f183226b;

    /* JADX INFO: renamed from: c */
    public final b0u0 f183227c;

    public pxt0(lua1 lua1Var, c0u0 c0u0Var, b0u0 b0u0Var) {
        this.f183225a = lua1Var;
        this.f183226b = c0u0Var;
        this.f183227c = b0u0Var;
    }

    /* JADX INFO: renamed from: a */
    public final lua1 m71560a() {
        return this.f183225a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pxt0)) {
            return false;
        }
        pxt0 pxt0Var = (pxt0) obj;
        return wj50.m88271j(this.f183225a, pxt0Var.f183225a) && wj50.m88271j(this.f183226b, pxt0Var.f183226b) && wj50.m88271j(this.f183227c, pxt0Var.f183227c);
    }

    public final int hashCode() {
        int iHashCode = (this.f183226b.hashCode() + (this.f183225a.hashCode() * 31)) * 31;
        b0u0 b0u0Var = this.f183227c;
        return iHashCode + (b0u0Var == null ? 0 : b0u0Var.hashCode());
    }
}
