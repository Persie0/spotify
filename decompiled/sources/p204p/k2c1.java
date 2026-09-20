package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class k2c1 {

    /* JADX INFO: renamed from: a */
    public final boolean f118593a;

    /* JADX INFO: renamed from: b */
    public final v1p0 f118594b;

    public k2c1(boolean z, v1p0 v1p0Var) {
        this.f118593a = z;
        this.f118594b = v1p0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k2c1)) {
            return false;
        }
        k2c1 k2c1Var = (k2c1) obj;
        return this.f118593a == k2c1Var.f118593a && wj50.m88271j(this.f118594b, k2c1Var.f118594b);
    }

    public final int hashCode() {
        return this.f118594b.hashCode() + (Boolean.hashCode(this.f118593a) * 31);
    }
}
