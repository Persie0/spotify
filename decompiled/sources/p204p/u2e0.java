package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class u2e0 {

    /* JADX INFO: renamed from: a */
    public final String f226075a;

    /* JADX INFO: renamed from: b */
    public final un20 f226076b;

    /* JADX INFO: renamed from: c */
    public final String f226077c;

    /* JADX INFO: renamed from: d */
    public final String f226078d;

    /* JADX INFO: renamed from: e */
    public final String f226079e;

    /* JADX INFO: renamed from: f */
    public final x2e0 f226080f;

    /* JADX INFO: renamed from: g */
    public final String f226081g;

    /* JADX INFO: renamed from: h */
    public final o2e0 f226082h;

    /* JADX INFO: renamed from: i */
    public final f1k f226083i;

    /* JADX INFO: renamed from: j */
    public final boolean f226084j;

    public u2e0(String str, un20 un20Var, String str2, String str3, String str4, x2e0 x2e0Var, String str5, o2e0 o2e0Var, f1k f1kVar, boolean z) {
        this.f226075a = str;
        this.f226076b = un20Var;
        this.f226077c = str2;
        this.f226078d = str3;
        this.f226079e = str4;
        this.f226080f = x2e0Var;
        this.f226081g = str5;
        this.f226082h = o2e0Var;
        this.f226083i = f1kVar;
        this.f226084j = z;
    }

    /* JADX INFO: renamed from: a */
    public final x2e0 m82253a() {
        return this.f226080f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u2e0)) {
            return false;
        }
        u2e0 u2e0Var = (u2e0) obj;
        return wj50.m88271j(this.f226075a, u2e0Var.f226075a) && wj50.m88271j(this.f226076b, u2e0Var.f226076b) && wj50.m88271j(this.f226077c, u2e0Var.f226077c) && wj50.m88271j(this.f226078d, u2e0Var.f226078d) && wj50.m88271j(this.f226079e, u2e0Var.f226079e) && wj50.m88271j(this.f226080f, u2e0Var.f226080f) && wj50.m88271j(this.f226081g, u2e0Var.f226081g) && wj50.m88271j(this.f226082h, u2e0Var.f226082h) && wj50.m88271j(this.f226083i, u2e0Var.f226083i) && this.f226084j == u2e0Var.f226084j;
    }

    public final int hashCode() {
        int iHashCode = this.f226075a.hashCode() * 31;
        un20 un20Var = this.f226076b;
        int iHashCode2 = (iHashCode + (un20Var == null ? 0 : un20Var.hashCode())) * 31;
        String str = this.f226077c;
        int iM77243b = s571.m77243b(s571.m77243b((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f226078d), 31, this.f226079e);
        x2e0 x2e0Var = this.f226080f;
        int iM77243b2 = s571.m77243b((iM77243b + (x2e0Var == null ? 0 : x2e0Var.hashCode())) * 31, 31, this.f226081g);
        o2e0 o2e0Var = this.f226082h;
        return Boolean.hashCode(this.f226084j) + ((this.f226083i.hashCode() + ((iM77243b2 + (o2e0Var != null ? o2e0Var.hashCode() : 0)) * 31)) * 31);
    }
}
