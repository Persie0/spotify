package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class j4f0 extends n4f0 {

    /* JADX INFO: renamed from: a */
    public final String f108683a;

    /* JADX INFO: renamed from: b */
    public final boolean f108684b;

    public j4f0(String str, boolean z) {
        this.f108683a = str;
        this.f108684b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j4f0)) {
            return false;
        }
        j4f0 j4f0Var = (j4f0) obj;
        return wj50.m88271j(this.f108683a, j4f0Var.f108683a) && this.f108684b == j4f0Var.f108684b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f108684b) + (this.f108683a.hashCode() * 31);
    }
}
