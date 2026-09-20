package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class n0x0 {

    /* JADX INFO: renamed from: a */
    public final int f149196a;

    /* JADX INFO: renamed from: b */
    public final boolean f149197b;

    public n0x0(int i, boolean z) {
        this.f149196a = i;
        this.f149197b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0x0)) {
            return false;
        }
        n0x0 n0x0Var = (n0x0) obj;
        return this.f149196a == n0x0Var.f149196a && this.f149197b == n0x0Var.f149197b;
    }

    public final int hashCode() {
        int i = this.f149196a;
        return Boolean.hashCode(this.f149197b) + ((i == 0 ? 0 : edb.m38547C(i)) * 31);
    }
}
