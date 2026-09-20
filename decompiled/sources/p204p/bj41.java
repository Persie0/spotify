package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class bj41 {

    /* JADX INFO: renamed from: a */
    public final boolean f27607a;

    /* JADX INFO: renamed from: b */
    public final boolean f27608b;

    /* JADX INFO: renamed from: c */
    public final d601 f27609c;

    public bj41(boolean z, boolean z2, d601 d601Var) {
        this.f27607a = z;
        this.f27608b = z2;
        this.f27609c = d601Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bj41)) {
            return false;
        }
        bj41 bj41Var = (bj41) obj;
        return this.f27607a == bj41Var.f27607a && this.f27608b == bj41Var.f27608b && wj50.m88271j(this.f27609c, bj41Var.f27609c);
    }

    public final int hashCode() {
        return this.f27609c.hashCode() + s571.m77245d(Boolean.hashCode(this.f27607a) * 31, 31, this.f27608b);
    }
}
