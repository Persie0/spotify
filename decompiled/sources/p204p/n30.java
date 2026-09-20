package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class n30 {

    /* JADX INFO: renamed from: a */
    public final int f149887a;

    /* JADX INFO: renamed from: b */
    public final boolean f149888b;

    public n30(int i, boolean z) {
        this.f149887a = i;
        this.f149888b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n30)) {
            return false;
        }
        n30 n30Var = (n30) obj;
        return this.f149887a == n30Var.f149887a && this.f149888b == n30Var.f149888b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f149888b) + (edb.m38547C(this.f149887a) * 31);
    }
}
