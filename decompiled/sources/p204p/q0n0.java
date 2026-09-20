package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class q0n0 {

    /* JADX INFO: renamed from: a */
    public final String f184037a;

    /* JADX INFO: renamed from: b */
    public final k1n0 f184038b;

    public q0n0(String str, k1n0 k1n0Var) {
        this.f184037a = str;
        this.f184038b = k1n0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0n0)) {
            return false;
        }
        q0n0 q0n0Var = (q0n0) obj;
        return wj50.m88271j(this.f184037a, q0n0Var.f184037a) && this.f184038b == q0n0Var.f184038b;
    }

    public final int hashCode() {
        return this.f184038b.hashCode() + (this.f184037a.hashCode() * 31);
    }
}
