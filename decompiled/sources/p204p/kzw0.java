package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class kzw0 {

    /* JADX INFO: renamed from: a */
    public final long f128229a;

    /* JADX INFO: renamed from: b */
    public final g31 f128230b;

    public kzw0(long j, g31 g31Var) {
        this.f128229a = j;
        this.f128230b = g31Var;
    }

    /* JADX INFO: renamed from: a */
    public final g31 m57765a() {
        return this.f128230b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kzw0)) {
            return false;
        }
        kzw0 kzw0Var = (kzw0) obj;
        return b8j.m28424c(this.f128229a, kzw0Var.f128229a) && wj50.m88271j(this.f128230b, kzw0Var.f128230b);
    }

    public final int hashCode() {
        return this.f128230b.hashCode() + (Long.hashCode(this.f128229a) * 31);
    }
}
