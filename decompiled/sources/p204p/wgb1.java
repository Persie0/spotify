package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class wgb1 {

    /* JADX INFO: renamed from: a */
    public final String f251019a;

    /* JADX INFO: renamed from: b */
    public final String f251020b;

    /* JADX INFO: renamed from: c */
    public final String f251021c;

    /* JADX INFO: renamed from: d */
    public final String f251022d;

    /* JADX INFO: renamed from: e */
    public final String f251023e;

    /* JADX INFO: renamed from: f */
    public final un20 f251024f;

    /* JADX INFO: renamed from: g */
    public final f5u f251025g;

    /* JADX INFO: renamed from: h */
    public final String f251026h;

    public wgb1(String str, String str2, String str3, String str4, String str5, un20 un20Var, f5u f5uVar, String str6) {
        this.f251019a = str;
        this.f251020b = str2;
        this.f251021c = str3;
        this.f251022d = str4;
        this.f251023e = str5;
        this.f251024f = un20Var;
        this.f251025g = f5uVar;
        this.f251026h = str6;
    }

    /* JADX INFO: renamed from: a */
    public final String m88017a() {
        return this.f251021c;
    }

    /* JADX INFO: renamed from: b */
    public final String m88018b() {
        return this.f251020b;
    }

    /* JADX INFO: renamed from: c */
    public final String m88019c() {
        return this.f251023e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wgb1)) {
            return false;
        }
        wgb1 wgb1Var = (wgb1) obj;
        return wj50.m88271j(this.f251019a, wgb1Var.f251019a) && wj50.m88271j(this.f251020b, wgb1Var.f251020b) && wj50.m88271j(this.f251021c, wgb1Var.f251021c) && wj50.m88271j(this.f251022d, wgb1Var.f251022d) && wj50.m88271j(this.f251023e, wgb1Var.f251023e) && wj50.m88271j(this.f251024f, wgb1Var.f251024f) && wj50.m88271j(this.f251025g, wgb1Var.f251025g) && wj50.m88271j(this.f251026h, wgb1Var.f251026h);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(this.f251019a.hashCode() * 31, 31, this.f251020b), 31, this.f251021c);
        String str = this.f251022d;
        int iM77243b2 = s571.m77243b((iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f251023e);
        un20 un20Var = this.f251024f;
        int iHashCode = (iM77243b2 + (un20Var == null ? 0 : un20Var.hashCode())) * 31;
        f5u f5uVar = this.f251025g;
        return this.f251026h.hashCode() + ((iHashCode + (f5uVar != null ? f5uVar.hashCode() : 0)) * 31);
    }
}
