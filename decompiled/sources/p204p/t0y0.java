package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class t0y0 {

    /* JADX INFO: renamed from: a */
    public final String f216028a;

    /* JADX INFO: renamed from: b */
    public final String f216029b;

    /* JADX INFO: renamed from: c */
    public final u0y0 f216030c;

    /* JADX INFO: renamed from: d */
    public final int f216031d;

    /* JADX INFO: renamed from: e */
    public final String f216032e;

    /* JADX INFO: renamed from: f */
    public final s7p0 f216033f;

    public t0y0(String str, String str2, u0y0 u0y0Var, int i, String str3, s7p0 s7p0Var) {
        this.f216028a = str;
        this.f216029b = str2;
        this.f216030c = u0y0Var;
        this.f216031d = i;
        this.f216032e = str3;
        this.f216033f = s7p0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0y0)) {
            return false;
        }
        t0y0 t0y0Var = (t0y0) obj;
        return wj50.m88271j(this.f216028a, t0y0Var.f216028a) && wj50.m88271j(this.f216029b, t0y0Var.f216029b) && this.f216030c == t0y0Var.f216030c && this.f216031d == t0y0Var.f216031d && wj50.m88271j(this.f216032e, t0y0Var.f216032e) && this.f216033f.equals(t0y0Var.f216033f);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f216028a.hashCode() * 31, 31, this.f216029b);
        u0y0 u0y0Var = this.f216030c;
        int iHashCode = (iM77243b + (u0y0Var == null ? 0 : u0y0Var.hashCode())) * 31;
        int i = this.f216031d;
        int iM38547C = (iHashCode + (i == 0 ? 0 : edb.m38547C(i))) * 31;
        String str = this.f216032e;
        return this.f216033f.hashCode() + ((iM38547C + (str != null ? str.hashCode() : 0)) * 31);
    }
}
