package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class yy31 {

    /* JADX INFO: renamed from: a */
    public final Float f277393a;

    /* JADX INFO: renamed from: b */
    public final int f277394b;

    public yy31(Float f, int i) {
        this.f277393a = f;
        this.f277394b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yy31)) {
            return false;
        }
        yy31 yy31Var = (yy31) obj;
        return wj50.m88271j(this.f277393a, yy31Var.f277393a) && this.f277394b == yy31Var.f277394b;
    }

    public final int hashCode() {
        Float f = this.f277393a;
        int iHashCode = (f == null ? 0 : f.hashCode()) * 31;
        int i = this.f277394b;
        return iHashCode + (i != 0 ? edb.m38547C(i) : 0);
    }
}
