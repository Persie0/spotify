package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class cxb1 extends dxb1 {

    /* JADX INFO: renamed from: a */
    public final boolean f42975a;

    /* JADX INFO: renamed from: b */
    public final int f42976b;

    /* JADX INFO: renamed from: c */
    public final boolean f42977c;

    public cxb1(int i, boolean z, boolean z2) {
        this.f42975a = z;
        this.f42976b = i;
        this.f42977c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cxb1)) {
            return false;
        }
        cxb1 cxb1Var = (cxb1) obj;
        return this.f42975a == cxb1Var.f42975a && this.f42976b == cxb1Var.f42976b && this.f42977c == cxb1Var.f42977c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f42977c) + f710.m40938f(this.f42976b, Boolean.hashCode(this.f42975a) * 31, 31);
    }
}
