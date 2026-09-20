package p204p;

/* JADX INFO: loaded from: classes10.dex */
@rtz0
public final class hwt0 {
    public static final gwt0 Companion = new gwt0();

    /* JADX INFO: renamed from: a */
    public final String f96043a;

    /* JADX INFO: renamed from: b */
    public final String f96044b;

    /* JADX INFO: renamed from: c */
    public final String f96045c;

    /* JADX INFO: renamed from: d */
    public final String f96046d;

    /* JADX INFO: renamed from: e */
    public final Long f96047e;

    /* JADX INFO: renamed from: f */
    public final g1p0 f96048f;

    /* JADX INFO: renamed from: g */
    public final String f96049g;

    public /* synthetic */ hwt0(int i, String str, String str2, String str3, String str4, Long l, g1p0 g1p0Var, String str5) {
        if (3 != (i & 3)) {
            edo.m38617p(i, 3, fwt0.f74162a.getDescriptor());
            throw null;
        }
        this.f96043a = str;
        this.f96044b = str2;
        if ((i & 4) == 0) {
            this.f96045c = null;
        } else {
            this.f96045c = str3;
        }
        if ((i & 8) == 0) {
            this.f96046d = null;
        } else {
            this.f96046d = str4;
        }
        if ((i & 16) == 0) {
            this.f96047e = null;
        } else {
            this.f96047e = l;
        }
        if ((i & 32) == 0) {
            this.f96048f = null;
        } else {
            this.f96048f = g1p0Var;
        }
        if ((i & 64) == 0) {
            this.f96049g = null;
        } else {
            this.f96049g = str5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hwt0)) {
            return false;
        }
        hwt0 hwt0Var = (hwt0) obj;
        return wj50.m88271j(this.f96043a, hwt0Var.f96043a) && wj50.m88271j(this.f96044b, hwt0Var.f96044b) && wj50.m88271j(this.f96045c, hwt0Var.f96045c) && wj50.m88271j(this.f96046d, hwt0Var.f96046d) && wj50.m88271j(this.f96047e, hwt0Var.f96047e) && wj50.m88271j(this.f96048f, hwt0Var.f96048f) && wj50.m88271j(this.f96049g, hwt0Var.f96049g);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f96043a.hashCode() * 31, 31, this.f96044b);
        String str = this.f96045c;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f96046d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.f96047e;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        g1p0 g1p0Var = this.f96048f;
        int iHashCode4 = (iHashCode3 + (g1p0Var == null ? 0 : g1p0Var.hashCode())) * 31;
        String str3 = this.f96049g;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }
}
