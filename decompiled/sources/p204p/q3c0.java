package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class q3c0 {

    /* JADX INFO: renamed from: a */
    public final k1n0 f184838a;

    /* JADX INFO: renamed from: b */
    public final String f184839b;

    public q3c0(String str, k1n0 k1n0Var) {
        this.f184838a = k1n0Var;
        this.f184839b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q3c0)) {
            return false;
        }
        q3c0 q3c0Var = (q3c0) obj;
        return this.f184838a == q3c0Var.f184838a && wj50.m88271j(this.f184839b, q3c0Var.f184839b);
    }

    public final int hashCode() {
        return this.f184839b.hashCode() + (this.f184838a.hashCode() * 31);
    }
}
