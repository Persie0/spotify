package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class g011 {

    /* JADX INFO: renamed from: a */
    public final String f75233a;

    /* JADX INFO: renamed from: b */
    public final String f75234b;

    /* JADX INFO: renamed from: c */
    public final String f75235c;

    /* JADX INFO: renamed from: d */
    public final C1722bz f75236d;

    /* JADX INFO: renamed from: e */
    public final C1722bz f75237e;

    public g011(String str, String str2, String str3, C1722bz c1722bz, C1722bz c1722bz2) {
        this.f75233a = str;
        this.f75234b = str2;
        this.f75235c = str3;
        this.f75236d = c1722bz;
        this.f75237e = c1722bz2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g011)) {
            return false;
        }
        g011 g011Var = (g011) obj;
        return wj50.m88271j(this.f75233a, g011Var.f75233a) && wj50.m88271j(this.f75234b, g011Var.f75234b) && wj50.m88271j(this.f75235c, g011Var.f75235c) && wj50.m88271j(this.f75236d, g011Var.f75236d) && wj50.m88271j(this.f75237e, g011Var.f75237e);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f75233a.hashCode() * 31, 31, this.f75234b);
        int i = 0;
        String str = this.f75235c;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        this.f75236d.getClass();
        int i2 = (iHashCode - 371711337) * 31;
        C1722bz c1722bz = this.f75237e;
        if (c1722bz != null) {
            c1722bz.getClass();
            i = -371711337;
        }
        return i2 + i;
    }
}
