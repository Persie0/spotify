package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class yeb0 implements bgb0 {

    /* JADX INFO: renamed from: a */
    public final int f271957a;

    /* JADX INFO: renamed from: b */
    public final d850 f271958b;

    public yeb0(int i, d850 d850Var) {
        this.f271957a = i;
        this.f271958b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yeb0)) {
            return false;
        }
        yeb0 yeb0Var = (yeb0) obj;
        return this.f271957a == yeb0Var.f271957a && wj50.m88271j(this.f271958b, yeb0Var.f271958b);
    }

    public final int hashCode() {
        return this.f271958b.hashCode() + (Integer.hashCode(this.f271957a) * 31);
    }
}
