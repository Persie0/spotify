package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class cfo0 {

    /* JADX INFO: renamed from: a */
    public final xeo0 f37407a;

    /* JADX INFO: renamed from: b */
    public final boolean f37408b;

    /* JADX INFO: renamed from: c */
    public final boolean f37409c;

    /* JADX INFO: renamed from: d */
    public final boolean f37410d;

    public cfo0(xeo0 xeo0Var, boolean z, boolean z2, boolean z3) {
        this.f37407a = xeo0Var;
        this.f37408b = z;
        this.f37409c = z2;
        this.f37410d = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cfo0)) {
            return false;
        }
        cfo0 cfo0Var = (cfo0) obj;
        return wj50.m88271j(this.f37407a, cfo0Var.f37407a) && this.f37408b == cfo0Var.f37408b && this.f37409c == cfo0Var.f37409c && this.f37410d == cfo0Var.f37410d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f37410d) + s571.m77245d(s571.m77245d(this.f37407a.hashCode() * 31, 31, this.f37408b), 31, this.f37409c);
    }
}
