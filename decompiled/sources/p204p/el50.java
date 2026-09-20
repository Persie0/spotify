package p204p;

/* JADX INFO: loaded from: classes5.dex */
@rtz0
public final class el50 {
    public static final dl50 Companion = new dl50();

    /* JADX INFO: renamed from: a */
    public final ee51 f60588a;

    /* JADX INFO: renamed from: b */
    public final ee51 f60589b;

    /* JADX INFO: renamed from: c */
    public final ee51 f60590c;

    /* JADX INFO: renamed from: d */
    public final ee51 f60591d;

    /* JADX INFO: renamed from: e */
    public final String f60592e;

    /* JADX INFO: renamed from: f */
    public final String f60593f;

    /* JADX INFO: renamed from: g */
    public final sv01 f60594g;

    public /* synthetic */ el50(int i, ee51 ee51Var, ee51 ee51Var2, ee51 ee51Var3, ee51 ee51Var4, String str, String str2, sv01 sv01Var) {
        if (37 != (i & 37)) {
            edo.m38617p(i, 37, cl50.f39189a.getDescriptor());
            throw null;
        }
        this.f60588a = ee51Var;
        if ((i & 2) == 0) {
            this.f60589b = null;
        } else {
            this.f60589b = ee51Var2;
        }
        this.f60590c = ee51Var3;
        if ((i & 8) == 0) {
            this.f60591d = null;
        } else {
            this.f60591d = ee51Var4;
        }
        if ((i & 16) == 0) {
            this.f60592e = null;
        } else {
            this.f60592e = str;
        }
        this.f60593f = str2;
        if ((i & 64) == 0) {
            this.f60594g = null;
        } else {
            this.f60594g = sv01Var;
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m39325a() {
        return this.f60592e;
    }

    /* JADX INFO: renamed from: b */
    public final String m39326b() {
        return this.f60593f;
    }

    /* JADX INFO: renamed from: c */
    public final ee51 m39327c() {
        return this.f60589b;
    }

    /* JADX INFO: renamed from: d */
    public final ee51 m39328d() {
        return this.f60591d;
    }

    /* JADX INFO: renamed from: e */
    public final ee51 m39329e() {
        return this.f60588a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof el50)) {
            return false;
        }
        el50 el50Var = (el50) obj;
        return wj50.m88271j(this.f60588a, el50Var.f60588a) && wj50.m88271j(this.f60589b, el50Var.f60589b) && wj50.m88271j(this.f60590c, el50Var.f60590c) && wj50.m88271j(this.f60591d, el50Var.f60591d) && wj50.m88271j(this.f60592e, el50Var.f60592e) && wj50.m88271j(this.f60593f, el50Var.f60593f) && wj50.m88271j(this.f60594g, el50Var.f60594g);
    }

    /* JADX INFO: renamed from: f */
    public final ee51 m39330f() {
        return this.f60590c;
    }

    public final int hashCode() {
        int iHashCode = this.f60588a.hashCode() * 31;
        ee51 ee51Var = this.f60589b;
        int iHashCode2 = (this.f60590c.hashCode() + ((iHashCode + (ee51Var == null ? 0 : ee51Var.hashCode())) * 31)) * 31;
        ee51 ee51Var2 = this.f60591d;
        int iHashCode3 = (iHashCode2 + (ee51Var2 == null ? 0 : ee51Var2.hashCode())) * 31;
        String str = this.f60592e;
        int iM77243b = s571.m77243b((iHashCode3 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f60593f);
        sv01 sv01Var = this.f60594g;
        return iM77243b + (sv01Var != null ? sv01Var.hashCode() : 0);
    }
}
