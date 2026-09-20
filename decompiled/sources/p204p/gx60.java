package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class gx60 implements kx60 {

    /* JADX INFO: renamed from: a */
    public final String f85191a;

    /* JADX INFO: renamed from: b */
    public final nk2 f85192b;

    /* JADX INFO: renamed from: c */
    public final String f85193c;

    /* JADX INFO: renamed from: d */
    public final j741 f85194d;

    /* JADX INFO: renamed from: e */
    public final d850 f85195e;

    /* JADX INFO: renamed from: f */
    public final String f85196f;

    /* JADX INFO: renamed from: g */
    public final String f85197g;

    public gx60(String str, nk2 nk2Var, String str2, j741 j741Var, d850 d850Var, String str3, String str4) {
        this.f85191a = str;
        this.f85192b = nk2Var;
        this.f85193c = str2;
        this.f85194d = j741Var;
        this.f85195e = d850Var;
        this.f85196f = str3;
        this.f85197g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gx60)) {
            return false;
        }
        gx60 gx60Var = (gx60) obj;
        return wj50.m88271j(this.f85191a, gx60Var.f85191a) && this.f85192b == gx60Var.f85192b && wj50.m88271j(this.f85193c, gx60Var.f85193c) && wj50.m88271j(this.f85194d, gx60Var.f85194d) && wj50.m88271j(this.f85195e, gx60Var.f85195e) && wj50.m88271j(this.f85196f, gx60Var.f85196f) && wj50.m88271j(this.f85197g, gx60Var.f85197g);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b((this.f85192b.hashCode() + (this.f85191a.hashCode() * 31)) * 31, 31, this.f85193c);
        j741 j741Var = this.f85194d;
        int iHashCode = (iM77243b + (j741Var == null ? 0 : j741Var.hashCode())) * 31;
        d850 d850Var = this.f85195e;
        int iHashCode2 = (iHashCode + (d850Var == null ? 0 : d850Var.hashCode())) * 31;
        String str = this.f85196f;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f85197g;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }
}
