package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class n4d1 extends b5d1 {

    /* JADX INFO: renamed from: a */
    public final String f150324a;

    /* JADX INFO: renamed from: b */
    public final boolean f150325b;

    public n4d1(String str, boolean z) {
        this.f150324a = str;
        this.f150325b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n4d1)) {
            return false;
        }
        n4d1 n4d1Var = (n4d1) obj;
        return wj50.m88271j(this.f150324a, n4d1Var.f150324a) && this.f150325b == n4d1Var.f150325b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f150325b) + (this.f150324a.hashCode() * 31);
    }
}
