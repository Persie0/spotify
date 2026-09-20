package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class ez21 extends yz21 {

    /* JADX INFO: renamed from: a */
    public final l031 f64242a;

    /* JADX INFO: renamed from: b */
    public final long f64243b;

    public ez21(l031 l031Var, long j) {
        this.f64242a = l031Var;
        this.f64243b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ez21)) {
            return false;
        }
        ez21 ez21Var = (ez21) obj;
        return wj50.m88271j(this.f64242a, ez21Var.f64242a) && this.f64243b == ez21Var.f64243b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f64243b) + (this.f64242a.hashCode() * 31);
    }
}
