package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class oib0 {

    /* JADX INFO: renamed from: a */
    public final int f165755a;

    /* JADX INFO: renamed from: b */
    public final String f165756b;

    /* JADX INFO: renamed from: c */
    public final ko70 f165757c;

    /* JADX INFO: renamed from: d */
    public final int f165758d;

    /* JADX INFO: renamed from: e */
    public final String f165759e;

    /* JADX INFO: renamed from: f */
    public final ko70 f165760f;

    /* JADX INFO: renamed from: g */
    public final boolean f165761g;

    /* JADX INFO: renamed from: h */
    public final long f165762h;

    /* JADX INFO: renamed from: i */
    public final long f165763i;

    /* JADX INFO: renamed from: j */
    public final nib0 f165764j;

    /* JADX INFO: renamed from: k */
    public final int f165765k;

    /* JADX INFO: renamed from: l */
    public final String f165766l;

    /* JADX INFO: renamed from: m */
    public final boolean f165767m;

    public oib0(int i, String str, ko70 ko70Var, int i2, String str2, ko70 ko70Var2, boolean z, long j, long j2, nib0 nib0Var, int i3, String str3, boolean z2) {
        this.f165755a = i;
        this.f165756b = str;
        this.f165757c = ko70Var;
        this.f165758d = i2;
        this.f165759e = str2;
        this.f165760f = ko70Var2;
        this.f165761g = z;
        this.f165762h = j;
        this.f165763i = j2;
        this.f165764j = nib0Var;
        this.f165765k = i3;
        this.f165766l = str3;
        this.f165767m = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oib0)) {
            return false;
        }
        oib0 oib0Var = (oib0) obj;
        if (this.f165755a != oib0Var.f165755a || !wj50.m88271j(this.f165756b, oib0Var.f165756b) || this.f165757c != oib0Var.f165757c || this.f165758d != oib0Var.f165758d || !this.f165759e.equals(oib0Var.f165759e) || this.f165760f != oib0Var.f165760f || this.f165761g != oib0Var.f165761g) {
            return false;
        }
        long j = oib0Var.f165762h;
        int i = n6f.f150872l;
        return as91.m27074b(this.f165762h, j) && as91.m27074b(this.f165763i, oib0Var.f165763i) && this.f165764j.equals(oib0Var.f165764j) && this.f165765k == oib0Var.f165765k && wj50.m88271j(this.f165766l, oib0Var.f165766l) && this.f165767m == oib0Var.f165767m;
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d((this.f165760f.hashCode() + s571.m77243b(mt60.m62800g(this.f165758d, (this.f165757c.hashCode() + s571.m77243b(Integer.hashCode(this.f165755a) * 31, 31, this.f165756b)) * 31, 31), 31, this.f165759e)) * 31, 31, this.f165761g);
        int i = n6f.f150872l;
        return Boolean.hashCode(this.f165767m) + s571.m77243b(f710.m40938f(this.f165765k, (this.f165764j.hashCode() + dq60.m36605e(dq60.m36605e(iM77245d, this.f165762h, 31), this.f165763i, 31)) * 31, 31), 31, this.f165766l);
    }
}
