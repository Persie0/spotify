package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ead1 {

    /* JADX INFO: renamed from: a */
    public final String f57630a;

    /* JADX INFO: renamed from: b */
    public final String f57631b;

    /* JADX INFO: renamed from: c */
    public final String f57632c;

    /* JADX INFO: renamed from: d */
    public final String f57633d;

    /* JADX INFO: renamed from: e */
    public final String f57634e;

    /* JADX INFO: renamed from: f */
    public final j340 f57635f;

    /* JADX INFO: renamed from: g */
    public final bub1 f57636g;

    /* JADX INFO: renamed from: h */
    public final String f57637h;

    /* JADX INFO: renamed from: i */
    public final String f57638i;

    /* JADX INFO: renamed from: j */
    public final j340 f57639j;

    /* JADX INFO: renamed from: k */
    public final String f57640k;

    /* JADX INFO: renamed from: l */
    public final Float f57641l;

    /* JADX INFO: renamed from: m */
    public final j340 f57642m;

    /* JADX INFO: renamed from: n */
    public final x8f f57643n;

    public ead1(String str, String str2, String str3, String str4, String str5, j340 j340Var, bub1 bub1Var, String str6, String str7, j340 j340Var2, String str8, Float f, j340 j340Var3, x8f x8fVar) {
        this.f57630a = str;
        this.f57631b = str2;
        this.f57632c = str3;
        this.f57633d = str4;
        this.f57634e = str5;
        this.f57635f = j340Var;
        this.f57636g = bub1Var;
        this.f57637h = str6;
        this.f57638i = str7;
        this.f57639j = j340Var2;
        this.f57640k = str8;
        this.f57641l = f;
        this.f57642m = j340Var3;
        this.f57643n = x8fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ead1)) {
            return false;
        }
        ead1 ead1Var = (ead1) obj;
        return wj50.m88271j(this.f57630a, ead1Var.f57630a) && wj50.m88271j(this.f57631b, ead1Var.f57631b) && wj50.m88271j(this.f57632c, ead1Var.f57632c) && wj50.m88271j(this.f57633d, ead1Var.f57633d) && wj50.m88271j(this.f57634e, ead1Var.f57634e) && wj50.m88271j(this.f57635f, ead1Var.f57635f) && wj50.m88271j(this.f57636g, ead1Var.f57636g) && wj50.m88271j(this.f57637h, ead1Var.f57637h) && wj50.m88271j(this.f57638i, ead1Var.f57638i) && wj50.m88271j(this.f57639j, ead1Var.f57639j) && wj50.m88271j(this.f57640k, ead1Var.f57640k) && wj50.m88271j(this.f57641l, ead1Var.f57641l) && wj50.m88271j(this.f57642m, ead1Var.f57642m) && wj50.m88271j(this.f57643n, ead1Var.f57643n);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b((this.f57639j.hashCode() + s571.m77243b(s571.m77243b((this.f57636g.hashCode() + ((this.f57635f.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f57630a.hashCode() * 31, 31, this.f57631b), 31, this.f57632c), 31, this.f57633d), 31, this.f57634e)) * 31)) * 31, 31, this.f57637h), 31, this.f57638i)) * 31, 31, this.f57640k);
        Float f = this.f57641l;
        int iHashCode = (iM77243b + (f == null ? 0 : f.hashCode())) * 31;
        j340 j340Var = this.f57642m;
        int iHashCode2 = (iHashCode + (j340Var == null ? 0 : j340Var.hashCode())) * 31;
        x8f x8fVar = this.f57643n;
        return iHashCode2 + (x8fVar != null ? x8fVar.hashCode() : 0);
    }
}
