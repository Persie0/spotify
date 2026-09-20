package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class sl9 {

    /* JADX INFO: renamed from: a */
    public final int f210322a;

    /* JADX INFO: renamed from: b */
    public final cc81 f210323b;

    public sl9(int i, cc81 cc81Var) {
        this.f210322a = i;
        this.f210323b = cc81Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sl9)) {
            return false;
        }
        sl9 sl9Var = (sl9) obj;
        return this.f210322a == sl9Var.f210322a && wj50.m88271j(this.f210323b, sl9Var.f210323b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f210322a) * 31;
        cc81 cc81Var = this.f210323b;
        return iHashCode + (cc81Var == null ? 0 : cc81Var.hashCode());
    }
}
