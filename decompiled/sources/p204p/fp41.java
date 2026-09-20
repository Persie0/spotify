package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class fp41 implements g5b1 {

    /* JADX INFO: renamed from: a */
    public final g5b1 f71732a;

    /* JADX INFO: renamed from: b */
    public final long f71733b;

    public fp41(g5b1 g5b1Var, long j) {
        this.f71732a = g5b1Var;
        this.f71733b = j;
    }

    @Override // p204p.g5b1
    /* JADX INFO: renamed from: b */
    public final boolean mo42324b() {
        return this.f71732a.mo42324b();
    }

    @Override // p204p.g5b1
    /* JADX INFO: renamed from: d */
    public final long mo35620d(w05 w05Var, w05 w05Var2, w05 w05Var3) {
        return this.f71732a.mo35620d(w05Var, w05Var2, w05Var3) + this.f71733b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fp41)) {
            return false;
        }
        fp41 fp41Var = (fp41) obj;
        return fp41Var.f71733b == this.f71733b && wj50.m88271j(fp41Var.f71732a, this.f71732a);
    }

    @Override // p204p.g5b1
    /* JADX INFO: renamed from: f */
    public final w05 mo35621f(long j, w05 w05Var, w05 w05Var2, w05 w05Var3) {
        long j2 = this.f71733b;
        return j < j2 ? w05Var3 : this.f71732a.mo35621f(j - j2, w05Var, w05Var2, w05Var3);
    }

    public final int hashCode() {
        return Long.hashCode(this.f71733b) + (this.f71732a.hashCode() * 31);
    }

    @Override // p204p.g5b1
    /* JADX INFO: renamed from: m */
    public final w05 mo35624m(long j, w05 w05Var, w05 w05Var2, w05 w05Var3) {
        long j2 = this.f71733b;
        return j < j2 ? w05Var : this.f71732a.mo35624m(j - j2, w05Var, w05Var2, w05Var3);
    }
}
