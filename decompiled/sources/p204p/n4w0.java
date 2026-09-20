package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class n4w0 {

    /* JADX INFO: renamed from: a */
    public final ebf0 f150430a;

    /* JADX INFO: renamed from: b */
    public final boolean f150431b;

    public n4w0(ebf0 ebf0Var, boolean z) {
        this.f150430a = ebf0Var;
        this.f150431b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n4w0)) {
            return false;
        }
        n4w0 n4w0Var = (n4w0) obj;
        return wj50.m88271j(this.f150430a, n4w0Var.f150430a) && this.f150431b == n4w0Var.f150431b;
    }

    public final int hashCode() {
        ebf0 ebf0Var = this.f150430a;
        return Boolean.hashCode(this.f150431b) + ((ebf0Var == null ? 0 : ebf0Var.f57921a.hashCode()) * 31);
    }
}
