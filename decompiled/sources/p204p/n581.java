package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class n581 {

    /* JADX INFO: renamed from: a */
    public final l581 f150503a;

    /* JADX INFO: renamed from: b */
    public final boolean f150504b;

    public n581(l581 l581Var, boolean z) {
        this.f150503a = l581Var;
        this.f150504b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n581)) {
            return false;
        }
        n581 n581Var = (n581) obj;
        return wj50.m88271j(this.f150503a, n581Var.f150503a) && this.f150504b == n581Var.f150504b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f150504b) + (this.f150503a.hashCode() * 31);
    }
}
