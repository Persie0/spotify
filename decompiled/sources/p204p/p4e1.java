package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class p4e1 implements a5e1 {

    /* JADX INFO: renamed from: a */
    public final int f173904a;

    /* JADX INFO: renamed from: b */
    public final String f173905b;

    /* JADX INFO: renamed from: c */
    public final String f173906c;

    /* JADX INFO: renamed from: d */
    public final String f173907d;

    /* JADX INFO: renamed from: e */
    public final String f173908e;

    /* JADX INFO: renamed from: f */
    public final int f173909f;

    /* JADX INFO: renamed from: g */
    public final String f173910g;

    /* JADX INFO: renamed from: h */
    public final String f173911h;

    /* JADX INFO: renamed from: i */
    public final String f173912i;

    /* JADX INFO: renamed from: j */
    public final String f173913j;

    /* JADX INFO: renamed from: k */
    public final t0m f173914k;

    public p4e1(int i, String str, String str2, String str3, String str4, int i2, String str5, String str6, String str7, String str8, t0m t0mVar) {
        this.f173904a = i;
        this.f173905b = str;
        this.f173906c = str2;
        this.f173907d = str3;
        this.f173908e = str4;
        this.f173909f = i2;
        this.f173910g = str5;
        this.f173911h = str6;
        this.f173912i = str7;
        this.f173913j = str8;
        this.f173914k = t0mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p4e1)) {
            return false;
        }
        p4e1 p4e1Var = (p4e1) obj;
        return this.f173904a == p4e1Var.f173904a && this.f173905b.equals(p4e1Var.f173905b) && this.f173906c.equals(p4e1Var.f173906c) && this.f173907d.equals(p4e1Var.f173907d) && wj50.m88271j(this.f173908e, p4e1Var.f173908e) && this.f173909f == p4e1Var.f173909f && this.f173910g.equals(p4e1Var.f173910g) && this.f173911h.equals(p4e1Var.f173911h) && this.f173912i.equals(p4e1Var.f173912i) && wj50.m88271j(this.f173913j, p4e1Var.f173913j) && this.f173914k.equals(p4e1Var.f173914k);
    }

    public final int hashCode() {
        return this.f173914k.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(mt60.m62800g(this.f173909f, s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(edb.m38547C(this.f173904a) * 31, 31, this.f173905b), 31, this.f173906c), 31, this.f173907d), 31, this.f173908e), 31), 31, this.f173910g), 31, this.f173911h), 31, this.f173912i), 31, this.f173913j);
    }
}
