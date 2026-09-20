package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class cgs0 extends ths0 {

    /* JADX INFO: renamed from: a */
    public final wke0 f37785a;

    /* JADX INFO: renamed from: b */
    public final boolean f37786b;

    public cgs0(wke0 wke0Var, boolean z) {
        this.f37785a = wke0Var;
        this.f37786b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cgs0)) {
            return false;
        }
        cgs0 cgs0Var = (cgs0) obj;
        return this.f37785a.equals(cgs0Var.f37785a) && this.f37786b == cgs0Var.f37786b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f37786b) + (this.f37785a.hashCode() * 31);
    }
}
