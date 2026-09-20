package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class xy21 extends bz21 {

    /* JADX INFO: renamed from: a */
    public final int f267186a;

    /* JADX INFO: renamed from: b */
    public final d850 f267187b;

    public xy21(int i, d850 d850Var) {
        this.f267186a = i;
        this.f267187b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xy21)) {
            return false;
        }
        xy21 xy21Var = (xy21) obj;
        return this.f267186a == xy21Var.f267186a && wj50.m88271j(this.f267187b, xy21Var.f267187b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f267186a) * 31;
        d850 d850Var = this.f267187b;
        return iHashCode + (d850Var == null ? 0 : d850Var.hashCode());
    }
}
