package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class nlf0 implements rmf0 {

    /* JADX INFO: renamed from: a */
    public final b791 f155088a;

    /* JADX INFO: renamed from: b */
    public final d850 f155089b;

    public nlf0(b791 b791Var, d850 d850Var) {
        this.f155088a = b791Var;
        this.f155089b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nlf0)) {
            return false;
        }
        nlf0 nlf0Var = (nlf0) obj;
        return wj50.m88271j(this.f155088a, nlf0Var.f155088a) && wj50.m88271j(this.f155089b, nlf0Var.f155089b);
    }

    public final int hashCode() {
        int iHashCode = this.f155088a.hashCode() * 31;
        d850 d850Var = this.f155089b;
        return iHashCode + (d850Var == null ? 0 : d850Var.hashCode());
    }

    public final String toString() {
        return s571.m77251j("AddToPlaylist(transition=", this.f155088a.m28367g(), ")");
    }
}
