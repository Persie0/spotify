package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class lk8 {

    /* JADX INFO: renamed from: a */
    public final long f134281a;

    /* JADX INFO: renamed from: b */
    public final voi0 f134282b;

    /* JADX INFO: renamed from: c */
    public final ch01 f134283c;

    /* JADX INFO: renamed from: d */
    public final boolean f134284d;

    /* JADX INFO: renamed from: e */
    public final boolean f134285e;

    public lk8(long j, voi0 voi0Var, ch01 ch01Var, boolean z, boolean z2) {
        this.f134281a = j;
        this.f134282b = voi0Var;
        this.f134283c = ch01Var;
        this.f134284d = z;
        this.f134285e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lk8)) {
            return false;
        }
        lk8 lk8Var = (lk8) obj;
        long j = lk8Var.f134281a;
        int i = n6f.f150872l;
        return as91.m27074b(this.f134281a, j) && wj50.m88271j(this.f134282b, lk8Var.f134282b) && this.f134283c.equals(lk8Var.f134283c) && this.f134284d == lk8Var.f134284d && this.f134285e == lk8Var.f134285e;
    }

    public final int hashCode() {
        int i = n6f.f150872l;
        int iHashCode = Long.hashCode(this.f134281a) * 31;
        voi0 voi0Var = this.f134282b;
        return Boolean.hashCode(this.f134285e) + s571.m77245d((this.f134283c.hashCode() + ((iHashCode + (voi0Var == null ? 0 : voi0Var.hashCode())) * 31)) * 31, 31, this.f134284d);
    }
}
