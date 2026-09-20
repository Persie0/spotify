package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class lcq0 {

    /* JADX INFO: renamed from: a */
    public final String f131972a;

    /* JADX INFO: renamed from: b */
    public final String f131973b;

    /* JADX INFO: renamed from: c */
    public final String f131974c;

    /* JADX INFO: renamed from: d */
    public final String f131975d;

    /* JADX INFO: renamed from: e */
    public final boolean f131976e;

    /* JADX INFO: renamed from: f */
    public final kcq0 f131977f;

    /* JADX INFO: renamed from: g */
    public final kcq0 f131978g;

    /* JADX INFO: renamed from: h */
    public final long f131979h;

    /* JADX INFO: renamed from: i */
    public final String f131980i;

    /* JADX INFO: renamed from: j */
    public final boolean f131981j;

    /* JADX INFO: renamed from: k */
    public final gcq0 f131982k;

    public lcq0(String str, String str2, String str3, String str4, boolean z, kcq0 kcq0Var, kcq0 kcq0Var2, long j, String str5, boolean z2) {
        this.f131972a = str;
        this.f131973b = str2;
        this.f131974c = str3;
        this.f131975d = str4;
        this.f131976e = z;
        this.f131977f = kcq0Var;
        this.f131978g = kcq0Var2;
        this.f131979h = j;
        this.f131980i = str5;
        this.f131981j = z2;
        this.f131982k = new gcq0(j, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lcq0)) {
            return false;
        }
        lcq0 lcq0Var = (lcq0) obj;
        return wj50.m88271j(this.f131972a, lcq0Var.f131972a) && wj50.m88271j(this.f131973b, lcq0Var.f131973b) && wj50.m88271j(this.f131974c, lcq0Var.f131974c) && wj50.m88271j(this.f131975d, lcq0Var.f131975d) && this.f131976e == lcq0Var.f131976e && wj50.m88271j(this.f131977f, lcq0Var.f131977f) && wj50.m88271j(this.f131978g, lcq0Var.f131978g) && this.f131979h == lcq0Var.f131979h && wj50.m88271j(this.f131980i, lcq0Var.f131980i) && this.f131981j == lcq0Var.f131981j;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f131981j) + s571.m77243b(dq60.m36605e((this.f131978g.hashCode() + ((this.f131977f.hashCode() + s571.m77245d(s571.m77243b(s571.m77243b(s571.m77243b(this.f131972a.hashCode() * 31, 31, this.f131973b), 31, this.f131974c), 31, this.f131975d), 31, this.f131976e)) * 31)) * 31, this.f131979h, 31), 31, this.f131980i);
    }
}
