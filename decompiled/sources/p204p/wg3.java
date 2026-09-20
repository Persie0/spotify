package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class wg3 extends yg3 {

    /* JADX INFO: renamed from: a */
    public final ch3 f250954a;

    /* JADX INFO: renamed from: b */
    public final boolean f250955b;

    /* JADX INFO: renamed from: c */
    public final boolean f250956c;

    /* JADX INFO: renamed from: d */
    public final boolean f250957d;

    public wg3(ch3 ch3Var, boolean z, boolean z2, boolean z3) {
        this.f250954a = ch3Var;
        this.f250955b = z;
        this.f250956c = z2;
        this.f250957d = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wg3)) {
            return false;
        }
        wg3 wg3Var = (wg3) obj;
        return wj50.m88271j(this.f250954a, wg3Var.f250954a) && this.f250955b == wg3Var.f250955b && this.f250956c == wg3Var.f250956c && this.f250957d == wg3Var.f250957d;
    }

    public final int hashCode() {
        ch3 ch3Var = this.f250954a;
        return Boolean.hashCode(this.f250957d) + s571.m77245d(s571.m77245d((ch3Var == null ? 0 : ch3Var.hashCode()) * 31, 31, this.f250955b), 31, this.f250956c);
    }
}
