package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class n2e0 implements o2e0 {

    /* JADX INFO: renamed from: a */
    public final String f149749a;

    /* JADX INFO: renamed from: b */
    public final boolean f149750b;

    public n2e0(String str, boolean z) {
        this.f149749a = str;
        this.f149750b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n2e0)) {
            return false;
        }
        n2e0 n2e0Var = (n2e0) obj;
        return wj50.m88271j(this.f149749a, n2e0Var.f149749a) && this.f149750b == n2e0Var.f149750b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f149750b) + (this.f149749a.hashCode() * 31);
    }
}
