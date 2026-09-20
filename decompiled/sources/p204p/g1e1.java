package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class g1e1 {

    /* JADX INFO: renamed from: a */
    public final String f75605a;

    /* JADX INFO: renamed from: b */
    public final h0e1 f75606b;

    public g1e1(String str, h0e1 h0e1Var) {
        this.f75605a = str;
        this.f75606b = h0e1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1e1)) {
            return false;
        }
        g1e1 g1e1Var = (g1e1) obj;
        return wj50.m88271j(this.f75605a, g1e1Var.f75605a) && this.f75606b == g1e1Var.f75606b;
    }

    public final int hashCode() {
        return this.f75606b.hashCode() + (this.f75605a.hashCode() * 31);
    }

    public final String toString() {
        return "IdAndState(id=" + this.f75605a + ", state=" + this.f75606b + ')';
    }
}
