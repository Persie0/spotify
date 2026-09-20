package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class bw90 implements ow90 {

    /* JADX INFO: renamed from: a */
    public final String f31587a;

    /* JADX INFO: renamed from: b */
    public final d850 f31588b;

    public bw90(String str, d850 d850Var) {
        this.f31587a = str;
        this.f31588b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bw90)) {
            return false;
        }
        bw90 bw90Var = (bw90) obj;
        return wj50.m88271j(this.f31587a, bw90Var.f31587a) && wj50.m88271j(this.f31588b, bw90Var.f31588b);
    }

    public final int hashCode() {
        int iHashCode = this.f31587a.hashCode() * 31;
        d850 d850Var = this.f31588b;
        return iHashCode + (d850Var == null ? 0 : d850Var.hashCode());
    }
}
