package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class lq2 {

    /* JADX INFO: renamed from: a */
    public final String f135933a;

    /* JADX INFO: renamed from: b */
    public final String f135934b;

    /* JADX INFO: renamed from: c */
    public final boolean f135935c;

    /* JADX INFO: renamed from: d */
    public final String f135936d;

    public lq2(String str, String str2, boolean z, String str3) {
        this.f135933a = str;
        this.f135934b = str2;
        this.f135935c = z;
        this.f135936d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lq2)) {
            return false;
        }
        lq2 lq2Var = (lq2) obj;
        return wj50.m88271j(this.f135933a, lq2Var.f135933a) && wj50.m88271j(this.f135934b, lq2Var.f135934b) && this.f135935c == lq2Var.f135935c && wj50.m88271j(this.f135936d, lq2Var.f135936d);
    }

    public final int hashCode() {
        return this.f135936d.hashCode() + s571.m77245d(s571.m77243b(this.f135933a.hashCode() * 31, 31, this.f135934b), 31, this.f135935c);
    }
}
