package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class q7u0 {

    /* JADX INFO: renamed from: a */
    public final String f186170a;

    /* JADX INFO: renamed from: b */
    public final boolean f186171b;

    public q7u0(String str, boolean z) {
        this.f186170a = str;
        this.f186171b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q7u0)) {
            return false;
        }
        q7u0 q7u0Var = (q7u0) obj;
        return wj50.m88271j(this.f186170a, q7u0Var.f186170a) && this.f186171b == q7u0Var.f186171b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f186171b) + (this.f186170a.hashCode() * 31);
    }
}
