package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class zgb1 implements l630 {

    /* JADX INFO: renamed from: a */
    public final wgb1 f282580a;

    /* JADX INFO: renamed from: b */
    public final String f282581b;

    /* JADX INFO: renamed from: c */
    public final b250 f282582c;

    public zgb1(wgb1 wgb1Var, String str, b250 b250Var) {
        this.f282580a = wgb1Var;
        this.f282581b = str;
        this.f282582c = b250Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zgb1)) {
            return false;
        }
        zgb1 zgb1Var = (zgb1) obj;
        return wj50.m88271j(this.f282580a, zgb1Var.f282580a) && wj50.m88271j(this.f282581b, zgb1Var.f282581b) && wj50.m88271j(this.f282582c, zgb1Var.f282582c);
    }

    @Override // p204p.l630
    public final String getId() {
        return this.f282581b;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f282580a.hashCode() * 31, 31, this.f282581b);
        b250 b250Var = this.f282582c;
        return iM77243b + (b250Var == null ? 0 : b250Var.hashCode());
    }
}
