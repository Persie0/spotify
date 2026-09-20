package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class xfy0 {

    /* JADX INFO: renamed from: a */
    public final ney0 f261121a;

    /* JADX INFO: renamed from: b */
    public final Boolean f261122b;

    public /* synthetic */ xfy0(int i, Boolean bool) {
        this((ney0) null, (i & 2) != 0 ? null : bool);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xfy0)) {
            return false;
        }
        xfy0 xfy0Var = (xfy0) obj;
        return wj50.m88271j(this.f261121a, xfy0Var.f261121a) && wj50.m88271j(this.f261122b, xfy0Var.f261122b);
    }

    public final int hashCode() {
        ney0 ney0Var = this.f261121a;
        int iHashCode = (ney0Var == null ? 0 : ney0Var.hashCode()) * 31;
        Boolean bool = this.f261122b;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public xfy0(ney0 ney0Var, Boolean bool) {
        this.f261121a = ney0Var;
        this.f261122b = bool;
    }
}
