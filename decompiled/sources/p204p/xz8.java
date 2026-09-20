package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class xz8 {

    /* JADX INFO: renamed from: a */
    public final atj0 f267544a;

    /* JADX INFO: renamed from: b */
    public final guj0 f267545b;

    /* JADX INFO: renamed from: c */
    public final huj0 f267546c;

    /* JADX INFO: renamed from: d */
    public final iuj0 f267547d;

    /* JADX INFO: renamed from: e */
    public final fuj0 f267548e;

    /* JADX INFO: renamed from: f */
    public final boolean f267549f;

    public xz8(atj0 atj0Var, guj0 guj0Var, huj0 huj0Var, iuj0 iuj0Var, fuj0 fuj0Var, boolean z) {
        this.f267544a = atj0Var;
        this.f267545b = guj0Var;
        this.f267546c = huj0Var;
        this.f267547d = iuj0Var;
        this.f267548e = fuj0Var;
        this.f267549f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xz8)) {
            return false;
        }
        xz8 xz8Var = (xz8) obj;
        return wj50.m88271j(this.f267544a, xz8Var.f267544a) && wj50.m88271j(this.f267545b, xz8Var.f267545b) && wj50.m88271j(this.f267546c, xz8Var.f267546c) && wj50.m88271j(this.f267547d, xz8Var.f267547d) && wj50.m88271j(this.f267548e, xz8Var.f267548e) && this.f267549f == xz8Var.f267549f;
    }

    public final int hashCode() {
        int iHashCode = (this.f267545b.hashCode() + (this.f267544a.hashCode() * 31)) * 31;
        huj0 huj0Var = this.f267546c;
        int iHashCode2 = (iHashCode + (huj0Var == null ? 0 : huj0Var.f95413c.hashCode())) * 31;
        iuj0 iuj0Var = this.f267547d;
        int iHashCode3 = (iHashCode2 + (iuj0Var == null ? 0 : iuj0Var.hashCode())) * 31;
        fuj0 fuj0Var = this.f267548e;
        return Boolean.hashCode(this.f267549f) + ((iHashCode3 + (fuj0Var != null ? fuj0Var.hashCode() : 0)) * 31);
    }
}
