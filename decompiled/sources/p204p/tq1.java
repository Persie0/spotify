package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class tq1 implements vq1 {

    /* JADX INFO: renamed from: a */
    public final String f222645a;

    /* JADX INFO: renamed from: b */
    public final String f222646b;

    /* JADX INFO: renamed from: c */
    public final String f222647c;

    /* JADX INFO: renamed from: d */
    public final boolean f222648d;

    /* JADX INFO: renamed from: e */
    public final boolean f222649e;

    /* JADX INFO: renamed from: f */
    public final int f222650f;

    /* JADX INFO: renamed from: g */
    public final int f222651g;

    public tq1(String str, String str2, String str3, boolean z, boolean z2, int i, int i2) {
        this.f222645a = str;
        this.f222646b = str2;
        this.f222647c = str3;
        this.f222648d = z;
        this.f222649e = z2;
        this.f222650f = i;
        this.f222651g = i2;
    }

    @Override // p204p.vq1
    /* JADX INFO: renamed from: a */
    public final String mo81292a() {
        return this.f222647c;
    }

    @Override // p204p.vq1
    /* JADX INFO: renamed from: b */
    public final boolean mo81293b() {
        return this.f222649e;
    }

    /* JADX INFO: renamed from: c */
    public final int m81294c() {
        return this.f222650f;
    }

    /* JADX INFO: renamed from: d */
    public final int m81295d() {
        return this.f222651g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tq1)) {
            return false;
        }
        tq1 tq1Var = (tq1) obj;
        return wj50.m88271j(this.f222645a, tq1Var.f222645a) && wj50.m88271j(this.f222646b, tq1Var.f222646b) && wj50.m88271j(this.f222647c, tq1Var.f222647c) && this.f222648d == tq1Var.f222648d && this.f222649e == tq1Var.f222649e && this.f222650f == tq1Var.f222650f && this.f222651g == tq1Var.f222651g;
    }

    @Override // p204p.vq1
    public final String getUri() {
        return this.f222645a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f222651g) + mt60.m62800g(this.f222650f, s571.m77245d(s571.m77245d(s571.m77243b(s571.m77243b(this.f222645a.hashCode() * 31, 31, this.f222646b), 31, this.f222647c), 31, this.f222648d), 31, this.f222649e), 31);
    }
}
