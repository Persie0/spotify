package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class uu2 {

    /* JADX INFO: renamed from: a */
    public final voc1 f234080a;

    /* JADX INFO: renamed from: b */
    public final String f234081b;

    /* JADX INFO: renamed from: c */
    public final xh81 f234082c;

    /* JADX INFO: renamed from: d */
    public final tu2 f234083d;

    /* JADX INFO: renamed from: e */
    public final mu2 f234084e;

    public uu2(voc1 voc1Var, String str, xh81 xh81Var, tu2 tu2Var, mu2 mu2Var) {
        this.f234080a = voc1Var;
        this.f234081b = str;
        this.f234082c = xh81Var;
        this.f234083d = tu2Var;
        this.f234084e = mu2Var;
    }

    /* JADX INFO: renamed from: a */
    public static uu2 m83965a(uu2 uu2Var, xh81 xh81Var, tu2 tu2Var, mu2 mu2Var, int i) {
        voc1 voc1Var = uu2Var.f234080a;
        String str = uu2Var.f234081b;
        if ((i & 4) != 0) {
            xh81Var = uu2Var.f234082c;
        }
        xh81 xh81Var2 = xh81Var;
        if ((i & 16) != 0) {
            mu2Var = uu2Var.f234084e;
        }
        uu2Var.getClass();
        return new uu2(voc1Var, str, xh81Var2, tu2Var, mu2Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uu2)) {
            return false;
        }
        uu2 uu2Var = (uu2) obj;
        return wj50.m88271j(this.f234080a, uu2Var.f234080a) && wj50.m88271j(this.f234081b, uu2Var.f234081b) && wj50.m88271j(this.f234082c, uu2Var.f234082c) && wj50.m88271j(this.f234083d, uu2Var.f234083d) && wj50.m88271j(this.f234084e, uu2Var.f234084e);
    }

    public final int hashCode() {
        int iHashCode = this.f234080a.f243453a.hashCode() * 31;
        String str = this.f234081b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        xh81 xh81Var = this.f234082c;
        return this.f234084e.hashCode() + ((this.f234083d.hashCode() + ((iHashCode2 + (xh81Var != null ? xh81Var.hashCode() : 0)) * 31)) * 31);
    }
}
