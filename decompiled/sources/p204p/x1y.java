package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class x1y {

    /* JADX INFO: renamed from: a */
    public final boolean f257299a;

    /* JADX INFO: renamed from: b */
    public final ci20 f257300b;

    /* JADX INFO: renamed from: c */
    public final boolean f257301c;

    /* JADX INFO: renamed from: d */
    public final daq0 f257302d;

    /* JADX INFO: renamed from: e */
    public final boolean f257303e;

    /* JADX INFO: renamed from: f */
    public final boolean f257304f;

    /* JADX INFO: renamed from: g */
    public final o9c1 f257305g;

    /* JADX INFO: renamed from: h */
    public final qsj f257306h;

    /* JADX INFO: renamed from: i */
    public final cks f257307i;

    /* JADX INFO: renamed from: j */
    public final Long f257308j;

    /* JADX INFO: renamed from: k */
    public final y6s0 f257309k;

    /* JADX INFO: renamed from: l */
    public final boolean f257310l;

    /* JADX INFO: renamed from: m */
    public final boolean f257311m;

    /* JADX INFO: renamed from: n */
    public final boolean f257312n;

    /* JADX INFO: renamed from: o */
    public final String f257313o;

    /* JADX INFO: renamed from: p */
    public final String f257314p;

    public x1y(boolean z, ci20 ci20Var, boolean z2, daq0 daq0Var, boolean z3, boolean z4, o9c1 o9c1Var, qsj qsjVar, cks cksVar, Long l, y6s0 y6s0Var, boolean z5, boolean z6, boolean z7, String str, String str2) {
        this.f257299a = z;
        this.f257300b = ci20Var;
        this.f257301c = z2;
        this.f257302d = daq0Var;
        this.f257303e = z3;
        this.f257304f = z4;
        this.f257305g = o9c1Var;
        this.f257306h = qsjVar;
        this.f257307i = cksVar;
        this.f257308j = l;
        this.f257309k = y6s0Var;
        this.f257310l = z5;
        this.f257311m = z6;
        this.f257312n = z7;
        this.f257313o = str;
        this.f257314p = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x1y)) {
            return false;
        }
        x1y x1yVar = (x1y) obj;
        return this.f257299a == x1yVar.f257299a && this.f257300b.equals(x1yVar.f257300b) && this.f257301c == x1yVar.f257301c && wj50.m88271j(this.f257302d, x1yVar.f257302d) && this.f257303e == x1yVar.f257303e && this.f257304f == x1yVar.f257304f && wj50.m88271j(this.f257305g, x1yVar.f257305g) && this.f257306h == x1yVar.f257306h && wj50.m88271j(this.f257307i, x1yVar.f257307i) && wj50.m88271j(this.f257308j, x1yVar.f257308j) && this.f257309k.equals(x1yVar.f257309k) && this.f257310l == x1yVar.f257310l && this.f257311m == x1yVar.f257311m && this.f257312n == x1yVar.f257312n && wj50.m88271j(this.f257313o, x1yVar.f257313o) && wj50.m88271j(this.f257314p, x1yVar.f257314p);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d((this.f257300b.hashCode() + (Boolean.hashCode(this.f257299a) * 31)) * 31, 31, this.f257301c);
        daq0 daq0Var = this.f257302d;
        int iM77245d2 = s571.m77245d(s571.m77245d(s571.m77245d((iM77245d + (daq0Var == null ? 0 : daq0Var.hashCode())) * 31, 31, this.f257303e), 31, this.f257304f), 31, false);
        o9c1 o9c1Var = this.f257305g;
        int iHashCode = (iM77245d2 + (o9c1Var == null ? 0 : o9c1Var.hashCode())) * 31;
        qsj qsjVar = this.f257306h;
        int iHashCode2 = (iHashCode + (qsjVar == null ? 0 : qsjVar.hashCode())) * 31;
        cks cksVar = this.f257307i;
        int iHashCode3 = (iHashCode2 + (cksVar == null ? 0 : Long.hashCode(cksVar.f39083a))) * 31;
        Long l = this.f257308j;
        int iM77245d3 = s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d((this.f257309k.hashCode() + ((iHashCode3 + (l == null ? 0 : l.hashCode())) * 31)) * 31, 31, this.f257310l), 31, true), 31, this.f257311m), 31, this.f257312n);
        String str = this.f257313o;
        return this.f257314p.hashCode() + ((iM77245d3 + (str != null ? str.hashCode() : 0)) * 31);
    }
}
