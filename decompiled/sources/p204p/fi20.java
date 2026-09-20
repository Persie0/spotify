package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class fi20 {

    /* JADX INFO: renamed from: a */
    public final wg20 f69755a;

    /* JADX INFO: renamed from: b */
    public final a7f0 f69756b;

    /* JADX INFO: renamed from: c */
    public final a7f0 f69757c;

    /* JADX INFO: renamed from: d */
    public final a7f0 f69758d;

    public fi20(wg20 wg20Var, a7f0 a7f0Var, a7f0 a7f0Var2, a7f0 a7f0Var3) {
        this.f69755a = wg20Var;
        this.f69756b = a7f0Var;
        this.f69757c = a7f0Var2;
        this.f69758d = a7f0Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fi20)) {
            return false;
        }
        fi20 fi20Var = (fi20) obj;
        return wj50.m88271j(this.f69755a, fi20Var.f69755a) && wj50.m88271j(this.f69756b, fi20Var.f69756b) && wj50.m88271j(this.f69757c, fi20Var.f69757c) && wj50.m88271j(this.f69758d, fi20Var.f69758d);
    }

    public final int hashCode() {
        int iHashCode = this.f69755a.hashCode() * 31;
        a7f0 a7f0Var = this.f69756b;
        int iHashCode2 = (iHashCode + (a7f0Var == null ? 0 : a7f0Var.hashCode())) * 31;
        a7f0 a7f0Var2 = this.f69757c;
        int iHashCode3 = (iHashCode2 + (a7f0Var2 == null ? 0 : a7f0Var2.hashCode())) * 31;
        a7f0 a7f0Var3 = this.f69758d;
        return iHashCode3 + (a7f0Var3 != null ? a7f0Var3.hashCode() : 0);
    }
}
